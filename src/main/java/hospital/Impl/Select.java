package hospital.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import DBconnect.DBconnect;

public class Select {

    public static ArrayList<String> searchPatientById(int patientId) throws ClassNotFoundException, SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<String> foundPatient = new ArrayList<>();

        conn = DBconnect.connectToDatabase();
        String sql = "SELECT * FROM `hospital`.`patient`  WHERE patient_id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, patientId);
        rs = stmt.executeQuery();

        if (rs.next()) {
            do {
                int numberOfColumns = rs.getMetaData().getColumnCount();
                int i = 1;
                while (i <= numberOfColumns) {
                    foundPatient.add(rs.getString(i++));
                }
            } while (rs.next());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum paciente encontrado com o ID " + patientId + "!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
            return null;
        }

        rs.close();
        stmt.close();
        conn.close();

        return foundPatient;
    }

    public static ArrayList<ArrayList<String>> searchPatientByName(String patientName) throws ClassNotFoundException, SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<ArrayList<String>> foundPatients = new ArrayList<>();
        conn = DBconnect.connectToDatabase();
        String sql = "SELECT * FROM `hospital`.`patient` WHERE name LIKE ?";
        stmt = conn.prepareStatement(sql);

        String postMatch = patientName + "%";
        stmt.setString(1, postMatch);
        rs = stmt.executeQuery();

        if (rs.next()) {
            do {
                int numberOfColumns = rs.getMetaData().getColumnCount();
                ArrayList<String> currentRow = new ArrayList<>(numberOfColumns);
                int i = 1;
                while (i <= numberOfColumns) {
                    currentRow.add(rs.getString(i++));
                }
                foundPatients.add(currentRow);
            } while (rs.next());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum resultado correspondente encontrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
            return null;
        }

        rs.close();
        stmt.close();
        conn.close();

        return foundPatients;
    }

    public static ArrayList<ArrayList<String>> displayAll() throws ClassNotFoundException, SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<ArrayList<String>> foundPatients = new ArrayList<>();
        conn = DBconnect.connectToDatabase();
        String sql = "SELECT * FROM `hospital`.`patient`";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        if (rs.next()) {
            do {
                int numberOfColumns = rs.getMetaData().getColumnCount();
                ArrayList<String> currentRow = new ArrayList<>(numberOfColumns);
                int i = 1;
                while (i <= numberOfColumns) {
                    currentRow.add(rs.getString(i++));
                }
                foundPatients.add(currentRow);
            } while (rs.next());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum dado encontrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
            return null;
        }

        rs.close();
        stmt.close();
        conn.close();

        return foundPatients;
    }
}

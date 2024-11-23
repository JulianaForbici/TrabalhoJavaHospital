package hospital.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import DBconnect.DBconnect;

public class Delete {

    public static void deletePatient(int patientId) throws ClassNotFoundException, SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;

        conn = DBconnect.connectToDatabase();
        String sql = "DELETE FROM 'hospital'.'patient' WHERE patient_id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, patientId);

        int affectedRows = stmt.executeUpdate();
        if (affectedRows != 0) {
            JOptionPane.showMessageDialog(null, "Paciente dispensado com sucesso!", "Sucesso", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum paciente com o ID " + patientId + " encontrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }

        stmt.close();
        conn.close();

    }
}

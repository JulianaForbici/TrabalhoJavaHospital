package hospital.main;

import DBconnect.DBconnect;
import hospital.login.Login;

public class App {

	public static void main(String[] args) {
		DBconnect a = new DBconnect();

		Login log=new Login();
        log.setVisible(true); 

	}

}

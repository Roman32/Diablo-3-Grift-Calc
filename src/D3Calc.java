import java.sql.*;

public class D3Calc {

	public static void main(String[] args)throws Exception {
		RiftGUI gui = new RiftGUI();
		gui.setVisible(true);
		createTable();
	}
	
	public static Connection connectToDB(){
		try{
			String driver ="com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/rifts";
			Class.forName(driver);
			//Hard coded for self use.
			String userName="root";
			String password="root";
			Connection conn = DriverManager.getConnection(url,userName,password);
			System.out.println("Connected to DB");
			return conn;
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}
	
	public static void createTable() throws Exception{
		try{
			Connection conn =connectToDB();
			PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS rift(Id INT NOT NULL AUTO_INCREMENT, Level INT NOT NULL, Toon VARCHAR(25), Class VARCHAR(5) NOT NULL, Time VARCHAR(10) NOT NULL, PRIMARY KEY(Id))");
			create.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

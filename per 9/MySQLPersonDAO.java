/**
* File 		: MySQLPersonDAO.java
* Deskripsi : implementasi PersonDAO untuk MySQL
* Nama		: Maulana Pasya Zefanya
* NIM		: 24060121140175
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLPersonDAO implements PersonDAO{
	public void savePerson(Person person) throws Exception{
		String name = person.getName();
		
		//membuat koneksi, nama, db, user, password, menyesuaikan
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/namaDatabase?serverTimezone=UTC","root","");
		
		//kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES('"+name+"')";
		System.out.println(query);
		Statement s = con.createStatement();
		s.executeUpdate(query);
		
		//tutup koneksi database
		con.close();
	}
}
/**
* File 		: MainDAO.java
* Deskripsi : Main program untuk akses DAO
* Nama		: Maulana Pasya Zefanya
* NIM		: 24060121140175
*/

public class MainDAO{
	public static void main(String args[]){
		Person person = new Person("Indra");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
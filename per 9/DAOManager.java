/**
* File 		: DAOManager.java
* Deskripsi : pengelola DAO dalam program
* Nama		: Maulana Pasya Zefanya
* NIM		: 24060121140175
*/

public class DAOManager{
	private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}
	
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}
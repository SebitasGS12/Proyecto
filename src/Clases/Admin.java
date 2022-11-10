package Clases;

public class Admin {

	private String ID_Admin ;
	private int dni;

	//Constructor
	
	public Admin(String iD_Admin, int dni) {
		ID_Admin = iD_Admin;
		this.dni = dni;
		
	}

	//Getters y Setters
	
	public String getID_Admin() {
		return ID_Admin;
	}

	public int getDni() {
		return dni;
	}

	public void setID_Admin(String iD_Admin) {
		ID_Admin = iD_Admin;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	
	
}

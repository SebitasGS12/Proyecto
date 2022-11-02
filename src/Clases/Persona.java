package Clases;

public class Persona {
	//Atributos Privados
	private int DNI;
	private String Nombre;
	private String Apellidos;
	private String Correo;
	private int Edad;
	
	//Constructor
	public Persona(int dNI, String nombre, String apellidos, String correo, int edad) {
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Correo = correo;
		Edad = edad;
	}
	
	//Getters and Setters

	public int getDNI() {
		return DNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public String getCorreo() {
		return Correo;
	}

	public int getEdad() {
		return Edad;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
	
}

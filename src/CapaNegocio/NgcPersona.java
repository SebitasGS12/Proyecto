package CapaNegocio;


import Clases.Persona;
import Datos.clsConexionPersona;


public class NgcPersona {

	private clsConexionPersona ObjPersona;
	
	public NgcPersona() {
		ObjPersona = new clsConexionPersona();
	}
	
	public Persona BuscarDNI(int Dni){
		return ObjPersona.BuscarPersona(Dni);
	}
}

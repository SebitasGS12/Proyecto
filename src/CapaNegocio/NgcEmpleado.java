package CapaNegocio;

import java.util.ArrayList;

import Clases.Empleado;
import Datos.clsConexionVendedores;

public class NgcEmpleado {

	private clsConexionVendedores ObjEmp;
	
	
	public NgcEmpleado() {
		ObjEmp = new clsConexionVendedores();
	}
	
	public ArrayList<Empleado> Lista() {
		return ObjEmp.ListarVendedores();
	}

	public Empleado BuscarID(String cod){
		return ObjEmp.BuscarEmpleado(cod);
	}
	public Empleado BuscarDNI(int Dni){
		return ObjEmp.BuscarEmpleado(Dni);
	}
}

package Datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Empleado;

public class clsConexionVendedores {

	// Campos o Atributos
	private String Driver = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://localhost:3306/bd_gci";
	private String Usuario = "root";
	private String Clave = "mysql";
	private static Connection cn; // Conexi�n Java - MySQL
	private Statement cmd; // Comando SQL
	private ResultSet rs; // Contenedor de filas
	private CallableStatement pa; // Uso de Store Procedure
	private ArrayList<Empleado> Lista;
	
	
	
	//Metodo Constructor
	public clsConexionVendedores() {
		try {
			Class.forName(Driver);
			cn = DriverManager.getConnection(URL, Usuario, Clave);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Metodo Listar
	
	public ArrayList<Empleado> ListarVendedores(){
		
		Lista = new ArrayList<>();
		String SQL = "call ListarVendedores()";
		try {
			pa = cn.prepareCall(SQL);
			rs = pa.executeQuery();
			while (rs.next()) {
				Empleado ObjA = new Empleado(
						rs.getString("ID_Emp"),
						rs.getString("Puesto"),
						rs.getInt("DNI_Emp"),
						rs.getString("nombrePersona"),
						rs.getString("apellidosPersona")
						);
				Lista.add(ObjA);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage() );
		}
		return Lista;
	}
	
	public Empleado BuscarEmpleado(String id) {
		Empleado ObjE = null;
		
		try {
			pa = cn.prepareCall("call BuscarVendedoresID(?)");
			pa.setString(1, id);
			rs = pa.executeQuery();
			if (rs.next()) {
				ObjE = new Empleado(
						rs.getString("ID_Emp"),
						rs.getString("Puesto"),
						rs.getInt("DNI_Emp"),
						rs.getString("nombrePersona"),
						rs.getString("apellidosPersona")
						);
				}
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ObjE;
		
	}
	
	public Empleado BuscarEmpleado(int dni) {
		Empleado ObjE = null;
		
		try {
			pa = cn.prepareCall("call BuscarVendedoresDNI(?)");
			pa.setInt(1, dni);
			rs = pa.executeQuery();
			if (rs.next()) {
				ObjE = new Empleado(
						rs.getString("ID_Emp"),
						rs.getString("Puesto"),
						rs.getInt("DNI_Emp"),
						rs.getString("nombrePersona"),
						rs.getString("apellidosPersona")
						);
				}
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ObjE;
		
	}
	
	
	
	
	
	
	
	
	
}

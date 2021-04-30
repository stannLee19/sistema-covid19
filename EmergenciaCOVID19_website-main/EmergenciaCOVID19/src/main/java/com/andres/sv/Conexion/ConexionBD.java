package com.andres.sv.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

	private Connection coonec;

	public ConexionBD() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			coonec = DriverManager.getConnection("jdbc:mysql://localhost/emergenciacovid19", "root", "root");
			System.out.println("> ¡Conexión a la base de datos Éxitosa!");

		} catch (Exception e) {
			System.out.println("> ¡Error en la conexión! " + e);
		}
	}

	public Connection RetornarConexion() {
		return coonec;
	}
}

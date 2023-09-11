package com.dellead.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public abstract class IDao {
	
	Connection con;
	PreparedStatement stmt;

	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina_aula3?serverTimezone=UTC", "root", "root");		
	}

	public void close() throws Exception {
		con.close();		
	}
}

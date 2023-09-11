package com.dellead.persistence;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;

import com.dellead.model.Peca;


public class PecaDao extends IDao {
	
	public void create(Peca peca) throws Exception {
		open();
		String sql = "insert into peca values(null, ?, ?, ?, ?)";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, peca.getTipo());
		stmt.setString(2, peca.getMarca());
		stmt.setInt(3, peca.getQuantidade());
		stmt.setDouble(4, peca.getValor());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public List<Peca> findAll() throws Exception {
		open();
		List<Peca> pecas = new ArrayList<Peca>();		
		String sql = "select * from peca";
		stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			Peca peca = new Peca(rs.getInt("id"), rs.getString("tipo"), rs.getString("marca"), rs.getInt("quantidade"), rs.getDouble("valor"));
			pecas.add(peca);			
		}
			
		stmt.close();
		close();	
		return pecas;
	}
}

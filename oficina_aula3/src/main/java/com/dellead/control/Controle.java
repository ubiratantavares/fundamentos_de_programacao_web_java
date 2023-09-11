package com.dellead.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dellead.model.Peca;
import com.dellead.persistence.PecaDao;

@WebServlet("/Controle")
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controle() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}
	
	protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flag = request.getParameter("flag");
		
		if (flag.equalsIgnoreCase("cadastrar")) {
			cadastrar(request, response);
		} else if (flag.equalsIgnoreCase("listar")) {
			listar(request, response);
		} else {
			response.getWriter().print("Erro na flag!");
		}
	}
	
	protected void cadastrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String tipo = request.getParameter("tipo");
			String marca = request.getParameter("marca");
			Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
			Double valor = Double.parseDouble(request.getParameter("valor"));
			
			Peca peca = new Peca(null, tipo, marca, quantidade, valor);
			
			PecaDao pecaDao = new PecaDao();
			
			pecaDao.create(peca);
			
			request.setAttribute("msg", "Peça cadastrada com sucesso.");
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
	}

	protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {			
			PecaDao pecaDao = new PecaDao();
			List<Peca> pecas = pecaDao.findAll();
			request.setAttribute("pecas", pecas);
			request.getRequestDispatcher("consulta.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
	}
}

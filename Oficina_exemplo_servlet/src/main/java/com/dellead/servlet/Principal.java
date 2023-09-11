package com.dellead.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Principal")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Principal() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
		String nome = request.getParameter("nome");
	    String idade = request.getParameter("idade");
	    String sexo = request.getParameter("sexo");
	    String email = request.getParameter("email");
	    String melhorias = request.getParameter("melhorias");

		PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<body>");
	    out.println("Bem-vindo, " + nome + "< br />");
	    out.println("</body>");
	    out.println("</html>");

	}

}

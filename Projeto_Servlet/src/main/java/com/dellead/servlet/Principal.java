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

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        
        // pegando os parâmetros do request
        String nome = request.getParameter("pesquisa");
       
        if(nome.equals("java")) {
        	out.println("<html>");
            out.println("<body>");
            out.println("Redirecionando para assuntos relacionados a " + nome);        
            out.println("</body>");
            out.println("</html>");
        } else if(nome.equals("servlet")) {
        	out.println("<html>");
            out.println("<body>");
            out.println("Redirecionando para assuntos relacionados a " + nome);        
            out.println("</body>");
            out.println("</html>");
        } else {
        	out.println("<html>");
            out.println("<body>");
            out.println("Não temos este assunto em nossa página");        
            out.println("</body>");
            out.println("</html>");
        }        
	}
}

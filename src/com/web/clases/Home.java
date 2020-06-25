package com.web.clases;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/clase")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Sets the content type of the response
        response.setContentType("text/html");
        // writes the response
        PrintWriter out = response.getWriter();
        out.write("<h1>llamado al Get</h1>");
        
        String sParametro = request.getParameter("nombre");
        String sEdad = request.getParameter("edad");
        
        if(null==sParametro && sParametro.equals("")) {
        	sParametro="0";
        }
        
		response.getWriter().append("Served at: "+sParametro+" - "+sEdad+ " -  ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Sets the content type of the response
        response.setContentType("text/html");
        // writes the response
        PrintWriter out = response.getWriter();
        out.write("<h1>llamado a Get desde Post</h1>");
        
        String sParametroPost = request.getParameter("apellido");
        response.getWriter().append("Served at Post: "+sParametroPost+" -  ");
		//doGet(request, response);
	}

}

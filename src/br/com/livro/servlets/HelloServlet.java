package br.com.livro.servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        	
    	
        //	resp.getWriter().print("Ola Mundo, tudo bem?? ");   <--- Apenas exibir a mensagem no browser
        	
    	String nome = req.getParameter("nome");                         //      <-- Passagem de parametro Via URL... // GET
    	String sobrenome = req.getParameter("sobrenome");
    	resp.getWriter().print("Ola Mundo " + nome + " " + sobrenome);
   }
    

    
    	 @Override
    	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    			    throws ServletException, IOException {   
    		 
    			  String nome = req.getParameter("nome");                             //  <-- Passagem de Parametros via formulario... // POST
    			    String sobrenome = req.getParameter("sobrenome");
    		  	resp.getWriter().print("Ola " + nome + " " + sobrenome);
    	 }
    	 
    	 
    	 @Override
         protected void doPut(HttpServletRequest req, HttpServletResponse resp)
        		    throws ServletException, IOException {
    		 resp.getWriter().print("Ola PUT");

    		 
    		 
    		 
    	 } 
         @Override
         protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
        		    throws ServletException, IOException {
        	 resp.getWriter().print("Ola DELETE");
    	
        }
    }


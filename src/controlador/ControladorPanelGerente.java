package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dto.Usuario;

@WebServlet("/ControladorPanelGerente")
public class ControladorPanelGerente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControladorPanelGerente() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false); //debe ser false por la autenticacion
		if(session!= null)
		{
			request.getRequestDispatcher("/Vista/PanelControlGerente.ftl").forward(request, response);
		}else
		{
			System.out.print("Por favor login primero");
			RequestDispatcher rd= request.getRequestDispatcher("/Vista/login.ftl");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

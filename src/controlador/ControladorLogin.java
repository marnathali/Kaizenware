package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dto.Usuario;

import modelo.servicios.ServicioUsuarios;

@WebServlet("/ControladorLogin")
public class ControladorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	private ServicioUsuarios servicioUsuario;

    public ControladorLogin() {
        super();
        this.servicioUsuario = ServicioUsuarios.getInstancia();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/Vista/login.ftl").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user = request.getParameter("Usuario");
		String pass = request.getParameter("Contrasena");
		
		Usuario usuario = servicioUsuario.validarUsuario(user, pass) ;
		if (usuario==null)
		{
			System.out.println("usuario no encontrado");
			request.getRequestDispatcher("/Vista/login.ftl").forward(request, response);
		}
		else 
		{
			//System.out.println("Bienvenido"+ usuario.getNombre_usuario());
			if(usuario.getRol().getId() == 1 || usuario.getRol().getId() == 2) 
			{
				HttpSession session=request.getSession();
				session.setAttribute("user", usuario);
				request.getRequestDispatcher("PanelGerente").forward(request, response);
			}
			else if (usuario.getRol().getId() == 3)
			{
				HttpSession session=request.getSession();
				session.setAttribute("user", usuario);
				request.getRequestDispatcher("/Vista/PanelControlEmpleado.ftl").forward(request, response);
			}	
		}		
	}

}

package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dto.Candidato;
import modelo.dto.Pais;
import modelo.dto.Usuario;
import modelo.servicios.ServicioCandidatos;
import modelo.servicios.ServicioUsuarios;

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public IndexServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicioCandidatos serviCandidatos = ServicioCandidatos.getInstancia();
		Candidato candidato = serviCandidatos.getCandidatoPorId(3);
		System.out.println(candidato);
		
//		ServicioUsuarios serviUsua = ServicioUsuarios.getInstancia();
//		Usuario usu = serviUsua.getUsuarioPorId(1);
//		System.out.println(usu.getNombre_usuario());
			request.getRequestDispatcher("/index.ftl").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

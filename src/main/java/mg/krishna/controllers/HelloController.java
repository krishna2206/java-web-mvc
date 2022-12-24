package mg.krishna.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mg.krishna.models.HelloModel;

public class HelloController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Récupère les données du modèle
        HelloModel model = new HelloModel();
        String data = model.getData();

        // Stocke les données dans l'objet request
        request.setAttribute("data", data);

        // Affiche la vue
        request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
    }
}
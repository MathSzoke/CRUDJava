package controller;

import java.io.IOException;

@WebServlet(urlPatterns = { "/Controller", "/main" })
public class Controller extends HttpServlet {
    private static final long servialVersionUID = 1L;
    DAO dao = new DAO();

    public Controller() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse responde)
            throws ServletException, IOException {
        Strying action = request.getServletPath();
        System.out.println(action);
        if (action.equals("/main")) {
            contatos(request, responde);
    }
}
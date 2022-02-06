import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ResourceBundle;

public class IdendityExample extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bonjour!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bonjour Rudy Hneine!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
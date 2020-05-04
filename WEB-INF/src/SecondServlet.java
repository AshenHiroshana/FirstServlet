
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.*;

public class SecondServlet extends GenericServlet{

    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
        res.getWriter().print("<h1>Welcome To Second Servlet</h1>");
    }
}
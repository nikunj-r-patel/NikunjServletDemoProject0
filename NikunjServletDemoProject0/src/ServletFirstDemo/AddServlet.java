package ServletFirstDemo;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse responce) throws IOException {
		int a= Integer.parseInt(request.getParameter("num1"));
		int b= Integer.parseInt(request.getParameter("num2"));
		int c=a+b;
		System.out.println("the sum of two nums is: "+c);
		responce.getWriter().println("the sum of two nums is: "+c);
	}
}

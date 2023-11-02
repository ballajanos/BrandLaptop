package laptop;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{

	protected void doGet(HttpServletRequestWrapper req, HttpServletResponse res) throws ServletException, IOException{
	
	String brand=req.getParameter("DELL");
	
	req.setAttribute("BrandName", brand);
	
	req.getRequestDispatcher("laptop.jsp").forward(req, res);
	}
	
}

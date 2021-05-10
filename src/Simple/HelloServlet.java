package Simple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import Simple.ServletConfig;
//import hello.ServletRequest;
//import hello.ServletResponse;

import java.io.OutputStream;
import javax.servlet.*;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	public void init (ServletConfig arg0 ) throws ServletException{
		System.out.println("---------------init-----------");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
		throws ServletException, IOException{
		System.out.println("-----------service--------------");
		OutputStream out=response.getOutputStream();
		out.write(("<h1>hello servlet!!!</h1>").getBytes());
		out.close();
	}
	@Override
	public void destroy() {
		System.out.println("----------destroy-------");
		
	}
	

}

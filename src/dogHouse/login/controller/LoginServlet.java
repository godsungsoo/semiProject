package dogHouse.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("-----------연결연결연결----------");
        System.out.println("하하하하하하하");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //String f = request.getParameter("f");
        //String s = request.getParameter("s");
        
       // int firstNumber = Integer.parseInt(f);
       // int secondNumber = Integer.parseInt(s);
        
       // int additionResult = firstNumber + secondNumber;
        
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login/login.jsp");
       // request.setAttribute("f", firstNumber);
        //request.setAttribute("s", secondNumber);
        //request.setAttribute("addResult", additionResult);
        rd.forward(request, response);   

	}

}

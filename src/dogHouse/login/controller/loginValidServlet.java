package dogHouse.login.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sun.javafx.collections.MappingChange.Map;




/**
 * Servlet implementation class loginValidServlet
 */
@WebServlet("/loginValid.do")
public class loginValidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginValidServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String param = request.getParameter("data");
		
		Gson gson = new Gson();
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap = gson.fromJson(param, paramMap.getClass());
		
		System.out.println(paramMap.get("userId"));
		System.out.println(paramMap.get("userPwd"));
		
		//로그인 성공시 메인으로
		if(paramMap.get("userId").equals("test")) {
			System.out.println("아이디가 test");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/main/main.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("else");
			response.getWriter().append("fail");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login/login.jsp");
		}
	}

}

package servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/makesession"})
public class SessionMakeServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//session 생성
		HttpSession session = request.getSession();
		
		session.setAttribute("userId", "sgr"); //object(String)
		int[] intArray = {1, 2, 3, 4, 5};
		session.setAttribute("intArray", intArray); //array
		
		String[] strArray = {"A", "B", "C"};
		List<String> strList = Arrays.asList(strArray);
		session.setAttribute("strList", strList); //collection
		
		System.out.println("session Create & attribute added");
		response.getWriter().append("Session Used");
		
	}
}

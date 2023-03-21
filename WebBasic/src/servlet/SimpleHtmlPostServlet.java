package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dto.UserDto;

@WebServlet("/SimpleHtmlPostServlet")
public class SimpleHtmlPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userEmail = request.getParameter("userEmail");
		String userPwd = request.getParameter("userPwd");
		System.out.println("userEmail : " + userEmail);
		System.out.println("userPwd : " + userPwd);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html><body>");

		if( userEmail.equals("ssafy@ssafy.com") && userPwd.equals("1234") ) {
			sb.append("<h1>로그인 성공</h1>");	
		}else {
			sb.append("<h1>로그인 실패</h1>");	
		}
		
		sb.append("</body></html>");
		
//		response.addHeader("Access-Control-Allow-Origin", "*"); // VSCode Live Server Request
		
//		response.setContentType("application/json; charset=utf-8"); // 아래 코드 대신 이걸로 처리하면 json 문자열로 처리한다.
		response.setContentType("text/html; charset=utf-8"); // 
		response.getWriter().write(sb.toString());		
	}
}

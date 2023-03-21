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

@WebServlet("/SimpleHtmlGetObjectServlet")
public class SimpleHtmlGetObjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userEmail = request.getParameter("userEmail");
		System.out.println(userEmail);
		
		UserDto userDto = new UserDto(1111, "홍길동", "hong@mail.com");

		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><style> span { padding: 10px; }</style></head><body>");
		sb.append("<div><span>")
			.append(userDto.getUserSeq()).append("</span><span>")
			.append(userDto.getUserName()).append("</span><span>")
			.append(userDto.getUserEmail()).append("</span></div>")
			.append("</body></html>");

		response.addHeader("Access-Control-Allow-Origin", "*"); // VSCode Live Server Request
		// text/html 도 가능하지만, content-type을 명료하게 하는 게 더 좋다.
		// 한글 처리를 위해 charset 필요

		response.setContentType("text/html; charset=utf-8"); // 
		response.getWriter().write(sb.toString());
	}
}

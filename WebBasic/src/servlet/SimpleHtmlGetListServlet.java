package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UserDto;

// 비동기 요청 X
// HTML response
@WebServlet("/SimpleHtmlGetListServlet")
public class SimpleHtmlGetListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<UserDto> userList = new ArrayList<>();
		userList.add(new UserDto(111, "홍길동", "hong@gildong.com"));
		userList.add(new UserDto(222, "이길동", "lee@gildong.com"));
		userList.add(new UserDto(333, "삼길동", "sam@gildong.com"));
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><style>span { padding: 10px; }</style></head><body>");
		userList.forEach( userDto -> {
			sb.append("<div><span>")
				.append(userDto.getUserSeq()).append("</span><span>")
				.append(userDto.getUserName()).append("</span><span>")
				.append(userDto.getUserEmail()).append("</span></div>");
		});
		sb.append("</body></html>");
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append(sb.toString());
	}
}

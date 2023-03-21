package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/removecookie"})
public class CookieRemoveServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Cookie 생성 => 삭제
		Cookie c1 = new Cookie("c1","v1"); //javax.servlet.http.Cookie;
		c1.setPath("/"); // 내려줄 때만 의미가 있음. Cookie를 브라우저로부터 읽은 후에 getPath()는 의미가 없음
		c1.setMaxAge(0);
		response.addCookie(c1); // Response Header : Set-Cookie를 이용
		
		response.getWriter().append("Check Cookie");
		
	}
}

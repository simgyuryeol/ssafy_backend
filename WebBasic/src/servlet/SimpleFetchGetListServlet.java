package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dto.UserDto;

@WebServlet("/SimpleFetchGetListServlet")
public class SimpleFetchGetListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// json response
		ArrayList<UserDto> userList = new ArrayList<>();
		userList.add(new UserDto(111, "홍길동", "hong@gildong.com"));
		userList.add(new UserDto(222, "이길동", "lee@gildong.com"));
		userList.add(new UserDto(333, "삼길동", "sam@gildong.com"));
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(userList);
		
		response.setContentType("application/json; charset=utf-8"); // 내려주는  content 가 json 임을 표현한다.
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		response.getWriter().append(jsonStr);
		System.out.println(jsonStr);
	}
}

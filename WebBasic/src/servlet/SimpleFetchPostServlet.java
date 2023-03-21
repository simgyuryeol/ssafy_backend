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

@WebServlet("/SimpleFetchPostServlet")
public class SimpleFetchPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userEmail = request.getParameter("userEmail");
		String userPwd = request.getParameter("userPwd");
		System.out.println("userEmail : " + userEmail);
		System.out.println("userPwd : " + userPwd);
		
		// #1 JsonObject
//		Gson gson = new Gson();
//		JsonObject jsonObject = new JsonObject();
//		
//		if( userEmail.equals("ssafy") && userPwd.equals("1234") ) {
//			jsonObject.addProperty("result", "success");
//		}else {
//			jsonObject.addProperty("result", "fail");
//		}
//		
//		String jsonStr = gson.toJson(jsonObject);
		
		// #2 Map
		Gson gson = new Gson();		
		Map<String, String> map = new HashMap<>();
		
		if( userEmail.equals("ssafy@ssafy.com") && userPwd.equals("1234") ) {
			map.put("result", "success");			
		}else {
			map.put("result", "fail");
		}
		
		String jsonStr = gson.toJson(map);
		
		response.addHeader("Access-Control-Allow-Origin", "*"); // VSCode Live Server Request
		
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().write(jsonStr);		
		System.out.println("SimpleJsonListServlet jsonStr : " + jsonStr);
	}
}

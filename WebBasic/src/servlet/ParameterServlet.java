package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dto.UserDto;


@WebServlet("/params")
public class ParameterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	request.setCharacterEncoding("utf-8"); //get은 필요 x //request 한글
    	response.setContentType("text/html; charset=utf-8"); //response 한글
    	
    	String username = request.getParameter("username");
    	System.out.println("username :" + username);
    	
    	String age = request.getParameter("age");
    	System.out.println("age :" + age);
    	
    	response.getWriter().append("username :" + username);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8"); //get은 필요 x //request 한글
    	response.setContentType("text/html; charset=utf-8"); //response 한글
    	
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	String[] hobby = request.getParameterValues("hobby");
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("username : ").append(username).append("password : ").append(password);
    	
    	sb.append("hobby : ");
    	for(String h: hobby) {
    		sb.append(" ").append(h);
    	}
    	
    	System.out.println(sb);
    	
    	response.getWriter().append(sb);
    	}
    
    
}

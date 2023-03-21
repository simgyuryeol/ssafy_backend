package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//forward, sendRedirect
// forward는 request, response를 그대로 다음 서버 모듈에 전달
// MaintainDataServelet => MainTainDataServlet2 과정에서 앞 모듈이 뒤 모듈에게 전달하려는 data가 있을 수 있다.
// 그 data를 담아야 하는데 그 구조에 대해서 학습
@WebServlet("/maintain2")
public class MaintainDataServlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	// 각 저장소에 담긴 데이터를 꺼내서 출력
    	String attr1 = (String) request.getAttribute("attr1"); //object 타입 캐스팅
    	String attr2 = (String) getServletContext().getAttribute("attr2"); //object 타입 캐스팅
    	String attr3 = (String) request.getSession().getAttribute("attr3"); //object 타입 캐스팅
    	
    	System.out.println("atrr1 : " + attr1);
    	System.out.println("atrr2 : " + attr2);
    	System.out.println("atrr3 : " + attr3);
    	
    	response.getWriter().append("MaintainDataServlet2");
    }
}

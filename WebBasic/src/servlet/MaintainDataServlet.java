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
@WebServlet("/maintain")
public class MaintainDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	// 파라미터 등 데이터를 읽었다 또는 DB로 부터 읽었다고 가정
    	
    	//request에 담는다.
    	request.setAttribute("attr1", "value1"); //주의!!! String, Object
    	
    	//ServleContext 서블릿이 공유하는 공간
    	getServletContext().setAttribute("attr2", "value2");
    	
    	//session에 담는다.(사용자 별로)
    	request.getSession().setAttribute("attr3", "value3");
    	
    	//forward => server 내 이동(Contextpath 필요 x)
    	//request.getRequestDispatcher("/maintain2").forward(request, response);
    	
    	//forwarding 과정에서 request가 살아 있고 forwarding이 끝나면 request가 종료된다.
    	//forwarding 과정에서만 필요한 데이터는 request에 담는 것이 올바른 방법!
    	
    	//sendRedirect => browser가 재접속(ContextPath 필요)
    	// request는 새로 request를 받기 때문에 sendRedirect하면 사라진다. session과 servletcontext는 남아 있다.
    	response.sendRedirect("/WebBasic/maintain2");
    			
    }
}

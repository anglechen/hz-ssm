/**
 *
 */
package cn.dw.hz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author aubrey
 * @date  下午2:38:26
 * 
 */
//@WebServlet("/test")
public class TestServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter print = resp.getWriter();
//		print.write("hello");
		resp.getWriter().write("hello");
	}
	
	
	
	
	
	
	
	

}

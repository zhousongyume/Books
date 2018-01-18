package org.java.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.java.service.bookServiceDao;
import org.java.service.bookServiceDaolmpl;
@WebServlet("/delBook")
public class DeleteService extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter out =resp.getWriter();
		//获取传递过来的用户名
		Long book =Long.parseLong((req.getParameter("userbook")));
		//创建业务逻辑层对象
		bookServiceDao  bk =new bookServiceDaolmpl();
		//删除
		bk.delBook(book);
		//删除就不返回
		out.write("true");

	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
		super.doGet(req, resp);
	}
	
}




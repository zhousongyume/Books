package org.java.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.dao.bookDao;
import org.java.dao.impl.bookDaolmpl;
import org.java.entity.book;

@WebServlet("/show")
public class ShowServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				//创建图书接口对象
				bookDao JK =new bookDaolmpl();
				//查询所有的用户信息
				List<book> list=JK.SelectAll();
				//将集合放入request区域中
				req.setAttribute("list", list);
				//转发到JSP页面
				req.getRequestDispatcher("show.jsp").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		super.doPost(req, resp);
	}

}

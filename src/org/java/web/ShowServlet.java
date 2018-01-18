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
				//����ͼ��ӿڶ���
				bookDao JK =new bookDaolmpl();
				//��ѯ���е��û���Ϣ
				List<book> list=JK.SelectAll();
				//�����Ϸ���request������
				req.setAttribute("list", list);
				//ת����JSPҳ��
				req.getRequestDispatcher("show.jsp").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		super.doPost(req, resp);
	}

}

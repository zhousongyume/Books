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
		//��ȡ���ݹ������û���
		Long book =Long.parseLong((req.getParameter("userbook")));
		//����ҵ���߼������
		bookServiceDao  bk =new bookServiceDaolmpl();
		//ɾ��
		bk.delBook(book);
		//ɾ���Ͳ�����
		out.write("true");

	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
		super.doGet(req, resp);
	}
	
}




package org.java.service;

import java.util.List;

import org.java.dao.bookDao;
import org.java.dao.impl.bookDaolmpl;
import org.java.entity.book;
			/**
			 * ͼ����Ϣҵ���߼�ʵ����
			 */
public class bookServiceDaolmpl implements bookServiceDao{

	//����bookDao����ʵ�ַ�������
	bookDao FanHui =new bookDaolmpl();
	
	public List<book> SelectAll() {
		
			//����bookDao��ѯ����
		return FanHui.SelectAll();
	}

	
	public void addbook(book b) {
		//����bookDao��ӷ���
		FanHui.addbook(b);
		
	}


	public void delBook(Long b_id) {
		
				//����bookDaoɾ������
				FanHui.delBook(b_id);
	}

}

package org.java.service;

import java.util.List;

import org.java.entity.book;
		/**
		 * ͼ����Ϣҵ���߼�ʵ�ֽӿ�
		 */
public interface bookServiceDao {
	
		/**
		 * ��ѯ���е�ͼ����Ϣ
		 */
		List <book>SelectAll();
		/**
		 * ����µ�ͼ����Ϣ
		 */
		void addbook(book b);
		
		/**
		 * ɾ��ͼ����Ϣ
		 */
		void delBook(Long b_id);
}

package org.java.dao;

import java.util.List;

import org.java.entity.book;

/**
 * 
 * @return ͼ����Ϣʵ����Ľӿ���
 *
 */
public interface bookDao {
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

package org.java.dao;

import java.util.List;

import org.java.entity.book;

/**
 * 
 * @return 图书信息实体类的接口类
 *
 */
public interface bookDao {
	/**
	 * 查询所有的图书信息
	 */
	List <book>SelectAll();
	/**
	 * 添加新的图书信息
	 */
	void addbook(book b);
	/**
	 * 删除图书信息
	 */
	void delBook(Long b_id);
}

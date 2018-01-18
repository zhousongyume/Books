package org.java.service;

import java.util.List;

import org.java.entity.book;
		/**
		 * 图书信息业务逻辑实现接口
		 */
public interface bookServiceDao {
	
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

package org.java.service;

import java.util.List;

import org.java.dao.bookDao;
import org.java.dao.impl.bookDaolmpl;
import org.java.entity.book;
			/**
			 * 图书信息业务逻辑实现类
			 */
public class bookServiceDaolmpl implements bookServiceDao{

	//创建bookDao对象，实现方法调用
	bookDao FanHui =new bookDaolmpl();
	
	public List<book> SelectAll() {
		
			//返回bookDao查询方法
		return FanHui.SelectAll();
	}

	
	public void addbook(book b) {
		//返回bookDao添加方法
		FanHui.addbook(b);
		
	}


	public void delBook(Long b_id) {
		
				//返回bookDao删除方法
				FanHui.delBook(b_id);
	}

}

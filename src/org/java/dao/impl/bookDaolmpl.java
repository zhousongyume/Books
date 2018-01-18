package org.java.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.java.dao.BaseDao;
import org.java.dao.bookDao;
import org.java.entity.book;

/**
 * 
 * @return ͼ����Ϣʵ����Ľӿ�ʵ����
 *
 */
public class bookDaolmpl extends BaseDao implements bookDao {

			/**
			 * ��ѯ���е�ͼ����Ϣ
			 */
	public List<book> SelectAll() {
		//�������϶�����в�ѯ����
		List<book> list=new ArrayList<book>();
		String sql="SELECT*FROM bookmanage";
		Object[]params=null;
		super.rs=super.getResultSet(sql, params);
		try {
			while(rs.next()){
				book k =new book();
				k.setB_id(rs.getLong(1));
				k.setB_name(rs.getString(2));
				k.setB_author(rs.getString(3));
				k.setDatatime(rs.getDate(4));
				k.setB_type(rs.getInt(5));
				//��ӵ�������
				list.add(k);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

		/**
		 * ����µ�ͼ����Ϣ
		 */
	public void addbook(book b) {
		String sql="INSERT INTO bookmanage(b_name,b_author,b_time,b_type) VALUES(?,?,?,?)";
		Object[]params={b.getB_name(),b.getB_author(),b.getDatatime(),b.getB_type()};
		super.update(sql, params);
		
	}

		/**
		 * ɾ��ͼ����Ϣ
		 */
	public void delBook(Long b_id) {
		String sql="DELETE FROM bookmanage WHERE b_id=?";
		Object[]params={b_id};
		super.update(sql, params);
		
	}


}

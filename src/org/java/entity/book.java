package org.java.entity;

import java.sql.Date;

/**
 * 
 * @return ͼ����Ϣʵ����
 *
 */
public class book {
	private  Long b_id;			//ͼ����
	private  String b_name;		//ͼ������
	private  String b_author;	//ͼ������
	private  Date datatime;		//ͼ�鹺��ʱ��
	private  Integer b_type;	//ͼ�����
	
	public Long getB_id() {
		return b_id;
	}
	public void setB_id(Long b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_author() {
		return b_author;
	}
	public void setB_author(String b_author) {
		this.b_author = b_author;
	}
	public Date getDatatime() {
		return datatime;
	}
	
		
	
	public Integer getB_type() {
		return b_type;
	}
	public void setB_type(Integer b_type) {
		this.b_type = b_type;
	}
	public void setDatatime(Date date) {
		this.datatime = date;
	}

}

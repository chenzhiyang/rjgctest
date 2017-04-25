package dao;

import java.sql.SQLException;

import model.SupplierModel;

public class SupplierDao{
	String sql = "";
	
	/*商家登录用户和密码判断*/
	public boolean SLoginCheck(SupplierModel supplier) throws SQLException {
		boolean i = false;
		//验证supplier表中是否有输入的商家
		return i;
	}
	
	/*获取完整商家对象*/
	public SupplierModel getSupplier(SupplierModel supplier) throws SQLException {
		//根据用户名从supplier表中获取完整商家对象
		return supplier;
	}
}

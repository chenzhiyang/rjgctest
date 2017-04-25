package service;

import java.sql.SQLException;

import model.SupplierModel;

public class SupplierService {
	public boolean SLoginInfoCheck(String Suppliername,String SupplierPassword) throws SQLException {
		boolean i = false;
		SupplierModel supplier=new SupplierModel();
		//调用SupplierDao中的SLoginCheck方法，验证supplier表中是否有输入的商家
		return i;
	}
	
	public SupplierModel getSupplierByName(String Suppliername) throws SQLException {
		SupplierModel supplier=new SupplierModel();
		//把Suppliername加入supplier对象中
		//调用SupplierDao的getSupplier(SupplierModel supplier)方法获取完整商家对象
		return supplier;
	}
}

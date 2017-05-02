package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SupplierModel;

public class SupplierDao{
	String sql = "";
	private Connection conn;
	/*�̼ҵ�¼�û��������ж�*/
	public boolean SLoginCheck(SupplierModel supplier) throws SQLException {
		boolean i = false;
		conn=GetConnection.getConnection();
		try {
			sql = "select * from Supplier where Suppliername=? and SupplierPassword=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, supplier.getSuppliername());
			pstmt.setString(2, supplier.getSupplierPassword());
			ResultSet rs=pstmt.executeQuery();
			if (rs.next()) {
				i = true;
			} else {
				i = false;
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
		//��֤supplier�����Ƿ���������̼�
	}
	
	/*��ȡ�����̼Ҷ���*/
	public SupplierModel getSupplier(SupplierModel supplier) throws SQLException {
		//�����û�����supplier���л�ȡ�����̼Ҷ���
		return supplier;
	}
}

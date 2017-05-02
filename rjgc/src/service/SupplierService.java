package service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.*;
import dao.*;
public class SupplierService {
	//����
	public int SupplierRegister(SupplierModel sModel){
		java.sql.Connection conn =null;
		String sName=sModel.getSuppliername();
		String password=sModel.getSupplierPassword();
		GetConnection pDao=new GetConnection();
		conn=pDao.getConnection();
		String sql="select Supplierid from supplier where Suppliername=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,sName);
			ResultSet rst=ps.executeQuery();
			//�жϸ������
			if(rst.next()){
				return -1;
			}else{
				sql="insert into supplier(Suppliername,Supplierpassword)values(?,?)";
				ps=conn.prepareStatement(sql);
				ps.setString(1, sName);
				ps.setString(2, password);
				ps.executeUpdate();
				sql="select Supplierid from supplier where Suppliername=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, sName);
				rst=ps.executeQuery();
				if(rst.next()){
					int sid=rst.getInt("Supplierid");
					return sid;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -2;
	}
	

	
	//����
		public boolean SLoginInfoCheck(String Suppliername,String SupplierPassword) throws SQLException {
			boolean i = false;
			SupplierModel supplier=new SupplierModel();
			SupplierDao sd=new SupplierDao();
			supplier.setSuppliername(Suppliername);
			supplier.setSupplierPassword(SupplierPassword);
			i=sd.SLoginCheck(supplier);
			//����SupplierDao�е�SLoginCheck��������֤supplier�����Ƿ���������̼�
			return i;
		}
		
		public SupplierModel getSupplierByName(String Suppliername) throws SQLException {
			SupplierModel supplier=new SupplierModel();
			//��Suppliername����supplier������
			//����SupplierDao��getSupplier(SupplierModel supplier)������ȡ�����̼Ҷ���
			return supplier;
		}
	
	
}

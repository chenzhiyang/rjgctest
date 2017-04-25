package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ProductModel;

public class ProductDao {
	/*获取完整产品对象*/
	public ProductModel getProductByProductid(ProductModel product) throws SQLException {
		//根据product中的Productid查询数据库，获取完整的产品对象，写回到product中
		return product;
	}
	
	public List<ProductModel> getProductBySupplierid(int Supplierid){
		List<ProductModel> productList =new ArrayList<ProductModel>();
		//调用getProductByProductid(ProductModel product)方法获取完整产品信息
		return productList;
	}
	
	public boolean addProductToProduct(ProductModel product){
		boolean i=false;
		//将product中的数据加入Product表中
		return i;
	}
}

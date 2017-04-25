package service;

import java.util.ArrayList;
import java.util.List;

import model.PurchaseHistoryModel;
import model.ProductModel;

public class ProductInfoService {
	public ProductModel getProduct(int Productid){
		ProductModel product = new ProductModel();
		//将Productid写到product中，并调用getProductByProductid(ProductModel product)方法获取完整产品信息
		return product;
	}
	
	public boolean AddProductToSCart(ProductModel product){
		boolean i=false;
		//将product对象加入session，成功则令i=true，否则i=false
		return i;
	}
	
	public List<ProductModel> getProductList(){
		List<ProductModel> list = new ArrayList<ProductModel>();
		//该方法暂时用不到，不用写
		return list;
	}
	
	public boolean saveHistory(List<ProductModel> list){
		boolean i=false;
		//获取用户信息
		//根据list，生成购买的历史记录，并存入HistoryModel对象中
		//调用HistoryDao类的saveToPurchaseHistory(HistoryModel history)方法，将购买历史写入数据库
		return i;
	}
	
	public boolean saveProduct(ProductModel product){
		boolean i=false;
		//先验证用户的输入是否合法，不合法，令i=false，并返回i。
		//如果用户输入合法，则将product对象存入数据库，ProductDao的addProductToProduct(ProductModel product)方法
		return i;
	}
}

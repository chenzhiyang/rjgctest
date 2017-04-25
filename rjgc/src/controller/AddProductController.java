package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductModel;

@WebServlet(urlPatterns = {"/addProductController.do"})
public class AddProductController extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		//接收所有的，用户输入的，商品信息。保存到ProductModel product对象中
		//调用ProductInfoService的saveProduct(ProductModel product)方法添加商品
		//如果添加错误，即返回值为false，则跳转到supplierAddProduct.jsp界面，提示用户错误并修改
		//
	}
}
package controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import model.*;
import service.*;
/**
 * �̼��¼���Ʒ
 */
@WebServlet("/addproduct.do")
@MultipartConfig
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����jspҳ�洫�͵�����
		String path="../images/";
	    String imagePath =request.getSession().getServletContext().getRealPath("")+"/images/";
		HttpSession session=request.getSession();
		Part image=request.getPart("image");
		String message="";
		String productName=request.getParameter("productName");
		String origin=request.getParameter("origin");
		String date=request.getParameter("date");
		String life=request.getParameter("life");
		String price=request.getParameter("price");
		String introduction=request.getParameter("introduction");
		String storedid=request.getParameter("storedid");
		String stockNum=request.getParameter("stockNum");
		int sid=(int)session.getAttribute("Supplierid");
		
		if(image==null){
			message="ȱ��ͼƬ�ļ�";
			session.setAttribute("message", message);
			session.setAttribute("flag", true);
			response.sendRedirect("jsp/supplierAddProduct.jsp");
		}else if(image.getSize()>3*1024*1024) {
			image.delete();
			message="ͼƬ�ļ�̫��������ѡ��";
			session.setAttribute("message", message);
			session.setAttribute("flag", true);
			response.sendRedirect("jsp/supplierAddProduct.jsp");
		//�������ݿ���ô洢���̣������ͼƬ
		}else{
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
			//SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time=df.format(new Date());
			path=path+sid+"_"+time+".jpg";
			imagePath=imagePath+sid+"_"+time+".jpg";
			ProductModel pModel=new ProductModel();
			pModel.setProductdate(date);
			pModel.setProductname(productName);
			pModel.setProductorigin(origin);
			pModel.setProductprice(Float.parseFloat(price));
			pModel.setSupplierid(""+sid);
			pModel.setImage(path);
			pModel.setProductlife(life);
			pModel.setStocknum(Integer.parseInt(stockNum));
			pModel.setStoredid(storedid);
			pModel.setProductintroduction(introduction);
			ProductInfoService pService=new ProductInfoService();
			int stat=pService.addProductToProduct(pModel);
			if(stat==0){
				File file=new File(imagePath);
				file.createNewFile();
				image.write(imagePath);
				message="��Ϸ�����ɹ���";
				session.setAttribute("message", message);
				session.setAttribute("flag", true);
				response.sendRedirect("jsp/supplierindex.jsp");
			}else{
				message="���ʧ��";
				session.setAttribute("message", message);
				session.setAttribute("flag", true);
				response.sendRedirect("jsp/supplierAddProduct.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.SupplierService;
import dao.SupplierDao;
import model.SupplierModel;
@WebServlet(urlPatterns = {"/sLoginController.do"})
public class SLoginController extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		String Suppliername=request.getParameter("Suppliername");
		String SupplierPassword=request.getParameter("SupplierPassword");
		//�ȵ���SLoginInfoCheck(String Suppliername,String SupplierPassword)��֤�û�������
		SupplierService supllierservice = new SupplierService();
		SupplierDao supplierdao = new SupplierDao();
		SupplierModel supplier = new SupplierModel();
		boolean flag=false;
		try {
			flag=supllierservice.SLoginInfoCheck(Suppliername, SupplierPassword);
			if (flag) {
				supplier = supplierdao.getSupplier(supplier);
				HttpSession session = request.getSession();
				System.out.println("g");
				session.setAttribute("supplier", supplier);
				//��¼�ɹ�������flag��ת����Ӧ��ҳ���Servlet����ģ�黹��Ҫ�д��벹��
				response.sendRedirect("/sIndexController.do");
			} else {
				HttpSession session = request.getSession();
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				//��¼ʧ�ܣ����ص�¼����
				System.out.println("gg");
				out.println("<html>");
				out.println("<head>");
				out.println("<script type=\"text/javascript\">");
				out.println("alert(\"�û������������\");");
				out.println("window.location.href='jsp/supplierLogin.jsp';");
				out.println("</script>");
				out.println("</head>");
				out.println("</html>");
				//response.sendRedirect("jsp/supplierLogin.jsp");
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//��֤�����򷵻�supplierLogin.jsp
		//��֤ͨ����������/sIndexController.do
	}
}
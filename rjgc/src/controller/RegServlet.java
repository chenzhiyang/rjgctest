package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserModel;
import dao.UserDao;

@WebServlet(urlPatterns = {"/RegController.do"})

public class RegServlet extends HttpServlet {

	public RegServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//��������Reg.jsp��ע���û����� ���ж��û����Ƿ��Ѿ����ڣ�������flag1=1��δ���ھ͵���adduser��ӽ����ݿ⣬flag2=1��
		
	}

	public void init() throws ServletException {
		// Put your code here
	}
}

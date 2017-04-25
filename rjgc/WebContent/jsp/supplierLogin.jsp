<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商家登录</title>
</head>

<body>
<!--该jsp页面主要实商家登录的功能-->
	<form id="supplierloginform" action="">
        <div>用户名<input type="text" name="Suppliername" id="Suppliername"></div><br>
        <div>密码<input type="password" name="SupplierPassword" id="SupplierPassword"></div><br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
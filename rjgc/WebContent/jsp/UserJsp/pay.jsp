<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>收银台</title>
</head>

<body>
<!--该jsp页面用于提交订单后的付款功能-->
<form action="${pageContext.request.contextPath}/servlet/PayServlet" method="post">  
        <table width="60%">  
            <tr>  
                <td bgcolor="#F7FEFF" colspan="4">  
                订单号：<INPUT TYPE="text" NAME="ordernum" value="${order.ordernum}${param.ordernum}"  readonly="readonly">   
                支付金额：<INPUT TYPE="text" NAME="money" size="6" value="${order.price }"  readonly="readonly">元</td>  
            </tr>  
            <tr>  
                <td><br />  
                </td>  
            </tr>  
            <tr>  
                <td>请您选择在线支付银行</td>  
            </tr>  
            <tr>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="CMBCHINA-NET">招商银行  
                </td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="ICBC-NET">工商银行</td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="ABC-NET">农业银行</td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="CCB-NET">建设银行  
                </td>  
            </tr>  
            <tr>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="CMBC-NET">中国民生银行总行</td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="CEB-NET">光大银行  
                </td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="BOCO-NET">交通银行</td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="SDB-NET">深圳发展银行</td>  
            </tr>  
            <tr>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="BCCB-NET">北京银行</td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="CIB-NET">兴业银行  
                </td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="SPDB-NET">上海浦东发展银行  
                </td>  
                <td><INPUT TYPE="radio" NAME="pd_FrpId" value="ECITIC-NET">中信银行</td>  
            </tr>  
            <tr>  
                <td><br />  
                </td>  
            </tr>  
            <tr>  
                <td><INPUT TYPE="submit" value="确定支付">  
                </td>  
            </tr>  
        </table>  
    </form>  
</body>
</html>
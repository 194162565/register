<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<title>登录页面</title>

</head>
<body style="text-align: center;">
  <div>
    <form action="Login" method="post">
        <table>
            <tr>
                <td>登录名:</td>
                <td><input type="text" name="user"/></td>
            </tr>
            <tr>
                <td>密    码:</td>
                <td><input type="password" name="pwd"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="登陆"/></td>
                <td><a href="register.jsp">注册</a></td>
            </tr>
        </table>
    </form>
  </div>
</body>
</html>
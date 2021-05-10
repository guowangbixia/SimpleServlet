<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<form action="LoginServlet" method="post">
	账号:<input type="text" name="account" />${accountErrorString }<br>
	密码:<input type="password" name="psd" />${psdErrorString }<br>
	<input type="submit" value="提交" /><br>${errorString }
</form>
</body>
</html>

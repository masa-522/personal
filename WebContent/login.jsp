<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>login画面</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>LOGIN</p>
		</div>
		<div>
			<h3>商品を購入する際にはログインをお願いします。</h3>
			<s:form action="LoginAction">
				<s:textfield name="loginUserId"/>
				<s:password name="loginPassword"/>
				<s:submit value="LOGIN"/>
			</s:form>
			<br>
			<div id="text-link">
				<p>新規ユーザー登録は<a href="<s:url action='UserCreateAction'/>">こちら</a></p>
				<p><a href="<s:url action='GoHomeAction'/>">HOMEへ戻る</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>
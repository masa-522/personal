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
<title>home画面</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>HOME</p>
		</div>
		<div id="text-center">
			<s:form action="StartAction">
				<s:submit value="商品購入"/>
			</s:form>
			<s:if test="#session.id != null">
				<s:form action="InquiryAction">
					<s:submit value="お問い合わせ"/>
				</s:form>
				<p>ログアウトする場合は<a href="<s:url action='LogoutAction'/>">こちら</a></p>
			</s:if>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>
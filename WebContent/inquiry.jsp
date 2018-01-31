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
<title>お問い合わせフォーム</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>Inquiry</p>
		</div>
			<s:form method="post" action="InquiryCompleteAction">
				お問い合わせの種類:
				<br>
				<select name="qtype">
					<option value="company">会社について</option>
					<option value="product">製品について</option>
					<option value="support">アフターサポートについて</option>
				</select>
				<br>
				お問い合わせ内容
				<s:textarea name="body"/>
				<br>
				<s:submit value="送信"/>
			</s:form>
		<div>
			<p>マイページは<a href="<s:url action='MyPageAction'/>">こちら</a></p>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>
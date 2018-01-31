<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="/text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>新規商品登録</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>商品登録</p>
		</div>
		<div>
			<s:if test="errorMessage != ''">
				<s:property value="errorMessage" escape="false"/>
			</s:if>
			<table>
				<s:form action="ItemCreateConfirmAction">
					<tr>
						<td>
							<label>商品名:</label>
						</td>
						<td>
							<input type="text" name="itemName" value=""/>
						</td>
					</tr>
					<tr>
						<td>
							<label>価格:</label>
						</td>
						<td>
							<input type="text" name="itemPrice" value=""/>
					<tr>
						<td>
							<label>在庫数:</label>
						</td>
						<td>
							<input type="text" name="itemStock" value=""/>
						</td>
					</tr>
					<s:submit value="商品作成"/>
				</s:form>
			</table>
			<div>
				<span>前画面に戻る場合は</span><a href="<s:url action='StartAction'/>">こちら</a>
			</div>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>
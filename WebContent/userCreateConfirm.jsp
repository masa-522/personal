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
	<meta charset="utf-8"/>
	<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>ユーザー登録確認画面</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreateConfirm</p>
		</div>
		<div id="text">
			<h3>登録する内容は以下でよろしいですか。</h3>
			<table>
				<s:form action="UserCreateCompleteAction">
					<tr id="box">
						<td>
							<label>ログインID:</label>
						</td>
						<td>
							<s:property value="loginUserId" escape="false"/>
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>ログインPASS:</label>
						</td>
						<td>
							<s:property value="loginPassword" escape="false"/>
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>ユーザー名:</label>
						</td>
						<td>
							<s:property value="userName" escape="false"/>
						</td>
					</tr>
					<tr>
						<td>
							<s:submit value="完了"/>
						</td>
					</tr>
				</s:form>
			</table>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>
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
<title>お問い合わせ　受付完了</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>InquiryComplete</p>
		</div>
		<div>
			<s:if test="message == null">
				<h3>お問い合わせ内容は以下になります。</h3>
				<table>
					<tbody>
						<tr>
							<th>名前</th>
							<th>お問い合わせの種類</th>
							<th>お問い合わせ内容</th>
						</tr>

						<s:iterator value="#session.inquiryDTOList">
							<tr>
								<td><s:property value="user_master_id"/></td>

									<s:if test='qtype == "company"'>
										<td>会社について</td>
									</s:if>

									<s:if test='qtype == "product"'>
										<td>製品について</td>
									</s:if>

									<s:if test='qtype == "support"'>
										<td>アフターサポートについて</td>
									</s:if>

									<td><s:property value="body"/></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
				<s:form action="InquiryCompleteAction">
					<input type="hidden" name="deleteFlg" value="1">
					<s:submit value="削除" method="delete"/>
				</s:form>
			</s:if>
			<s:if test="message != null">
				<h3><s:property value="message"/></h3>
			</s:if>
			<s:if test="#session.inquiryDTOList == null">
				<h3>お問い合わせ情報はありません。</h3>
			</s:if>
				<div id="text-right">
					<p>マイページは<a href="<s:url action='MyPageAction'/>">こちら</a></p>
					<p><a href="<s:url action='GoHomeAction'/>">HOME</a></p>
				</div>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>
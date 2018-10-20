<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<a href="/product?cmd=input">新增</a>
	<table border="1" cellpadding="5" cellspacing="0" width="70%">
		<tr>
			<th>编号</th>
			<th>商品名称</th>
			<th>分类编号</th>
			<th>零售价</th>
			<th>供应商</th>
			<th>品牌</th>
			<th>折扣</th>
			<th>成本价</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list}" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.productName}</td>
				<td>${p.dirId}</td>
				<td>${p.salePrice}</td>
				<td>${p.supplier}</td>
				<td>${p.brand}</td>
				<td>${p.cutoff}</td>
				<td>${p.costPrice}</td>
				<td><a href="/product?cmd=input&id=${p.id}"> 编辑 </a> <a
					href="/product?cmd=delete&id=${p.id}"> 删除 </a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
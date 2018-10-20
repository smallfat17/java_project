<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<form action="/product?cmd=saveOrUpdate" method="post">
		<input type="hidden" name="id" value="${p.id}">
		<label for="name">商品名称：</label>
		<input type="text" value="${p.productName}" class="form-control"
			id="name" name="productName" placeholder="请输入商品的名称">
		<br />
		<label for="sn">分类编号：</label>
		<!-- 下拉框的option如果没有value,那么是直接将其中的文本作为value提交 -->
		<select class="form-control" name="dirId">
			<option value="1" ${p.dirId==1?"selected='selected'":""}>鼠标</option>
			<option value="2" ${p.dirId==2?"selected='selected'":""}>键盘</option>
			<option value="3" ${p.dirId==3?"selected='selected'":""}>娃娃</option>
		</select>
		<br />
		<label for="name">零售价：</label>
		<input type="text" value="${p.salePrice}" class="form-control"
			id="name" name="salePrice" placeholder="请输入零售价">
		<br />
		<label for="name">供应商：</label>
		<input type="text" value="${p.supplier}" class="form-control"
			id="name" name="supplier" placeholder="请输入供应商的名称">
		<br />
		<label for="name">品牌：</label>
		<input type="text" value="${p.brand}" class="form-control" id="name"
			name="brand" placeholder="请输入品牌的名称">
		<br />
		<label for="name">折扣：</label>
		<input type="text" value="${p.cutoff}" class="form-control" id="name"
			name="cutoff" placeholder="请输入商品的折扣">
		<br />
		<label for="name">成本价：</label>
		<input type="text" value="${p.costPrice}" class="form-control"
			id="name" name="costPrice" placeholder="请输入商品的成本价">
		<br />
		<button id="btn_submit" type="submit">保存</button>
		<button type="reset" class="btn btn-default">重置</button>
	</form>
</body>
</html>
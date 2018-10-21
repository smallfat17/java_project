<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%@include file="../common/header.jsp"%>
</head>
<body>

<div class="container " style="margin-top: 20px">
    <%@include file="../common/top.jsp"%>
    <div class="row">
        <div class="col-sm-3">
            <%@include file="../common/menu.jsp"%>
        </div>
        <div class="col-sm-9">
            <div class="row">
                <div class="col-sm-12">
                    <h1 class="page-head-line">部门编辑</h1>
                </div>
            </div>
            <div class="row col-sm-10">
                <form class="form-horizontal" action="/emp?cmd=saveOrUpdate" method="post" id="editForm">
                    <input type="hidden"  name="id" value="${emp.id }">
                    <div class="form-group" >
                        <label for="name" class="col-sm-2 control-label">员工名称：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control" id="name" name="name" value="${emp.name }"  placeholder="请输入部门的名称">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="sn" class="col-sm-2 control-label">员工邮箱：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control" id="sn" name="email" value="${emp.email }" placeholder="请输入部门编号">
                        </div>
                    </div>
                    
                     <div class="form-group">
                        <label for="sn" class="col-sm-2 control-label">员工年龄：</label>
                        <div class="col-sm-6">
                        <input type="text" class="form-control" id="age"value="${emp.age }" name="age"  placeholder="请输入部门编号">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-1 col-sm-6">
                            <button id="btn_submit" type="submit" class="btn btn-default">保存</button>
                            <button type="reset" class="btn btn-default">重置</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
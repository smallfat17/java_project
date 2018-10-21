<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                    <h1 class="page-head-line">部门管理</h1>
                </div>
            </div>
            <!--高级查询--->
            <form class="form-inline" id="searchForm" action="/emp?cmd=input" method="post">
                <input type="hidden" name="currentPage" id="currentPage" value="1">
                <a href="/emp?cmd=input" class="btn btn-success">添加</a>
            </form>

            <table class="table table-striped table-hover" >
                <thead>
                    <tr>
                        <th>编号</th>
                        <th>姓名</th> 
                        <th>邮箱</th>
                        <th>年龄</th>
                    </tr>
                </thead>
                <c:forEach items="${list }" var="item" varStatus="stat">
                  <tr>
                       <td>${stat.count }</td>
                       <td>${item.name }</td> 
                       <td>${item.email }</td>
                       <td>${item.age }</td>
                        <td>
                           <a class="btn btn-info btn-xs" href="/emp?cmd=input&id=${item.id }">
                               <span class="glyphicon glyphicon-pencil"></span>编辑
                           </a>
                           <a href="/emp?cmd=delete&id=${item.id }" class="btn btn-danger btn-xs" >
                               <span class="glyphicon glyphicon-trash"></span>删除
                           </a>
                       </td>
                       
                   </tr>
               </c:forEach>
                   

            </table>
           
        </div>
    </div>
</div>
</body>
</html>
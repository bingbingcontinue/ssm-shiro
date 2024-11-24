<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户列表</title>
</head>
<body>
<table>
  <tr>
    <th>编号</th>
    <th>用户名</th>
    <th>姓名</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${userList}" var="user">
    <tr>
      <td>${user.id}</td>
      <td>${user.username}</td>
      <td>${user.name}</td>
      <td>
        <a href="/user/edit/${user.id}" ${hasPermission('user:edit') ? '' : 'style="display:none;"'}>编辑</a>
        <a href="/user/delete/${user.id}" ${hasPermission('user:delete') ? '' : 'style="display:none;"'}>删除</a>
      </td>
    </tr>
  </c:forEach>
</table>
<a href="/user/add" ${hasPermission('user:add') ? '' : 'style="display:none;"'}>新增</a>
</body>
</html>


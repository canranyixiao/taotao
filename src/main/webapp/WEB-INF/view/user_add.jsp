<%--
  Created by IntelliJ IDEA.
  User: Tao Nian
  Date: 2018/2/28
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<form action="/admin/user/add.shtml" method="post">
    用户ID：<input name="userid" /><br/>
    用户名字：<input name="username" /><br/>
    用户年龄：<input name="userage" /><br/>
    <button type="submit">提交</button>
</form>
</html>
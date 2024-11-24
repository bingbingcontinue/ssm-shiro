<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>信息系统</title>

    <!-- BootStrap 美化界面 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .page-header {
            text-align: center;
            margin-top: 30px;
        }
        .page-header h1 small {
            color: #5a5a5a;
            font-weight: bold;
        }
        .form-inline {
            margin-top: 15px;
        }
        .table th, .table td {
            vertical-align: middle;
            text-align: center;
        }
        .table {
            margin-top: 20px;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        .btn {
            margin: 5px;
        }
    </style>
</head>
<body>

<div class="container-fluid">

    <div class="row">
        <div class="col-xs-12">
            <div class="page-header">
                <h1>
                    <small>显示所有</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12 col-md-4">
            <a class="btn btn-success" href="${pageContext.request.contextPath}/breakDownInfo/toAddBreakDownInfo">新增</a>
            <a class="btn btn-info" href="${pageContext.request.contextPath}/breakDownInfo/getAllBreakDownInfo">显示全部</a>
        </div>

        <div class="col-xs-12 col-md-4">
        </div>

        <!-- 添加选择列和查询输入框 -->
        <div class="col-xs-12 col-md-6">
            <form class="form-inline" action="${pageContext.request.contextPath}/breakDownInfo/queryBreakDownInfoByColumn" method="post" style="float: right">
                <span style="color: red;font-weight: bold">${error}</span>

                <!-- 下拉菜单选择列 -->
                <select name="queryColumn" class="form-control">
                    <option value="cableID">线缆编号</option>
                    <option value="cablename">线缆名称</option>
                    <option value="systemID">系统编号</option>
                    <option value="subsystemID">子系统编号</option>
                    <option value="status">状态</option>
                    <option value="uploadID">源端口编号</option>
                    <option value="downloadID">目标端口编号</option>
                    <option value="batchnumber">生产批号</option>
                    <option value="drawingID">图纸编号</option>
                    <option value="usage">用途</option>
                    <option value="position">位置</option>
                    <option value="length">长度</option>
                    <option value="ownner">责任人</option>
                    <option value="checkDate">检查日期</option>
                </select>

                <!-- 查询输入框 -->
                <input type="text" name="queryParam" class="form-control" placeholder="请输入查询内容">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix mt-4">
        <div class="col-xs-12">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>序号</th>
                    <th>开始时间</th>
                    <th>结束时间</th>
                    <th>持续时间（小时）</th>
                    <th>机时</th>
                    <th>系统</th>
                    <th>子系统</th>
                    <th>故障描述</th>
                    <th>记录员</th>
<%--                    <th>操作</th>--%>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="breakdown" items="${list}">
                    <tr>
                        <td>${breakdown.id}</td>
                        <td>${breakdown.startTime}</td>
                        <td>${breakdown.endTime}</td>
                        <td>${breakdown.durationTime}</td>
                        <td>${breakdown.affectBeamTime}</td>
                        <td>${breakdown.systemName}</td>
                        <td>${breakdown.subSystemName}</td>
                        <td>${breakdown.description}</td>
                        <td>${breakdown.userName}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

</body>
</html>

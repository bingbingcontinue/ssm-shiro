<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f8fa;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            height: 100vh;
            margin: 0;
        }

        .link-box {
            text-align: center;
            background-color: deepskyblue;
            border-radius: 5px;
            padding: 20px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            transition: transform 0.2s, background-color 0.2s;
            margin: 10px 0; /* 增加上下间距 */
            width: 300px; /* 设置固定宽度 */
        }

        .link-box:hover {
            transform: scale(1.05);
            background-color: #0095e8; /* 悬停时更改背景颜色 */
        }

        a {
            text-decoration: none;
            color: white;
            font-size: 24px;
            font-weight: bold;
        }
    </style>
</head>
<body>
<h1 class="mb-4">欢迎来到加速器机时故障统计系统</h1>
<div class="link-box">
    <a href="${pageContext.request.contextPath}/breakDownInfo/getAllBreakDownInfo">故障信息</a>
</div>

</body>
</html>

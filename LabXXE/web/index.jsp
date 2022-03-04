<%-- 
    Document   : index
    Created on : Dec 6, 2021, 3:19:17 PM
    Author     : ASUS
--%>

<%--<%@page import="connection.Function"%>--%>
<%@page import="java.sql.Connection"%>
<%--<%@page import="connection.JDBCConnection"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME</title>
        <link rel="stylesheet" href="./asset/css/style.css">
        <link rel="stylesheet" href="./asset/font/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css">
        <link rel="stylesheet" href="./asset/css/error.css">
    </head>
</head>
<body>
    <div class="content">
        <div class="container">
            <div class="navigation">
                <ul id="nav">
                    <li><a href=""> Nhóm 14 - An Toàn Ứng Dụng Web và Cơ sở dữ liệu</a></li>
                    <li><a href="index.jsp">Trang chủ</a></li>
                    <li>
                        <a href="">
                            Menu
                            <i class="nav-down fas fa-angle-down"></i>
                        </a>
                        <ul class="subnav">
                            <li><a href="xxe.jsp">XXE</a></li>
                            <li><a href="xxeError.jsp">XXE ERROR</a></li>
                            <li><a href="blindXxe.jsp">Blind XXE</a></li>
                        </ul>
                    </li>
                </ul>
                <div class="search">
                    <i class="search-icon fas fa-search"></i>
                </div>
            </div>
        </div>
        <div class="footer">
            <div class="footer-title"><h1>TOP 10 OWASP: A4 XML EXTERNAL ENTITY</h1></div>
            <div class="footer-main">
                <div class="footer-xxe" style="font-weight: 600">Giảng Viên hướng dẫn: TS.Ngô Quốc Dũng</div>
                <div class="footer-xxe">
                    <span>Sinh viên thực hiện: </span>
                    <ul class="list-sv">
                        <li>Nguyễn Thành Long - B18DCAT146 </li>
                        
                    </ul>
                </div>

            </div>

        </div>
    </script>
</body>
</html>

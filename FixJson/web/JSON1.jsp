<%-- 
    Document   : Json1
    Created on : Dec 17, 2021, 10:07:21 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSON</title>
        <link rel="stylesheet" href="./asset/css/xxe.css">
        <link rel="stylesheet" href="./asset/css/style.css">
        <link rel="stylesheet" href="./asset/font/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="container">
        <div class="content">
            <div class="container">
                <div class="navigation">
                    <ul id="nav">
                        <li><a href="">Nhóm 14 - An Toàn Ứng Dụng Web và Cơ Sở Dữ Liệu</a></li>
                        <li><a href="">Trang chủ</a></li>
                        <li>
                            <a href="">
                                Menu
                                <i class="nav-down fas fa-angle-down"></i>
                            </a>
                            <ul class="subnav">
                                <li><a href="JSON1.jsp">JSON_1</a></li>
                                <li><a href="JSON2.jsp">JSON_2</a></li>
                                
                            </ul>
                        </li>
                    </ul>
                    <div class="search">
                        <i class="search-icon fas fa-search"></i>
                    </div>
                </div>
            </div>

            <div class="main">
                <div class="demo">
                    <div class="main--title">Fix By JSON</div>
                    <div class="body--items make">
                        <div class="comment">
                            <div class="textok">Nhập Comment</div>
                            <textarea id="input" cols="50" rows="7" placeholder="Vui lòng nhập comment"></textarea>
                        </div>
                        <div class="htcomment">
                            <div class="textok">Hiển thị Comment</div>
                            <textarea id="output" cols="50" rows="7"></textarea>
                        </div>
                    </div>
                    <div class="body--items center-items">
                        <button class="btn btn-login" onclick="loadDoc()">Request Data</button>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function loadDoc() {
                var Comment = {
                    comment: "",
                }
                Comment.comment = document.getElementById("input").value;
                var content = JSON.stringify(Comment);
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        document.getElementById("output").innerHTML = this.responseText;
                    }
                };
                xhttp.open("POST", "/FixJson/Servlet_JSON", true);
                xhttp.setRequestHeader("Content-type", "application/json");
                xhttp.send(content);
            }
        </script>
</html>


<%-- 
    Document   : BlindXxe
    Created on : Dec 7, 2021, 10:00:01 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BlindXXE</title>
        <link rel="stylesheet" href="./asset/css/style.css">
        <link rel="stylesheet" href="./asset/font/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css">
        <link rel="stylesheet" href="./asset/css/error.css">
    </head>
    <body>
        <div class="content">
            <div class="container">
                <div class="navigation">
                    <ul id="nav">
                        <li><a href="">Nhóm 14 - An Toàn Ứng Dụng Web và Cơ sở dữ liệu</a></li>
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

            <div class="main">
                <div class="demo">
                    <div class="main-title">The Select element is used to creat a drop-own list</div>
                    <div class="select">Choose a programming language:</div>
                    <select class="list--items" id="cars">
                        <option value="1">Java</option>
                        <option value="2">C++</option>
                        <option value="3">Python</option>
                    </select>
                    <div class="body--items center-items">
                        <button class="btn btn-login" onclick="check()">Submit</button>
                    </div>
                    <div class="check" id="check" >Result:</div>
                </div>
            </div>
        </div>
        <script>
            function check() {
                document.getElementById("check").innerHTML = "Check: ";
                var xml = '<?xml version="1.0" encoding="UTF-8"?><check><value>' + document.getElementById("cars").value + '</value></check>';
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        document.getElementById("check").innerHTML = "Check: ";
                        document.getElementById("check").innerHTML += ' ' + this.responseText;
                    }
                };
                xhttp.open("POST", "/LabXXE/BlindXXE", true);
                xhttp.setRequestHeader("Content-type", "application/xml");
                xhttp.send(xml);
            }
        </script>

    </body>
</html>

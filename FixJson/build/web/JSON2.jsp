<%-- 
    Document   : JSON2
    Created on : Dec 17, 2021, 10:08:20 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSON2</title>
        <link rel="stylesheet" href="./asset/css/style.css">
        <link rel="stylesheet" href="./asset/font/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css">
        <link rel="stylesheet" href="./asset/css/error.css">
    </head>
    <body>
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
                    <div class="main-title">The Select element is used to creat a drop-own list</div>
                    <div class="select">Choose a programming language:</div>
                    <select class="list--items" id="languages">
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
                var CheckValue = {
                    value : "",
                }
                CheckValue.value = document.getElementById("languages").value;
                var content = JSON.stringify(CheckValue);
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        document.getElementById("check").innerHTML = "Result:";
                        document.getElementById("check").innerHTML += ' ' + this.responseText;
                    }
                };
                xhttp.open("POST", "/FixJson/Servlet_JSON2", true);
                xhttp.setRequestHeader("Content-type", "application/json");
                xhttp.send(content);
            }
        </script>
    </body>
</html>

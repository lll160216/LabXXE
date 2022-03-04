package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JSON1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSON</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/css/xxe.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/font/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navigation\">\n");
      out.write("                    <ul id=\"nav\">\n");
      out.write("                        <li><a href=\"\">Nhóm 14 - An Toàn Ứng Dụng Web và Cơ Sở Dữ Liệu</a></li>\n");
      out.write("                        <li><a href=\"\">Trang chủ</a></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                Menu\n");
      out.write("                                <i class=\"nav-down fas fa-angle-down\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"subnav\">\n");
      out.write("                                <li><a href=\"JSON1.jsp\">JSON_1</a></li>\n");
      out.write("                                <li><a href=\"JSON2.jsp\">JSON_2</a></li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"search\">\n");
      out.write("                        <i class=\"search-icon fas fa-search\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"demo\">\n");
      out.write("                    <div class=\"main--title\">Fix By JSON</div>\n");
      out.write("                    <div class=\"body--items make\">\n");
      out.write("                        <div class=\"comment\">\n");
      out.write("                            <div class=\"textok\">Nhập Comment</div>\n");
      out.write("                            <textarea id=\"input\" cols=\"50\" rows=\"7\" placeholder=\"Vui lòng nhập comment\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"htcomment\">\n");
      out.write("                            <div class=\"textok\">Hiển thị Comment</div>\n");
      out.write("                            <textarea id=\"output\" cols=\"50\" rows=\"7\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"body--items center-items\">\n");
      out.write("                        <button class=\"btn btn-login\" onclick=\"loadDoc()\">Request Data</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function loadDoc() {\n");
      out.write("                var Comment = {\n");
      out.write("                    comment: \"\",\n");
      out.write("                }\n");
      out.write("                Comment.comment = document.getElementById(\"input\").value;\n");
      out.write("                var content = JSON.stringify(Comment);\n");
      out.write("                var xhttp = new XMLHttpRequest();\n");
      out.write("                xhttp.onreadystatechange = function () {\n");
      out.write("                    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("                        document.getElementById(\"output\").innerHTML = this.responseText;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xhttp.open(\"POST\", \"/FixJson/Servlet_JSON\", true);\n");
      out.write("                xhttp.setRequestHeader(\"Content-type\", \"application/json\");\n");
      out.write("                xhttp.send(content);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HOME</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/font/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/css/error.css\">\n");
      out.write("    </head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navigation\">\n");
      out.write("                <ul id=\"nav\">\n");
      out.write("                    <li><a href=\"\"> Nhóm 14 - An Toàn Ứng Dụng Web và Cơ sở dữ liệu</a></li>\n");
      out.write("                    <li><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            Menu\n");
      out.write("                            <i class=\"nav-down fas fa-angle-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"subnav\">\n");
      out.write("                            <li><a href=\"xxe.jsp\">XXE</a></li>\n");
      out.write("                            <li><a href=\"xxeError.jsp\">XXE ERROR</a></li>\n");
      out.write("                            <li><a href=\"blindXxe.jsp\">Blind XXE</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"search\">\n");
      out.write("                    <i class=\"search-icon fas fa-search\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"footer-title\"><h1>TOP 10 OWASP: A4 XML EXTERNAL ENTITY</h1></div>\n");
      out.write("            <div class=\"footer-main\">\n");
      out.write("                <div class=\"footer-xxe\" style=\"font-weight: 600\">Giảng Viên hướng dẫn: TS.Ngô Quốc Dũng</div>\n");
      out.write("                <div class=\"footer-xxe\">\n");
      out.write("                    <span>Sinh viên thực hiện: </span>\n");
      out.write("                    <ul class=\"list-sv\">\n");
      out.write("                        <li>Phạm Đức Anh - B18DCAT010</li>\n");
      out.write("                        <li>Nguyễn Thành Long - B18DCAT146 </li>\n");
      out.write("                        <li>Nguyễn Công Hiếu - B18DCAT086</li>\n");
      out.write("                        <li>Hoàng Sỹ Nguyên - B18DCAT174</li>\n");
      out.write("                        <li>Trần Thế Quân - B18DCAT194</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

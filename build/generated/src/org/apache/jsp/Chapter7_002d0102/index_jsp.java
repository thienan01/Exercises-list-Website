package org.apache.jsp.Chapter7_002d0102;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Murach's Java Servlets and JSP</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Chapter7-0102/styles/main.css\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1>List of albums</h1>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("    <a href=\"Chapter070102/download?action=checkUser&amp;productCode=8601\">\n");
      out.write("    86 (the band) - True Life Songs and Pictures\n");
      out.write("</a><br>\n");
      out.write("\n");
      out.write("<a href=\"download?action=checkUser&amp;productCode=pf01\">\n");
      out.write("    Paddlefoot - The First CD\n");
      out.write("</a><br>\n");
      out.write("\n");
      out.write("<a href=\"download?action=checkUser&amp;productCode=pf02\">\n");
      out.write("    Paddlefoot - The Second CD\n");
      out.write("</a><br>\n");
      out.write("\n");
      out.write("<a href=\"download?action=checkUser&amp;productCode=jr01\">\n");
      out.write("    Joe Rut - Genuine Wood Grained Finish\n");
      out.write("</a>\n");
      out.write("</p>\n");
      out.write("<a href=\"/homework.html\">Return to list of exercises</a>\n");
      out.write("</body>\n");
      out.write("</html>");
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

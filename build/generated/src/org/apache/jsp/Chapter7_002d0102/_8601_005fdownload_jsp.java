package org.apache.jsp.Chapter7_002d0102;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _8601_005fdownload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>Downloads</h1>\n");
      out.write("\n");
      out.write("<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("    \n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("    <th>Song title</th>\n");
      out.write("    <th>Audio Format</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>You Are a Star</td>\n");
      out.write("    <td><a href=\"musicStore/sound/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/star.mp3\">MP3</a></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Don't Make No Difference</td>\n");
      out.write("    <td><a href=\"musicStore/sound/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/no_difference.mp3\">MP3</a></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p><a href=\"?action=viewAlbums\">View list of albums</a></p>\n");
      out.write("\n");
      out.write("<p><a href=\"?action=viewCookies\">View all cookies</a></p>\n");
      out.write("\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.12
 * Generated at: 2021-07-01 07:39:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.RequestUtils;
import org.apache.struts.action.*;
import org.apache.struts.Globals;
import java.util.Iterator;
import javax.servlet.jsp.JspException;
import us.mn.state.health.lims.common.action.IActionConstants;
import us.mn.state.health.lims.common.util.StringUtil;
import us.mn.state.health.lims.common.util.resources.ResourceLocator;
import us.mn.state.health.lims.common.util.Versioning;

public final class menuTemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String path = "";
String basePath = "";

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/struts-logic.tld", Long.valueOf(1625121650000L));
    _jspx_dependants.put("/WEB-INF/struts-html.tld", Long.valueOf(1625121650000L));
    _jspx_dependants.put("/WEB-INF/struts-bean.tld", Long.valueOf(1625121650000L));
    _jspx_dependants.put("/WEB-INF/struts-tiles.tld", Long.valueOf(1625121650000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fempty_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fempty_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fempty_0026_005fname.release();
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('\r');
          out.write('\n');

path = request.getContextPath();
basePath = path + "/";

String form = (String)request.getAttribute(IActionConstants.FORM_NAME);

if (form == null) {
	form = "n/a";
}

  int startingRecNo = 1;
   
  if (request.getAttribute("startingRecNo") != null) {
       startingRecNo = Integer.parseInt((String)request.getAttribute("startingRecNo"));
  }
   request.setAttribute("ctx", request.getContextPath());  
    

          out.write("\r\n");
          out.write("<head>\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(basePath);
          out.write("css/openElisCore.css?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\" />\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/jquery-1.8.0.min.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/jquery.dataTables.min.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/bootstrap.min.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/tabs.jsp\"></script> \r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/utilities.jsp\"></script> \r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/prototype-1.5.1.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/scriptaculous.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/overlibmws.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/ajaxtags-1.2.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/treeScript.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/Tooltip-0.6.0.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"");
          out.print(basePath);
          out.write("scripts/lightbox.js?ver=");
          out.print( Versioning.getBuildNumber() );
          out.write("\"></script>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<script language=\"JavaScript1.2\">\r\n");
          out.write("\r\n");
          out.write("function init() {\r\n");
          out.write("    check_width();\r\n");
          out.write("    initMenu();\r\n");
          out.write("}\r\n");
          out.write("\r\n");
          out.write("if (document.addEventListener) {  \r\n");
          out.write("  document.addEventListener(\"DOMContentLoaded\", init, false);\r\n");
          out.write("} else {\r\n");
          out.write("  window.onload = init; \r\n");
          out.write("}\r\n");
          out.write("\r\n");
          out.write("function setMenuAction(button, form, action, validate, parameters) {\r\n");
          out.write("  \r\n");
          out.write("  var fieldObj = window.document.forms[0].elements['selectedIDs'];\r\n");
          out.write("  var ID = '';\r\n");
          out.write("  var searchString = '';\r\n");
          out.write("  var doSearch = '");
          out.print(request.getAttribute(IActionConstants.IN_MENU_SELECT_LIST_HEADER_SEARCH));
          out.write("';\r\n");
          out.write("  \r\n");
          out.write("  if (fieldObj != null) {\r\n");
          out.write("    //If only one checkbox\r\n");
          out.write("    if (fieldObj[0] == null) {\r\n");
          out.write("       if (fieldObj.value != null && fieldObj.checked == true) {\r\n");
          out.write("         ID = fieldObj.value;\r\n");
          out.write("       }\r\n");
          out.write("   } else {\r\n");
          out.write("      for (var i = 0; i < fieldObj.length; i++) {\r\n");
          out.write("         if (fieldObj[i].checked == true) {\r\n");
          out.write("            ID = fieldObj[i].value;\r\n");
          out.write("            break;\r\n");
          out.write("         }\r\n");
          out.write("       }\r\n");
          out.write("    }\r\n");
          out.write("  }\r\n");
          out.write("  \r\n");
          out.write("  var sessionid = getSessionFromURL(form.action);\r\n");
          out.write("  var context = '");
          out.print( request.getContextPath() );
          out.write("';\r\n");
          out.write("  var formName = form.name; \r\n");
          out.write(" \r\n");
          out.write("  var parsedFormName;\r\n");
          out.write("  \r\n");
          out.write("  if (button.name == 'previous' || button.name == 'next' || button.name == 'cancel'|| button.name=='search' || button.name == 'searchString') {\r\n");
          out.write("     parsedFormName = formName.substring(1, formName.length - 4);\r\n");
          out.write("     parsedFormName = formName.substring(0,1).toUpperCase() + parsedFormName;\r\n");
          out.write("     //the action relates to a specific item on the menu form\r\n");
          out.write("  } else if (button.name == 'add' || button.name == 'edit' || button.name == 'deactivate') {\r\n");
          out.write("     parsedFormName = formName.substring(1, formName.length - 8);\r\n");
          out.write("     parsedFormName = formName.substring(0,1).toUpperCase() + parsedFormName;\r\n");
          out.write("  } else {\r\n");
          out.write("  //EXCEPTION!!!!\r\n");
          out.write("  //in case no button was pressed \r\n");
          out.write("  //selection from drop down was made (e.g. analyteTestResultMenu)\r\n");
          out.write("     parsedFormName = formName.substring(1, formName.length - 4);\r\n");
          out.write("     parsedFormName = formName.substring(0,1).toUpperCase() + parsedFormName;\r\n");
          out.write("  }\r\n");
          out.write("\t\r\n");
          out.write("   if (button.name == 'edit' || button.name == 'deactivate') { \r\n");
          out.write("      parameters += ID;\r\n");
          out.write("   }\r\n");
          out.write("\r\n");
          out.write(" if (button.name == 'previous' || button.name == 'next') {\r\n");
          out.write("      if (doSearch != null) {\r\n");
          out.write("       \r\n");
          out.write("         if ( doSearch == \"true\")\r\n");
          out.write("         {  \r\n");
          out.write("            parameters += \"&search=Y\"; \r\n");
          out.write("         }\r\n");
          out.write("    }\r\n");
          out.write("  }\r\n");
          out.write("  \r\n");
          out.write("  if (button.name != 'cancel' && button.name != 'search' && button.name != 'searchString') {\r\n");
          out.write("        parameters += '&startingRecNo=");
          out.print( startingRecNo );
          out.write("';\r\n");
          out.write("  }\r\n");
          out.write("  \r\n");
          out.write("  if (button.name == 'search' || button.name == 'searchString')  {\r\n");
          out.write("  \r\n");
          out.write("    parameters += \"&startingRecNo=1\";\r\n");
          out.write("     \r\n");
          out.write("    var fieldObj = window.document.forms[0].elements['searchString'];\r\n");
          out.write("    if (fieldObj != null) {\r\n");
          out.write("     searchString = fieldObj.value;\r\n");
          out.write("    }\r\n");
          out.write("  }\r\n");
          out.write("   \r\n");
          out.write("\r\n");
          out.write("  form.action = context + '/' + action + parsedFormName + '.do' + sessionid + parameters;\r\n");
          out.write("  \r\n");
          out.write("  if ((button.name == 'edit' && ID == '') || (button.name=='search' && searchString == '') ||(button.name=='searchString' && searchString == '') ) {\r\n");
          out.write("  } else {\r\n");
          out.write("      form.submit();\r\n");
          out.write("  }\r\n");
          out.write("   \r\n");
          out.write("       \r\n");
          out.write("}\r\n");
          out.write("</script>\r\n");

	if (request.getAttribute("cache") != null && request.getAttribute("cache").toString().equals("false")) 
	{

          out.write("\t\r\n");
          out.write("\t\t<meta http-equiv=\"Cache-Control\" content=\"no-cache, no-store, proxy-revalidate, must-revalidate\"/> ");
          out.write("\r\n");
          out.write("\t\t<meta http-equiv=\"Pragma\" content=\"no-cache\"/> ");
          out.write("\r\n");
          out.write("\t\t<meta http-equiv=\"Expires\" content=\"0\"/> \r\n");

	}

          out.write("\r\n");
          out.write("\t\r\n");
          out.write("\t<title>\r\n");
          out.write("\t\t");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /pages/common/menuTemplate.jsp(162,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fnotEmpty_005f0.setName(IActionConstants.PAGE_TITLE_KEY);
          int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
          if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /pages/common/menuTemplate.jsp(163,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_bean_005fwrite_005f0.setName(IActionConstants.PAGE_TITLE_KEY);
              // /pages/common/menuTemplate.jsp(163,3) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_bean_005fwrite_005f0.setScope("request");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fscope_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
          out.write("\r\n");
          out.write("\t\t");
          //  logic:empty
          org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_005fempty_005f0 = (org.apache.struts.taglib.logic.EmptyTag) _005fjspx_005ftagPool_005flogic_005fempty_0026_005fname.get(org.apache.struts.taglib.logic.EmptyTag.class);
          _jspx_th_logic_005fempty_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fempty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /pages/common/menuTemplate.jsp(165,2) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fempty_005f0.setName(IActionConstants.PAGE_TITLE_KEY);
          int _jspx_eval_logic_005fempty_005f0 = _jspx_th_logic_005fempty_005f0.doStartTag();
          if (_jspx_eval_logic_005fempty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t");
              out.print(StringUtil.getContextualMessageForKey("title.default"));
              out.write("\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fempty_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fempty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fempty_0026_005fname.reuse(_jspx_th_logic_005fempty_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fempty_0026_005fname.reuse(_jspx_th_logic_005fempty_005f0);
          out.write("\t\r\n");
          out.write("\t</title>\r\n");
          out.write("\t");
          if (_jspx_meth_tiles_005finsert_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_tiles_005finsert_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("</head>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<body onLoad=\"onLoad()\" >\r\n");
          out.write("\r\n");
          out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\">\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_tiles_005finsert_005f2(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_tiles_005finsert_005f3(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_tiles_005finsert_005f4(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_tiles_005finsert_005f5(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\r\n");
          out.write("\t</table>\r\n");
          out.write("\r\n");
          out.write("</body>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tiles_005finsert_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_005finsert_005f0 = (org.apache.struts.taglib.tiles.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_005finsert_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/common/menuTemplate.jsp(169,1) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f0.setAttribute("banner");
    int _jspx_eval_tiles_005finsert_005f0 = _jspx_th_tiles_005finsert_005f0.doStartTag();
    if (_jspx_th_tiles_005finsert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_005finsert_005f1 = (org.apache.struts.taglib.tiles.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_005finsert_005f1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/common/menuTemplate.jsp(170,4) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f1.setAttribute("login");
    int _jspx_eval_tiles_005finsert_005f1 = _jspx_th_tiles_005finsert_005f1.doStartTag();
    if (_jspx_th_tiles_005finsert_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f1);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_005finsert_005f2 = (org.apache.struts.taglib.tiles.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_005finsert_005f2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/common/menuTemplate.jsp(181,5) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f2.setAttribute("error");
    int _jspx_eval_tiles_005finsert_005f2 = _jspx_th_tiles_005finsert_005f2.doStartTag();
    if (_jspx_th_tiles_005finsert_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f2);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_005finsert_005f3 = (org.apache.struts.taglib.tiles.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_005finsert_005f3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/common/menuTemplate.jsp(186,5) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f3.setAttribute("header");
    int _jspx_eval_tiles_005finsert_005f3 = _jspx_th_tiles_005finsert_005f3.doStartTag();
    if (_jspx_th_tiles_005finsert_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f3);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_005finsert_005f4 = (org.apache.struts.taglib.tiles.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_005finsert_005f4.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/common/menuTemplate.jsp(191,5) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f4.setAttribute("body");
    int _jspx_eval_tiles_005finsert_005f4 = _jspx_th_tiles_005finsert_005f4.doStartTag();
    if (_jspx_th_tiles_005finsert_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f4);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_005finsert_005f5 = (org.apache.struts.taglib.tiles.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_005finsert_005f5.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/common/menuTemplate.jsp(196,5) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f5.setAttribute("footer");
    int _jspx_eval_tiles_005finsert_005f5 = _jspx_th_tiles_005finsert_005f5.doStartTag();
    if (_jspx_th_tiles_005finsert_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f5);
    return false;
  }
}

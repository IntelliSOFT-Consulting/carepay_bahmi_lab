/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.12
 * Generated at: 2021-07-01 07:48:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.upload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import us.mn.state.health.lims.common.util.SystemConfiguration;
import us.mn.state.health.lims.common.action.IActionConstants;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.put("/WEB-INF/labdev-view.tld", Long.valueOf(1625121650000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

path = request.getContextPath();
basePath = path + "/";

      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/slickgrid/examples.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/jquery_ui/jquery-ui-1.8.16.custom.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/jquery_ui/jquery.ui.tabs.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/slickgrid/slick.grid.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/slickgrid/dashboard.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/ui/jquery.event.drag-2.2.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/ui/jquery.event.drop-2.2.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.core.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.formatters.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.cellrangedecorator.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.cellrangeselector.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.cellexternalcopymanager.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.cellselectionmodel.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.rowselectionmodel.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.dataview.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.grid.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.editors.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/merge-sort.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/ui/jquery.ui.core.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/ui/jquery.ui.widget.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/ui/jquery.ui.tabs.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/dashBoard/createGrid.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/utils.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("scripts/slickgrid/slick.autotooltips.js\"></script>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <h1>");
      if (_jspx_meth_bean_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</h1>\n");
      out.write("    <div id=\"upload\">\n");
      out.write("        <form method=\"POST\" action=\"/openelis/DoUpload.do\" enctype=\"multipart/form-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                <td><button type=\"button\" id=\"refresh\">");
      if (_jspx_meth_bean_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</button></td>\n");
      out.write("                <td><input type=\"file\" name=\"file\" value=\"test_results_Upload_Template.csv\"></td>\n");
      out.write("                <td><span><input type=\"radio\" name=\"importType\" value=\"patient\" checked=\"checked\">");
      if (_jspx_meth_bean_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("</span></td>\n");
      out.write("                <td><span><input type=\"radio\" name=\"importType\" value=\"sample\">");
      if (_jspx_meth_bean_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("</span> </td>\n");
      out.write("                <td><input type=\"submit\" value='");
      if (_jspx_meth_bean_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("'>  </td>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <span id = \"uploadDetail\"\n");
      out.write("        data-fileName = '");
      if (_jspx_meth_bean_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("        data-type = '");
      if (_jspx_meth_bean_005fmessage_005f6(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("        data-dateOfUpload = '");
      if (_jspx_meth_bean_005fmessage_005f7(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("        data-status = '");
      if (_jspx_meth_bean_005fmessage_005f8(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("        data-stage = '");
      if (_jspx_meth_bean_005fmessage_005f9(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("        data-download = '");
      if (_jspx_meth_bean_005fmessage_005f10(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("        >\n");
      out.write("    </span>\n");
      out.write("    <div id=\"importStatusGrid\" style=\"width:1000px\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"uploadDetails\" class=\"hide details\">\n");
      out.write("        <div class='details-more-info'><span class='details-key'>File Name: </span><span class='details-value' id=\"originalFileName\"></span></div>\n");
      out.write("        <div class='details-more-info'><span class='details-key'>Uploaded By: </span><span class='details-value' id=\"uploadedBy\"></span></div>\n");
      out.write("        <div class='details-more-info'><span class='details-key'>Status: </span><span class='details-value' id=\"uploadStatus\"></span></div>\n");
      out.write("        <div class='details-more-info'><span class='details-key'>Success Count: </span><span class='details-value' id=\"successfulRecordsCount\"></span></div>\n");
      out.write("        <div class='details-more-info'><span class='details-key'>Fail Count: </span><span class='details-value' id=\"failedRecordsCount\"></span></div>\n");
      out.write("        <div class='details-more-info'><span class='details-key'>Error Message: </span><span id=\"errorMessage\"></span></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .bar {\n");
      out.write("        height: 18px;\n");
      out.write("        background: green;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var gridForInImportStatus;\n");
      out.write("\n");
      out.write("    var columns = [\n");
      out.write("        {id: \"originalFileName\", name: jQuery(\"#uploadDetail\").attr(\"data-\n");
      out.write("        fileName\"), field: \"originalFileName\", sortable: true, width: 200},\n");
      out.write("        {id: \"type\", name:jQuery(\"#uploadDetail\").attr(\"data-type\"), field: \"type\", sortable: true, width: 100},\n");
      out.write("        {id: \"startTime\", name:jQuery(\"#uploadDetail\").attr(\"data-dateOfUpload\"), field: \"startTime\", sortable: true, width: 200,\n");
      out.write("            formatter: function ( row, cell, value, columnDef, dataContext ) {\n");
      out.write("                function padWithZeroes(aField) {\n");
      out.write("                    if (aField < 10)\n");
      out.write("                        return \"0\" + aField;\n");
      out.write("                    return aField;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (value) {\n");
      out.write("                    var startTime = new Date(value);\n");
      out.write("                    return padWithZeroes(startTime.getDate()) + \"-\" + padWithZeroes(startTime.getMonth()) + \"-\" + padWithZeroes(startTime.getFullYear()) + \" \" +\n");
      out.write("                             padWithZeroes(startTime.getHours()) + \":\" + padWithZeroes(startTime.getMinutes()) + \":\" + padWithZeroes(startTime.getSeconds());\n");
      out.write("                }\n");
      out.write("                return \"\";\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        {id: \"status\", name: jQuery(\"#uploadDetail\").attr(\"data-status\"), field: \"status\", sortable: true, width: 300},\n");
      out.write("        {id: \"stage\", name: jQuery(\"#uploadDetail\").attr(\"data-stage\"), field: \"stageName\", sortable: true, width: 100},\n");
      out.write("        {id: \"errorFileName\", name: jQuery(\"#uploadDetail\").attr(\"data-download\"), field: \"errorFileName\", sortable: true, width: 100,\n");
      out.write("            formatter: function ( row, cell, value, columnDef, dataContext ) {\n");
      out.write("                if (value) {\n");
      out.write("                    return '<a href=\"' + value + '\">ErrorFile</a>';\n");
      out.write("                }\n");
      out.write("                return \"\";\n");
      out.write("            },\n");
      out.write("        }\n");
      out.write("    ];\n");
      out.write("\n");
      out.write("    var options = {\n");
      out.write("        enableColumnReorder: false,\n");
      out.write("        autoHeight:true,\n");
      out.write("        enableCellNavigation: true,\n");
      out.write("        forceFitColumns: true,\n");
      out.write("        multiColumnSort: true,\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    var showUploadDetails = function(row) {\n");
      out.write("        jQuery(\"#uploadDetails\").show();\n");
      out.write("        jQuery(\"#originalFileName\").text(row.originalFileName);\n");
      out.write("        jQuery(\"#uploadedBy\").text(row.uploadedBy);\n");
      out.write("        jQuery(\"#uploadStatus\").text(row.status);\n");
      out.write("        jQuery(\"#successfulRecordsCount\").text(row.successfulRecords);\n");
      out.write("        jQuery(\"#failedRecordsCount\").text(row.failedRecords);\n");
      out.write("        jQuery(\"#errorMessage\").text(row.stackTrace);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    jQuery(document).ready(function() {\n");
      out.write("        jQuery(\"#refresh\").on(\"click\", renderGrid);\n");
      out.write("\n");
      out.write("        function renderGrid() {\n");
      out.write("            jQuery.ajax('UploadDashboard.do', {\n");
      out.write("                type: 'get',\n");
      out.write("                success: function(data) {\n");
      out.write("                    gridForInImportStatus = new Slick.Grid(\"#importStatusGrid\", data, columns, options);\n");
      out.write("                    gridForInImportStatus .setSelectionModel(new Slick.RowSelectionModel());\n");
      out.write("                    gridForInImportStatus.registerPlugin( new Slick.AutoTooltips({ enableForHeaderCells: true }) );\n");
      out.write("                    gridForInImportStatus.init();\n");
      out.write("\n");
      out.write("                    gridForInImportStatus.onSort.subscribe(function (e, args) {\n");
      out.write("                        var cols = args.sortCols;\n");
      out.write("                        data.sort(function(dataRow1, dataRow2) {\n");
      out.write("                            for (var i = 0, l = cols.length; i < l; i++) {\n");
      out.write("                                var field = cols[i].sortCol.field;\n");
      out.write("                                var sign = cols[i].sortAsc ? 1 : -1;\n");
      out.write("                                var value1 = dataRow1[field], value2 = dataRow2[field];\n");
      out.write("                                var result = (value1 == value2 ? 0 : (value1 > value2 ? 1 : -1)) * sign;\n");
      out.write("                                if (result != 0) {\n");
      out.write("                                    return result;\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                            return 0;\n");
      out.write("                        });\n");
      out.write("                        gridForInImportStatus.invalidate();\n");
      out.write("                        gridForInImportStatus.render();\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    gridForInImportStatus.onSelectedRowsChanged.subscribe(function(e, args) {\n");
      out.write("                        var row = args.grid.getDataItem(args.rows[0]);\n");
      out.write("                        showUploadDetails(row);\n");
      out.write("                    });\n");
      out.write("                },\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        renderGrid();\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_bean_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent(null);
    // /pages/upload/upload.jsp(51,8) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f0.setKey("result.uploadedFile");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f1 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f1.setParent(null);
    // /pages/upload/upload.jsp(56,55) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f1.setKey("upload.refresh");
    int _jspx_eval_bean_005fmessage_005f1 = _jspx_th_bean_005fmessage_005f1.doStartTag();
    if (_jspx_th_bean_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f2 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f2.setParent(null);
    // /pages/upload/upload.jsp(58,98) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f2.setKey("upload.patient");
    int _jspx_eval_bean_005fmessage_005f2 = _jspx_th_bean_005fmessage_005f2.doStartTag();
    if (_jspx_th_bean_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f3 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f3.setParent(null);
    // /pages/upload/upload.jsp(59,79) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f3.setKey("upload.sample");
    int _jspx_eval_bean_005fmessage_005f3 = _jspx_th_bean_005fmessage_005f3.doStartTag();
    if (_jspx_th_bean_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f4 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f4.setParent(null);
    // /pages/upload/upload.jsp(60,48) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f4.setKey("upload.upload");
    int _jspx_eval_bean_005fmessage_005f4 = _jspx_th_bean_005fmessage_005f4.doStartTag();
    if (_jspx_th_bean_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f5 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f5.setParent(null);
    // /pages/upload/upload.jsp(66,25) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f5.setKey("dashboard.uploadedFile.fileName");
    int _jspx_eval_bean_005fmessage_005f5 = _jspx_th_bean_005fmessage_005f5.doStartTag();
    if (_jspx_th_bean_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f6 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f6.setParent(null);
    // /pages/upload/upload.jsp(67,21) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f6.setKey("dashboard.uploadedFile.type");
    int _jspx_eval_bean_005fmessage_005f6 = _jspx_th_bean_005fmessage_005f6.doStartTag();
    if (_jspx_th_bean_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f7 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f7.setParent(null);
    // /pages/upload/upload.jsp(68,29) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f7.setKey("dashboard.uploadedFile.dateOfUpload");
    int _jspx_eval_bean_005fmessage_005f7 = _jspx_th_bean_005fmessage_005f7.doStartTag();
    if (_jspx_th_bean_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f8 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f8.setParent(null);
    // /pages/upload/upload.jsp(69,23) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f8.setKey("dashboard.uploadedFile.status");
    int _jspx_eval_bean_005fmessage_005f8 = _jspx_th_bean_005fmessage_005f8.doStartTag();
    if (_jspx_th_bean_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f9 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f9.setParent(null);
    // /pages/upload/upload.jsp(70,22) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f9.setKey("dashboard.uploadedFile.stage");
    int _jspx_eval_bean_005fmessage_005f9 = _jspx_th_bean_005fmessage_005f9.doStartTag();
    if (_jspx_th_bean_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f10(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f10 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f10.setParent(null);
    // /pages/upload/upload.jsp(71,25) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f10.setKey("dashboard.uploadedFile.download");
    int _jspx_eval_bean_005fmessage_005f10 = _jspx_th_bean_005fmessage_005f10.doStartTag();
    if (_jspx_th_bean_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f10);
    return false;
  }
}

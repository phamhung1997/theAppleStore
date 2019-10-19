package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.ArrayList;
import entity.Account;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/tlds/controller.tld");
    _jspx_dependants.add("/common/nav.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sản phẩm</title>\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <script defer src=\"font-awesome/js/fontawesome-all.js\"></script>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.min.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/common.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/products.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Account account = (Account) session.getAttribute("currentLoginAccount");

      out.write("\n");
      out.write("<!-- Nav -->\n");
      out.write("<nav class=\"navbar navbar-expand-md bg-light navbar-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"mr-4\" href=\"products.jsp\"><img src=\"assets/images/products/logo-thinh.png\" style=\"height:95px !important;\"></a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">HOT</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">NEW</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Giảm giá</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Phụ kiện</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"ml-auto\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <form class=\"form-inline mr-3\" action=\"search\" method=\"get\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txtSearch\" placeholder=\"Tìm kiếm\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button type=\"submit\" name=\"btn-search\" class=\"input-group-text\"><i class=\"fas fa-search fa-fw icon-color\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <li class=\"nav-item mr-2\">\n");
      out.write("                        <a class=\"nav-link\" href=\"cart.jsp\">\n");
      out.write("                            <i class=\"fas fa-cart-arrow-down fa-fw\" style=\"font-size: 18px;\"></i> Giỏ hàng\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                ");

                    if(account != null){
                
      out.write("    \n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fas fa-user mr-2\"></i>");
      out.print(account.getEmail());
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Thông tin cá nhân</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"logout\">Đăng xuất</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                ");

                    } else {
                
      out.write("    \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"register.jsp\"><i class=\"fas fa-edit mr-1\"></i>Đăng ký</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"login.jsp\"><i class=\"fas fa-user-plus mr-1\"></i>Đăng nhập</a>\n");
      out.write("                    </li>\n");
      out.write("                ");

                    }
                
      out.write("  \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Cover -->\n");
      out.write("        <div id=\"main-contain\" class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"left-side\">\n");
      out.write("                        <div class=\"row title\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h6>Danh mục sản phẩm</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"side-nav\">\n");
      out.write("                                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link active\" href=\"filter\">\n");
      out.write("                                                <i class=\"far fa-circle fa-fw fa-xs mg-bottom-1 mr-2\"></i> Tất cả \n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");
      if (_jspx_meth_controller_Controller_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                                                                           \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row title mt-4\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h6>Khoảng giá</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"side-nav\">\n");
      out.write("                                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link active\" href=\"filter\">\n");
      out.write("                                                <i class=\"far fa-circle fa-fw fa-xs mg-bottom-1 mr-2\"></i> Tất cả \n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"filter?min=1&max=1000\">\n");
      out.write("                                                <i class=\"far fa-circle fa-fw fa-xs mg-bottom-1 mr-2\"></i> Dưới 1000<sup>$</sup>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>    \n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"filter?min=1000&max=2000\">\n");
      out.write("                                                <i class=\"far fa-circle fa-fw fa-xs mg-bottom-1 mr-2\"></i> 1000<sup>$</sup> - 2000<sup>$</sup>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"filter?min=2000&max=3000\">\n");
      out.write("                                                <i class=\"far fa-circle fa-fw fa-xs mg-bottom-1 mr-2\"></i> 2000<sup>$</sup> - 3000<sup>$</sup>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"filter?min=3000&max=10000\">\n");
      out.write("                                                <i class=\"far fa-circle fa-fw fa-xs mg-bottom-1 mr-2\"></i> Trên 3000<sup>$</sup>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div class=\"right-side\">\n");
      out.write("                        <div class=\"row title\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h6>\n");
      out.write("                                    Sản phẩm\n");
      out.write("                                    <span class=\"float-right sort\" style=\"font-size: 1rem;\">\n");
      out.write("                                        Sắp xếp giá:\n");
      out.write("                                        <a href=\"\"><i class=\"fas fa-sort-amount-up ml-2 mr-2\"></i></a>\n");
      out.write("                                        <a href=\"\"><i class=\"fas fa-sort-amount-down\"></i></a>\n");
      out.write("                                    </span>\n");
      out.write("                                </h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row mt-2\">\n");
      out.write("                            ");
      if (_jspx_meth_controller_Controller_1(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_controller_Controller_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  controller:Controller
    client.controller.Controller _jspx_th_controller_Controller_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(client.controller.Controller.class) : new client.controller.Controller();
    _jspx_th_controller_Controller_0.setJspContext(_jspx_page_context);
    _jspx_th_controller_Controller_0.setClassName("client.services.CategoryService");
    _jspx_th_controller_Controller_0.setMethodName("getCategoris");
    _jspx_th_controller_Controller_0.setReturnedAttribute("listCategory");
    _jspx_th_controller_Controller_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li class=\"nav-item\">\n");
          out.write("                                                <a class=\"nav-link\" href=\"filter?categoryId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                    <i class=\"far fa-circle fa-fw fa-xs mg-bottom-1 mr-2\"></i> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                </a>\n");
          out.write("                                            </li>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_controller_Controller_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  controller:Controller
    client.controller.Controller _jspx_th_controller_Controller_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(client.controller.Controller.class) : new client.controller.Controller();
    _jspx_th_controller_Controller_1.setJspContext(_jspx_page_context);
    _jspx_th_controller_Controller_1.setClassName("client.services.ProductService");
    _jspx_th_controller_Controller_1.setMethodName("getProductsByCategory");
    _jspx_th_controller_Controller_1.setReturnedAttribute("listProduct");
    _jspx_th_controller_Controller_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProduct.size() == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"col-12\">\n");
        out.write("                                    <h5 class=\"text-center\">Không tìm thấy sản phẩm nào.</h5>\n");
        out.write("                                </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write(" \n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.status != 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"col-6 col-md-3 mb-4\">\n");
        out.write("                                        <div class=\"product\">\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                            <div class=\"img\">\n");
        out.write("                                                <a href=\"\">\n");
        out.write("                                                    <img src=\"assets/images/products/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.imageLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" alt=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.imageLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">                                                           \n");
        out.write("                                                </a>\n");
        out.write("                                                <div class=\"overlay\">\n");
        out.write("                                                    <p>\n");
        out.write("                                                        <a href=\"addtocart?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                            <i class=\"fas fa-cart-plus fa-fw mr-1\" style=\"font-size: 15px;\"></i> Thêm vào giỏ\n");
        out.write("                                                        </a>\n");
        out.write("                                                    </p>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                            <div class=\"description text-center\">\n");
        out.write("                                                <h6><a href=\"product/detail?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></h6>\n");
        out.write("\n");
        out.write("                                                <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<sup>$</sup></p>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.status == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"status\">\n");
        out.write("                                                    <img src=\"assets/images/icon-sale.png\" alt=\"icon-sale\">\n");
        out.write("                                                </div>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}

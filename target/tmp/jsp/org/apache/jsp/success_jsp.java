package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.LoanApplication;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write(">\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      services.LoanService loanService = null;
      synchronized (application) {
        loanService = (services.LoanService) _jspx_page_context.getAttribute("loanService", PageContext.APPLICATION_SCOPE);
        if (loanService == null){
          loanService = new services.LoanService();
          _jspx_page_context.setAttribute("loanService", loanService, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      domain.LoanApplication loan = null;
      synchronized (session) {
        loan = (domain.LoanApplication) _jspx_page_context.getAttribute("loan", PageContext.SESSION_SCOPE);
        if (loan == null){
          loan = new domain.LoanApplication();
          _jspx_page_context.setAttribute("loan", loan, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      domain.LoanParameters parameters = null;
      synchronized (session) {
        parameters = (domain.LoanParameters) _jspx_page_context.getAttribute("parameters", PageContext.SESSION_SCOPE);
        if (parameters == null){
          parameters = new domain.LoanParameters();
          _jspx_page_context.setAttribute("parameters", parameters, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      domain.Person person = null;
      synchronized (session) {
        person = (domain.Person) _jspx_page_context.getAttribute("person", PageContext.SESSION_SCOPE);
        if (person == null){
          person = new domain.Person();
          _jspx_page_context.setAttribute("person", person, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      domain.Address address = null;
      synchronized (session) {
        address = (domain.Address) _jspx_page_context.getAttribute("address", PageContext.SESSION_SCOPE);
        if (address == null){
          address = new domain.Address();
          _jspx_page_context.setAttribute("address", address, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("address"), request);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

	loan.setParameters(parameters);
	loan.setPerson(person);
	loan.setAddress(address);
	loanService.add(loan);
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t");
	
		
		for(LoanApplication loanApplication: loanService.getAll()) {
	
      out.write("\r\n");
      out.write("\t<li>Wniosek:");
      out.print(loanApplication.getNumber() 
								+" Osoba: "+ loanApplication.getPerson().getSurname()
								+" Kwota: "+ loanApplication.getParameters().getAmount()
								+" Adres: "+ loanApplication.getAddress().getAddress() 
								+" "+ loanApplication.getAddress().getZipCode()
								+", "+ loanApplication.getAddress().getStreet()
								+" "+ loanApplication.getAddress().getLocalNumber());
      out.write("</li>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("</body>\r\n");
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

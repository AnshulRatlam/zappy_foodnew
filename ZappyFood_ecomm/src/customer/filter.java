package customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import dao.Dao_Customer;

/**
 * Servlet Filter implementation class filter
 */
@WebFilter(urlPatterns = { "/filter" }, servletNames = { "updatepasswithotp" })
public class filter implements Filter {

    /**
     * Default constructor. 
     */
    public filter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String email=request.getParameter("user");
		PrintWriter out = response.getWriter();
		System.out.println(email);
		Dao_Customer m = new Dao_Customer(); 
		int print = m.checkEmailbyfilter(email);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%"+print);
		if(print ==1)
		chain.doFilter(request, response);
		else
			out.println("pls enter valid email");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

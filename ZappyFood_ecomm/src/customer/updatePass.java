package customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Order_Bean;
import dao.Dao_Customer;
import dao.my_dao;

/**
 * Servlet implementation class updatePass
 */
@WebServlet("/updatePass")
public class updatePass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatePass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * 
	 * /*	String user = request.getParameter("user");
		my_dao d = new my_dao();
		Dao_Customer c = new Dao_Customer();
				 ArrayList<Order_Bean> list= d.vieworder();
				 String to=c.userEmail(user);
				 String ps=c.userPsw(user);
 			     String sub="Your Password Reset";
 			    String msg="Wel-Come ZappyFood your Password is =<strong>"+ps+ "</strong>";
 			    sendMail(to,sub,msg);
			      RequestDispatcher rd=request.getRequestDispatcher("forgot.jsp");
			      request.setAttribute("msg", "your password send Successfully...");
			      request.setAttribute("LIST", list);
			      rd.forward(request, response);
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
	}
}

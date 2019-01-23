package customer;

import java.io.IOException;
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

import dao.Dao_Customer;

/**
 * Servlet implementation class updatepasswithotp
 */
@WebServlet("/updatepasswithotp")
public class updatepasswithotp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatepasswithotp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		long l = System.currentTimeMillis();
		String str = l+"";
		String substr = str.substring(7,11);
		
		Dao_Customer c = new Dao_Customer();
		int x=c.Insertotp(substr,user);
		int print = c.checkEmailbyfilter(user);
		//System.out.println(print);
			
		
		if(x==1)
		{
		
		 String to= user;
		 String otp = c.userotp(user);
	     String sub="Your OTP ";
	    String msg="Wel-Come ZappyFood your otp is =<strong>"+otp+ "</strong>";
	    sendMail(to,sub,msg);
		RequestDispatcher rd=request.getRequestDispatcher("enterotp.jsp");
	      request.setAttribute("msg", "otp send on your email adress...");
	      
	      rd.forward(request, response);
		}
			
			}
		
		
	public void sendMail(String to,String sub,String msg)
	{

		String from = "project.chayan@gmail.com";
	    final String usename =  "project.chayan@gmail.com";//change accordingly
	    final String pasd = "Chayan1234";//change accordingly

	    // Assuming you are sending email through relay.jangosmtp.net
	    String host = "smtp.gmail.com";

	    Properties props = new Properties();
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", host);
	    props.put("mail.smtp.port", "587");

	    // Get the Session object.
	    Session session = Session.getInstance(props,
	    new javax.mail.Authenticator() {
	       protected PasswordAuthentication getPasswordAuthentication() {
	          return new PasswordAuthentication(usename, pasd);
	       }
	    });

	    try {
	       // Create a default MimeMessage object.
	       Message message = new MimeMessage(session);

	       // Set From: header field of the header.
	       message.setFrom(new InternetAddress(from));

	       // Set To: header field of the header.
	       message.setRecipients(Message.RecipientType.TO,
	       InternetAddress.parse(to));

	       // Set Subject: header field
	       message.setSubject(sub);

	       // Now set the actual message
	      // message.setText(msg);

	       // Send message
	       message.setContent(msg,"text/html");
	       
	       Transport.send(message);
	       } catch (MessagingException e) {
	  	  e.printStackTrace();
	  	     }	
	}

}



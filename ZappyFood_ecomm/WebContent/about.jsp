<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="custheadlink.jsp" %>
</head>
<body>


<% 
	  	String uid=(String)session.getAttribute("uid");
    String m = (String)request.getAttribute("msg") ;
    String count = (String)request.getAttribute("0");
        if(uid==null)
       {%>
	    <%@include file="Custhead.jsp" %>
  
       <%
       }
	   %>
	   <%if(uid!=null) 
	   
	   {%>
	   
	   <%@include file="Custheaduser.jsp" %>
	   <%@include file="breadcomb.jsp" %>
        <%} %>
<div class="about_section">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-10 offset-lg-1 col-md-12 text-center">
                            <div class="about_section_one">
                                <h2>Welcome To Zappy Food</h2>
                                <p>We live in the net age, where everything is smart, fast and easy; then why should our cooking be the same tedious time-consuming chore. Zappy brings the ultimate convenience into the kitchen with a veritable range of Ready to Eat, Drink and Cook products.
Zappy makes you happy by taking the stress out of cooking. Surprise your family and friends with the tastiest snacks, drinks and desserts. All prepared in a few minutes with practically no effort at all.
All Zappy products are made with natural ingredients with a special packing that retains the freshness and taste. Plus, every recipe has been carefully selected to give you the best in taste and health.
Now, dont worry about ‘What to cook today?’ any more. Just open a Zappy pack and see your family glow with happiness, or should we say, zappiness!.</p>    
                            </div>
                          <%--  <div class="about__store__btn">
                                <a href="#">contact us</a>    
                            </div>    --%> 
                        </div>    
                    </div>    
                </div>    
            </div>
            <!--about section area end-->
              
                        
            <!-- about area start-->
            <div class="about_chooseUs_area">
                <div class="container-fluid">
                    <div class="row no-gutters">
                        <div class="col-xl-6 col-lg-12 col-md-12">
                        <div class="single_choose_us">
                         <h3>Zappy is all about Spreading Happiness</h3>
                            <div class="choose_us  mb-50">
                                            <div class="choose_details">
                                               
                                                <p>Zappy is an endeavor to not just spread happiness amongst our customers, but also to take small steps towards making the world a better place. Bringing amazing instant food products to you brings us a lot of happiness (Zappyness we call it!) and therefore we want to share it with the world. Just like the products we make, happiness can be instant too if we all joined hands together.

We know, it doesn’t take a lot of effort to bring a smile on someone’s face, and that is what we aim to achieve. With this thought, we join hands with Smile Foundation to work for the education, health and welfare of underprivileged children in India.

Through Smile, Zappy will reach out to the rural masses and initiate several projects and activities in Mumbai and in the states of Chattisgarh, Madhya Pradesh and Karnataka.

Zappy is a part of Mission Education - Smile Foundations’ ongoing initiative to provide education to needy students. Through Cause Related Marketing, Zappy will provide financial assistance to this project. Every pack of Zappy that you buy, we will contribute Re. 1 to Smile Mission Education.

It is our way of Spreading Zappiness to one and all. Let’s make this world a Happy World together.
 </p>    
                                            </div>
                                        </div>
                                 
                                   </div>
                                       </div>
                            </div>  
                        </div>
                        
                        <div class="col-xl-6 col-lg-12 col-md-12">
                            <div class="about_choose_content">
                                <h3>Why Choose Us?</h3>
                                <div class="choose_content_inner">
                                    
                                    <div class="single_choose_us">
                                        <div class="choose_us  mb-50">
                                            <div class="choose_icone">
                                              <i class="zmdi zmdi-refresh-alt"></i>
                                            </div>
                                            <div class="choose_details">
                                                <h4>Money Back</h4>
                                                <p>Anybody who associates with us feels the zappiness of being part of a Big Idea. We 
would love to have you on board, as business partners or as a part of our young 
and ambitious team. Get in touch with our team members as mentioned below. </p>    
                                            </div>
                                        </div>
                                        <div class="choose_us">
                                            <div class="choose_icone"><i class="zmdi zmdi-time"></i>  </div>
                                            <div class="choose_details">
                                                <h4>Support 24/7</h4>
                                                <p>Anybody who associates with us feels the zappiness of being part of a Big Idea. We 
would love to have you on board, as business partners or as a part of our young 
and ambitious team. Get in touch with our team members as mentioned below.</p>    
                                            </div>
                                        </div>    
                                    </div>
                                </div>       
                            </div>    
                        </div>   
                    </div>
                         
                </div>    
                
             </div>
            <!-- about area end -->
                
                
            <!--about team area start--> 
         
         
		
		<%@include file="custfooter.jsp" %>
</body>
</html>
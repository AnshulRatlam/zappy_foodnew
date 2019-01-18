<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="custheadlink.jsp"  %>
</head>
<body>

<%@include file="Custhead.jsp"  %>

<% 
String m = (String)request.getAttribute("msg") ;
String m1 = (String)request.getAttribute("msg1") ;
if (m!=null)
{
	%>
	<div class="alert alert-success alert-dismissible">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong><%= m %></strong> 
  </div>
	<% 
	
}
if (m1!=null)
{
	%>
	<div class="alert alert-success alert-dismissible">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong><%= m1 %></strong> 
  </div>
	<% 
	
}
 
%>
 <div class="page_login_section">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 offset-lg-2">
                            <div class="register_page_form">
                                <form method="post" action="./custinsert">
                                    <div class="row">
                                        <div class="col-lg-6 col-sm-6 col-md-6">
                                            <div class="input_text">
												<label for="R_N">First Name <span>*</span></label>
												
												
												<input name="fname"  id="R_N" type="text"> <span id='message'></span>
                                            </div>   
                                        </div>
                                         <div class="col-lg-6 col-sm-6 col-md-6">
                                            <div class="input_text">
												<label for="R_N2">Last Name <span>*</span></label>
												<input name="lname" id="R_N2" type="text">    
											</div>
                                        </div>
                                       
                                        <div class="col-lg-6 col-sm-6 col-md-6">
                                            <div class="input_text">
												<label for="R_N4">Email Address <span>*</span></label>
												<input name="email"  id="R_N4" type="text"><span id='msg'></span> 
											</div>   
                                        </div>
                                         <div class="col-lg-6 col-sm-6 col-md-6">
											<div class="input_text">
												<label for="R_N5">Phone<span>*</span></label>
												<input name="mobile"  id="R_N5" type="text">  
											</div>  
                                        </div>
                                        
                                        <div class="col-12">
                                            <div class="input_text">
                                            	<label for="R_N7">Address<span>*</span></label>
                                            	<input name="Add" id="R_N7" placeholder="Street address" type="text">    
                                            </div>
                                        </div> 
                                       
                                        <div class="col-12">
                                            <div class="input_text">
												<label for="R_N11">Account password<span>*</span></label>
												<input name="password"  id="R_N11" type="password">    
											</div>
                                        </div>
                                        <div class="col-12">
                                            <div class="input_text">
												<label for="R_N12">Confirm password<span>*</span></label>
												<input id="R_N12"  type="password"> 
											</div>   
                                        </div>
                                        <div class="col-12">
                                            <div class="input_text">
												<input id="rememberme" type="checkbox"> 
												<label for="rememberme">I agree Terms & Condition</label>   
											</div>
                                        </div>
                                        <div class="col-12">
                                            <div class="login_submit">
                                            	<input value="register" onclick="return valid()" type="submit">
                                            </div>
                                        </div>    
                                    </div>
                                </form>    
                            </div>    
                        </div>    
                    </div>    
                </div>  
            </div>
            
            <!--login section end-->


<script src="myjavascript.js"></script>



<%@include file="custfooter.jsp"  %>


<script type="text/javascript">
$(document).ready(function(){
	$("#R_N4").blur(function(){
	    
		var email=$("#R_N4").val();
		//alert(email);
	var	mydata="id="+email;
		
	 $("#msg").html("<img src='assets/img/pc.gif' height='50' width='50' ><font color=gray> Checking availability...</font>");
	 
	 $.ajax({
			url:'CheckEmail',
			data:mydata,
			type:'post',
			success:function(response){
			//	alert(response);
				$("#msg").html(response);
				if(response.includes("Already Exist"))
				$("#R_N4").val("");
			}
		 });
	});
});
</script>

</body>
</html>
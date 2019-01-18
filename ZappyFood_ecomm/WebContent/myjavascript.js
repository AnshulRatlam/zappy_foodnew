	function valid()
{
  //username validation
   	
 	var correct_way=/^[a-zA-Z\-]+$/;
  	var a=document.getElementById("R_N").value;
  	var lname =document.getElementById("R_N2").value;
  	var add=document.getElementById("R_N7").value;
  	
  
  	if(a=="" && lname=="")
	{
		 alert('Pls fill name');
		//document.getElementById("message").innerHTML="*Pls fill your name";
		return false;
	}
	if(a.length>20 || lname.length>20)
	{   alert('Length of name should be less than 20');
		//document.getElementById("message").innerHTML="*Name must be less than 20 character ";
		return false;
	}
	 if(!a.match(correct_way) || !lname.match(correct_way))
	{  
		alert('*only alphabelts are alloweds');
	  	//document.getElementById("messgae").innerHTML="*only alphabelts are alloweds"
	  return false;
	  }
		//email validation
		var b=document.getElementById("R_N4").value;
     if(b=="")
	   {
	   	alert('Fill our email id');
		//document.getElementById("message1").innerHTML="*Fill your emailid ";
		return false;
		}
		if(b.indexOf('@')==0)
		{
			alert('*Invalid position of @ ');
			//document.getElementById("message1").innerHTML="*Invalid position of @ ";
		    return false;
		}
		if( b.charAt(b.length-4)!='.'  &&  b.charAt(b.length-3)!='.' )
		{
			alert('*Invalid character after dot');
			//document.getElementById("message1").innerHTML="*Invalid character after '.' ";
		    return false;
		} 
		
		//mobile no validation
		var c=document.getElementById("R_N5").value;
		if(c=="")
		{
			alert('*Pls fill mobile no');
		   //	document.getElementById("message2").innerHTML="Pls fill mobile no."
			return false;
		}
		
	 	if(c.length<10 || c.length>10)
	 	{
	 		alert('*Mobile no should be 10 digit');
	 		//document.getElementById("message2").innerHTML="Mobile no should be 10 digit"
			return false;
        }
        if(c.charAt(0)!=9 && c.charAt(0)!=8 && c.charAt(0)!=7)
        {
        	alert('*Mobile no should start with 9,8,7 only');
        	//document.getElementById("message2").innerHTML="Mobile no should start with 9,8,7 only"
			return false;
        }
        //adress
    	if(add=="")
    	{
    		 alert('Pls fill address');
    		//document.getElementById("message").innerHTML="*Pls fill your name";
    		return false;
    	}
      	
        
        //password validation
    	var password=document.getElementById("R_N11").value;
    	var cpassword=document.getElementById("R_N12").value;
    	if(password==""&& cpassword=="")
    	{
    		alert('*Pls fill password');
    		//document.getElementById("pass").innerHTML="* Pls fill password";
    		return false;
    	}

    if(password<5 || password>10)
    {
    	alert('*except between 5-10 character');
      	//document.getElementById("pass").innerHTML="* except between 5-10 character";
    		return false;

    }

    if(password!=cpassword)
    {
    	alert('*password not match')
    	//document.getElementById("pass").innerHTML="* password not match";
    return false;
    }

        
        //alert("end")
        //return true;
	 //return true;
	 }




//email validation
// function fname()
// {
// 	var email=document.getElementById("user-email").value;
// 	if(email=="")
// 	{
// 		alert(" * Pls fill Email");
// 		return false;
// 	}
// 	if(email.indexOf('@')==0)
// 	{
// 	alert( "Invalid '@' position");
// 		return false;	
// 	}
// 	if((email.charAt(email.length-4)!='.')&&(email.charAt(email.length-3)!='.'))
// 	{
// 	alert( "Invalid email-id");
// 		return false;	
// 	}
// }

//phone no. validation
// function fname()
// {
// 	var number=document.getElementById("user-number").value;
// 	if(number=="")
// 	{
// 		alert(" * Pls fill Phone number");
// 		return false;
// 	}
// 	if(email.indexOf('@')==0)
// 	{
// 	alert( "Invalid '@' position");
// 		return false;	
// 	}
// 	if((email.charAT(email.length-4)!='.')&&(email.charAT(email.length-3)!='.'))
// 	{
// 	alert( "Invalid email-id");
// 		return false;	
// 	}
// }
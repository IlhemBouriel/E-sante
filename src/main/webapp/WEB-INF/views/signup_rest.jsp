<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ page import = "med.app.Model.*" %>
 <%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<!DOCTYPE html>
<html lang="en">
<head>
	
	<meta charset="utf-8">
	<title>E-Sante</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<link href="${pageContext.request.contextPath}/resources/images/favicon.ico" rel="shortcut icon" >
	
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/flexslider.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/prettyPhoto.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/animate.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/owl.carousel.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" >

    

	
	
	<!-- FONTS -->
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,700,500,700italic,900,900italic' rel='stylesheet' type='text/css'>
	<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">	
    
	<!-- SCRIPTS -->
	<!--[if IE]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
    <!--[if IE]><html class="ie" lang="en"> <![endif]-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js" type="text/javascript">
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" type="text/javascript"></script>
		
		<style type="text/css">
		body {
  font-family: Arial, sans-serif;
  background: url(${pageContext.request.contextPath}/resources/images/medecin.png) no-repeat;
  background-size: cover;
  height: 100vh;
}

h1 {
  text-align: center;
  font-family: Tahoma, Arial, sans-serif;
  color: #2980b9;
  margin:0 0;
}

.box {
  width: 40%;
  margin: 0 auto;
  background:transparent;
  padding: 35px;
  border: 2px solid #2980b9;
  border-radius: 20px/50px;
  background-clip: padding-box;
  text-align: center;
}

.button {
  font-size: 2em;
  padding: 10px;
  color: #fff;
  border: 2px solid #2980b9;
  border-radius: 20px/50px;
  text-decoration: none;
  cursor: pointer;
  transition: all 0.3s ease-out;
  background-color: #2980b9;
}
.button:hover {
  background: #fff;
}

.overlay {
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background: rgba(0, 0, 0, 0.7);
  transition: opacity 500ms;
  visibility: hidden;
  opacity: 0;
}
.overlay:target {
  visibility: visible;
  opacity: 1;
}

.popup {
  margin: 70px auto;
  padding: 20px;
  background: #fff;
  border-radius: 5px;
  width: 40%;
  position: relative;
  transition: all 5s ease-in-out;
}

.popup h2 {
  margin-top: 0;
  color: #333;
  font-family: Tahoma, Arial, sans-serif;
}
.popup .close {
  position: absolute;
  top: 20px;
  right: 30px;
  transition: all 200ms;
  font-size: 30px;
  font-weight: bold;
  text-decoration: none;
  color: #333;
}
.popup .close:hover {
  color: #2980b9;
}
.popup .content {
  max-height: 30%;
  overflow: auto;
}

@media screen and (max-width: 700px){
  .box{
    width: 70%;
  }
  .popup{
    width: 70%;
  }
}
</style>


</head>
<body>


<div>

	<!-- PAGE -->
	<div id="page">
	
		<!-- HEADER -->
		<header>
			
			<!-- MENU BLOCK -->
			<div class="menu_block">
			
				<!-- CONTAINER -->
				<div class="container clearfix">
					
					<div class="logo pull-left">
						<a href="/proj" ><span class="b1">S</span><span class="b2">A</span><span class="b3">N</span><span class="b4">t</span><span class="b5">e</span></a>
					</div><!-- //LOGO -->
					
					<!-- SEARCH FORM -->
					<div id="search-form" class="pull-right">
						<form method="get" action="#">
							<input type="text" name="Search" value="Search" onFocus="if (this.value == 'Search') this.value = '';" onBlur="if (this.value == '') this.value = 'Search';" />
						</form>
					</div><!-- SEARCH FORM -->
					
					<!-- MENU -->
					<div class="pull-right">
						<nav class="navmenu center">
							<ul>
								<li class="first active scroll_btn"><a href="/proj" >Accueil</a></li>
								<li class="scroll_btn"><a href="signin" >Identification</a></li>
								<li class="scroll_btn"><a href="signup" >Inscription</a></li>
								<li class="scroll_btn"><a href="#team" >Nos medecins</a></li>
								<li class="scroll_btn"><a href="#news" >Nos articles</a></li>
								<li class="scroll_btn last"><a href="#contacts" >Contacts</a></li>
								<!-- <li class="sub-menu">
									<a href="javascript:void(0);" >Pages</a>
									<ul>
										<li><a href="blog.html" >Blog</a></li>
										<li><a href="blog-post.html" >Blog Post</a></li>
										<li><a href="portfolio-post.html" >Portfolio Single Work</a></li>
									</ul>
								</li>
								 -->
							</ul>
						</nav>
					</div><!-- //MENU -->
				</div><!-- //MENU BLOCK -->
			</div><!-- //CONTAINER -->
		</header><!-- //HEADER -->
		
				<%
           ArrayList<Docteurs> list = new ArrayList();
    list = (ArrayList<Docteurs>) request.getAttribute("docs");
 %>	
		<!-- HOME -->
		<section id="home" class="padbot0" style="background-color:transparent;">
	<h1>tu cherche un medecin :</h1>
<div class="box">
	<a class="button" href="#popup1">specialiste</a>
	<a class="button" href="#popup2">generaliste</a>	
</div>

<div id="popup1" class="overlay">
	<div class="popup">
		<h2>choisissez une specialite</h2>
		<a class="close" href="#">&times;</a>
		<div class="content">
		<form action="register" method="POST">
		<label for="spec">Specialite:</label>
		<select name="spec" class="form-control" style="width:30%;display:inline;" onchange="enableSel(this.value)" id="choice">
		<option selected></option>
		<c:forEach items="${specs}" var="s">
 		<option><c:out value="${s}"/></option>
  		</c:forEach>
		</select>

		<label for="spec">Medecin:</label>		
		<select name="med" class="form-control" style="width:30%;display:inline;" id="doc_choice" disabled="true">
		<option selected></option>
		</select>
		</br></br>
		<input type="hidden" value="${p}"/>
 		<button style="margin-left: 36%;">Valider mon choix</button>
		</form>
		</div>
	</div>
</div>


<div id="popup2" class="overlay">
	<div class="popup">
		<h2>Here i am</h2>
		<a class="close" href="#">&times;</a>
		<div class="content">
			Thank to pop me out of that button, but now i'm done so you can close this window.
		</div>
	</div>
</div>
		</section><!-- //HOME -->
		
		
	</div><!-- //PAGE -->
	


</div>

<script>
function enableSel(val)
{
	var map = '${map}';
	var projects = JSON.parse(map);
	data = JSON.parse(map);
	var ch ="<option selected></option>";
	  for(var i in data.res){
	      if (i == val)
		      {
		      for(var j in data.res[i])
			      {
		    	  ch = ch + "<option value='"+data.res[i][j].idDoc+"'>"+data.res[i][j].nomDoc+" "+data.res[i][j].prenomDoc+"</option>";
			      }
	    	  
		      }
	     
	  }

	document.getElementById('doc_choice').innerHTML =ch;
	if(choice.length > 2)
		{
			document.getElementById('doc_choice').disabled = false;
		}
	else
		{
		document.getElementById('doc_choice').innerHTML ="<option selected></option>";
			document.getElementById('doc_choice').disabled = true;
		}
}



</script>
</body>
</html>
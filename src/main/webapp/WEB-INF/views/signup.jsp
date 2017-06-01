<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	
	<meta charset="utf-8">
	<title>E-Sante</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<link href="${pageContext.request.contextPath}/resources/images/favicon.ico" rel="shortcut icon" >
	<!-- CSS -->
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/flexslider.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/prettyPhoto.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/animate.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/owl.carousel.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" >
	
	
	<!-- FONTS -->
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,700,500,700italic,900,900italic' rel='stylesheet' type='text/css'>
	<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">	
    

	
	
		<!-- Created By me -->
	<link href="${pageContext.request.contextPath}/resources/css/mine.css" rel="stylesheet" >
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/mine.js"></script>
	
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
		
		
		<!-- HOME -->
		<section id="home" class="padbot0">
	<div id="center">
<form action="signup" method="POST">
<label for="nom">Nom :</label>
<input type="text" name="nom" autocomplete="off">
<label for="prenom">Prenom :</label>
<input type="text" name="prenom" autocomplete="off">
<label for="sexe">Sexe :</label>
<SELECT name="sexe" >
<OPTION>Masculin
<OPTION>Feminin
</SELECT></br>
<label for="age">Age :</label>
<input type="text" name="age" autocomplete="off">
<label for="civil">Etat civil :</label>
<SELECT name="civil">
<OPTION>celibataire
<OPTION>marie(e)
<OPTION>divorce(e)
</SELECT></br></br>
<input type="submit" id="continue" value="Continuer"></input>
</form>
		</div>
	
		</section><!-- //HOME -->
		
		
	</div><!-- //PAGE -->

	<!-- FOOTER -->

</div>
</body>
</html>
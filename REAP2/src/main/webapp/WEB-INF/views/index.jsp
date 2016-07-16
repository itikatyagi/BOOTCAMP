<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>TO THE NEW DIGITAL</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Max Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--Custom Theme files-->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/index.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/swipebox.css">
<link href="css1/style.css" rel='stylesheet' type='text/css' />
<!--//Custom Theme files-->
<!--js-->
<script src="js/jquery-1.11.1.min.js"></script> 
<!--//js-->
<!--web-fonts-->
<link href='//fonts.googleapis.com/css?family=Nova+Round' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!--//web-fonts-->
<!--start-smooth-scrolling-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>	
<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
		
		$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
</script>
<!--//end-smooth-scrolling-->	
<link href="images/favicon-c06e02ee158e94e25e754cb87a2328fd" rel="icon" type="image/x-icon"/>

</head>
<body>
	<!--banner-->
	<div class="banner">
		<div class="header"><!--header-->
			<div class="container">		
				<nav class="navbar navbar-default">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" style="align:right">
							
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<H4><img src="http://www.tothenew.com/images/xlogo-large.png.pagespeed.ic.mNf2OdVkJv.png" style="height:55px;padding-top:8px;"alt="LOGO"></H4>
					</div>
					<!--navbar-header-->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="index.html" class="active">Home</a></li>
							<li><a href="#about" class="scroll">About</a></li>
							<li><a href="#features" class="scroll">Features</a></li>
							
							<li><a href="#reap" class="scroll">Reap</a></li>
							<li><a href="#contact" class="scroll">Contact Us</a></li>
						</ul>	
						
					</div>
				</nav>
			</div>
			
			
		</div>
		<!--//header-->
		<!--banner-text-->
		<div class="banner-text">
			<!--banner Slider starts Here-->
			<script src="js/responsiveslides.min.js"></script>
			<script>
				// You can also use "$(window).load(function() {"
				$(function () {
				  // Slideshow 3
				  $("#slider3").responsiveSlides({
					auto: true,
					pager: true,
					nav: false,
					speed: 500,
					namespace: "callbacks",
					before: function () {
					  $('.events').append("<li>before event fired.</li>");
					},
					after: function () {
					  $('.events').append("<li>after event fired.</li>");
					}
				  });
			
				});
			</script>
			<!--//End-slider-script-->
			<div  id="top" class="callbacks_container">
				<ul class="rslides" id="slider3">
					<li>
						<h3 style="font-size:20px;">Actions speak louder<br>
than words. Just the reason <br>
why we let our work do <br>
the talking!</h3>
						

					</li>
					<li>
						<h3 style="font-size:20px;"> Culture of Empowerment, Autonomy and<br> Learning keeps our people happy; and our <br>success strengthens our belief that <br>
Happy people lead to happy customers. </h3>
						
						
					</li>
					<li>
						<h3 style="font-size:20px;">Our 5 businesses include TO THE NEW Digital, American Swan, #fame, Blogmint and ThoughtBuzz</h3>
						
						
					</li>
				</ul>
			</div>
		</div>
		<!--//banner-text-->
	</div>
	<!--//banner-->
	
	<!--about-->
	<div id="about" class="about">
		<div class="container">
			<div class="title">
				<h3>About Us </h3>
				<p ><h4 style="text-align:center;">We are fun to know, really!</h4> </p>
			</div>
			<div class="about-row">
				<div class="col-md-3 about-grids">
					<span class="glyphicon glyphicon-stats effect-1" aria-hidden="true"></span>
					<h4>Technology</h4>
					<p>We build business-critical applications on web, mobile and cloud platforms using razor-edge technologies</p>
					<h6> </h6>
				</div>
				<div class="col-md-3 about-grids">
					<span class="glyphicon glyphicon-user effect-1" aria-hidden="true"></span>
					<h4>Analytics</h4>
					<p>Our digital analytics service helps brands derive actionable insights from huge volume of digital data</p>
					<h6> </h6>
				</div>
				<div class="col-md-3 about-grids">
					<span class="glyphicon glyphicon-list-alt effect-1" aria-hidden="true"></span>
					<h4>Digital Marketing</h4>
					<p>Digital and social media marketing services across platforms that impact the bottom-line</p>
					<h6> </h6>
				</div>
				<div class="col-md-3 about-grids">
					<span class="glyphicon glyphicon-check effect-1" aria-hidden="true"></span>
					<h4>Video Solutions</h4>
					<p>Manage, publish, measure, personalise and monetise with our video solutions and video managed services.</p>
					<h6> </h6>
				</div>
				<div class="clerfix"> </div>
			</div>
		</div>
	</div>
	<!--//about-->
	<!--features-->
	<div id="features" class="features">
		<div class="container">
			<div class="title">
				<h3>Features</h3>
				<p>Duis euismod massa ut sem fringilla blandit. Proin vel enim nec ipsum finibus. </p>
			</div>
			<div class="features-row">
				<div class="col-md-4 features-grids">
					<div class="features-left">
						<h4>Projects Done</h4>
						<h5>5200 </h5>
					</div>
					<div class="features-right">
						<span class="glyphicon glyphicon-check" aria-hidden="true"></span>
					</div>
					<div class="clerfix"> </div>
				</div>
				<div class="col-md-4 features-grids features-grids-mdl">
					<div class="features-left">
						<h4>Visitors</h4>
						<h5>6000 </h5>
					</div>
					<div class="features-right">
						<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
					</div>
					<div class="clerfix"> </div>
				</div>
				<div class="col-md-4 features-grids">
					<div class="features-left">
						<h4>Business Donor</h4>
						<h5>500 </h5>
					</div>
					<div class="features-right">
						<span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span>
					</div>
					<div class="clerfix"> </div>
				</div>
				<div class="clerfix"> </div>
			</div>
		</div>
	</div>
	<!--//about-->
	
	<!--reap-->

	<div id="reap" class="reap">
		<div class="container">
			<div class="title">
				<h3>Reap</h3>
				<p><h4 style="text-align:center;">Reward.Earn.Acknowledge.Praise</h4> </p>
			</div>
		 <div class="container">    
        <div id="loginbox" style="margin-top:20px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-warning" >
                    <div class="panel-heading">
                        <div class="panel-title">Sign In</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-8px"><a href="#">Forgot password?</a></div>
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" class="form-horizontal" role="form" method="post" action="login">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="email_id" value="" placeholder="username or email">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="password" placeholder="password">
                                    </div>
                                    

                                
                           

                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                    <button type ="submit" class ="btn btn-primary" >LOGIN</button>
                                     <!--  <a id="btn-login" href="../login
                                      " class="btn btn-success">Login  </a> -->
                                     

                                    </div>
                                </div>


                                
                            </form>     



                        </div>                     
                    </div>  
        </div>
       
    </div>
    
		</div>
	</div>
	<!--//reap-->
	
	<!--testimonial-->
	<div class="testimonial">
		<div class="col-md-6 testi-left">
			<div class="testi-left-info">
				<h4>HAPPY CUSTOMERS</h4>
				<script>
					// You can also use "$(window).load(function() {"
					$(function () {
					  // Slideshow 2
					  $("#slider2").responsiveSlides({
						auto: true,
						pager: true,
						nav: false,
						speed: 500,
						namespace: "callbacks",
						before: function () {
						  $('.events').append("<li>before event fired.</li>");
						},
						after: function () {
						  $('.events').append("<li>after event fired.</li>");
						}
					  });
				
					});
				</script>
				<!--//End-slider-script-->
				<div  id="top2" class="callbacks_container">
					<ul class="rslides" id="slider2">
						<li>
							<p><span> </span>
Nothing can be more exciting for a fresher than getting an opportunity to work on razor edge technologies within the first six months, a team with high synergy leading to constant peer learning.<span class="last"> </span></p>
							<h6>Rishabh Jain - </h6>
							<img src="images/aimg.jpg" class="img-circle" style="width=50px;height:50px;" alt=""/>
						</li>
						<li>
							<p><span> </span>
From being one of the first few employees to leading a new practice, the opportunities to experiment and take risks is what keeps me going.<span class="last"> </span></p>
							<h6> Aman Agarwal- </h6>
							<img src="images/img7.png" alt=""/>
						</li>
						<li>
							<p><span> </span>Joined as a fresher and in no time moved to managing the Client Servicing Practice. The TTN-D Journey for me has been all about freedom to constantly innovate.<span class="last"> </span></p>
							<h6>Federica - </h6>
							<img src="images/img8.png" alt=""/>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="col-md-6 testi-left testi-right">
			<div class="testi-right-info">
				<h4>SUBSCRIBE</h4>
				<form action="#" method="post">
					<input type="text" name="Email" placeholder="Enter Your Email" required="">
					<input type="submit" value="Submit">
				</form>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
	<!--//testimonial-->
	<!--contact-->
	<div class="contact" id="contact">
		<div class="container">
			<div class="title">
				<h3>Contact</h3>
				
			</div>
			<div class="contact-grids">
				<div class="col-md-5 address">
					<h4>Contact Info</h4>
					<div class="address-row">
						<div class="col-md-2 address-left">
							<span class="glyphicon glyphicon-home" aria-hidden="true"></span>
						</div>
						<div class="col-md-10 address-right">
							<h5>Visit Us</h5>
							<p>LogixTechno Park Noida </p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="address-row">
						<div class="col-md-2 address-left">
							<span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
						</div>
						<div class="col-md-10 address-right">
							<h5>Mail Us</h5>
							<p><a href="mailto:info@example.com"> agam@gmail.com</a></p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="address-row">
						<div class="col-md-2 address-left">
							<span class="glyphicon glyphicon-phone" aria-hidden="true"></span>
						</div>
						<div class="col-md-10 address-right">
							<h5>Call Us</h5>
							<p>9953739140</p>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="col-md-7 contact-form">
					<form action="#" method="post">
						<input type="text" name="First Name" placeholder="First Name" required="">
						<input class="email" name="Last Name" type="text" placeholder="Last Name" required="">
						<input type="text" name="Number" placeholder="Mobile Number" required="">
						<input class="email" name="Email" type="text" placeholder="Email" required="">
						<textarea name="Message" placeholder="Message" required=""></textarea>
						<input type="submit" value="SUBMIT">
					</form>
				</div>
				<div class="clearfix"> </div>	
			</div>
		</div>
	</div>
	<!--//contact-->
	
	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-left">
				<p>© 2016 TTND . All rights reserved </p>
			</div>
			<div class="footer-right social-icons">
				<ul>
					<li><a href="https://twitter.com/tothenew "> </a></li>
					<li><a href="https://www.facebook.com/TOTHENEWDigi" class="fb"> </a></li>
					<li><a href="https://plus.google.com/+Tothenewdigital/" class="gp"> </a></li>
					<li><a href="https://www.linkedin.com/company/tothenew" class="drb"> </a></li>
				</ul>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--//footer-->	
	<!--smooth-scrolling-of-move-up-->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<!--//smooth-scrolling-of-move-up-->
	<!-- Include jQuery & Filterizr -->
    <script src="js/jquery.filterizr.js"></script>
    <script src="js/controls.js"></script>
    <!-- Kick off Filterizr -->
    <script type="text/javascript">
        $(function() {
            //Initialize filterizr with default options
            $('.filtr-container').filterizr();
        });
    </script>
	<!--//gallery-->
	<!-- swipe box js -->
	<script src="js/jquery.swipebox.min.js"></script> 
	<script type="text/javascript">
			jQuery(function($) {
				$(".swipebox").swipebox();
			});
	</script>
	<!-- //swipe box js -->
	<!--search jQuery-->
	<script src="js/main.js"></script>
	<!--//search jQuery-->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>
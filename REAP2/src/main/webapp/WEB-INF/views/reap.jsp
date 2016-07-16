<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
  <title>REAP</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="shortcut icon" href="/assets/favicon-c06e02ee158e94e25e754cb87a2328fd.ico" type="image/x-icon"/>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .left-inner-addon {
    position: relative;
}
.left-inner-addon input {
    padding-left: 30px;    
}
.left-inner-addon i {
    position: absolute;
    padding: 10px 12px;
    pointer-events: none;
}
input[type="text"].search {
    background: url(search-25373b49c94cad607de9b22b01a47daa.png) 8px center no-repeat #ffffff;
    margin-right: 15px;
    padding-left: 28px;
    color: #000000;
}
html, body {
    max-width: 100%;
    overflow-x: hidden;
}



  </style>
</head>
<body style="background-image:url(texture.png)">

<div class="content-wrapper">

<nav class="navbar navbar-inverse ">
  
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="INDEX.HTML.html"><img src="reap.png" alt="View" style="width:120px;height:35px;margin-top:-5px"></a>
	  <img  src="r.png" alt="View" class ="hidden-xs" style="width:450px;height:45px;margin-top:5px;">
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
	  <li class="active"><a href="INDEX.HTML.html">Dashboard</a></li>
        <li ><a href="bb.html">My Bagdes</a></li>
        
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">My Account <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Configure</a></li>
            <li><a href="tt/index.html">Logout</a></li>
            
          </ul>
        </li>
       <li> <img src="aimg.jpg"  class=" hidden-xs" style="height:60px;width:60px;"></li> 
	   
    
      
     </ul>
      
    </div>
  </div>
  
     
	  
    </div>   
  
  
</nav>
  
</div>
<div class="content-wrapper">
<div class="container-fluid">
<div class="row" >


     <div class="col-md-9">
                      <div class="panel panel-default">
                      <div class="panel-heading" style="padding:10px;background-color:teal;color:white;font-size:15px;">RECOGNIZE KARMA</div>
                      <div class="panel-body">
			                 <div class="row">
							 
							        <div class="col-md-6">
											<div class="form-group">
								 
								 
											<div class="left-inner-addon ">
											<i class="glyphicon glyphicon-user"></i>
											<input type="text" class="form-control" id="name"  placeholder="SELECT A NEWER">
											</div>						  
											</div>
							        </div>
							        <div class="col-md-3">
									<div class="form-group">
											<select class="form-control " id="sel1">
											<option>Select a badge</option>
											<option>  <a>
											<img src="ico-badge-orange-7487656ca410c0f2051788659278f212.png">
											Gold
											<span>
											(<i class="user-gold-badge">2</i>)
											</span>
											</a></option>

											<option>SILVER</option>
											<option>BRONZE</option>
											</select>
							        </div>
							        </div>
							        <div class="col-md-3">
											<select class="form-control" id="sel1">
												<option>Select a Karma</option>
												<option>Extra Miler</option>
												<option>Knowledge Sharing</option>
												<option>Mentorship</option>
												<option>Pat on the back</option>
												<option>Customer Delight</option>
											</select>
							        </div>
							  </div>
							  <div class="row">
									    <div class="col-md-12">
							                      <div class="form-group">
												  <label>Reason:</label>
												  <textarea class="form-control " rows="5" id="comment" style="resize:none;" ></textarea> 
												  </div>
							            </div>
							  </div>
									<button class="btn btn-primary" type="button" >Recognize</button>
	
                       </div>
				  	 
					  
					  
			</div><!-- panel end -->
			                
			                        <div class="panel panel-danger">
			                      <div class="panel-heading">
			                                  <div class="row">
					                                <div class="col-md-5" > <img src="ico-wall-hover-b0efac84ef2af6d4790cd642372d7c9b.png" STYLE="MARGIN-RIGHT:4px;margin-top:1px;"><B>WALL OF FAME</B></div>
													<div class="col-md-2">
                                                             <div class="form-group">
								 
								 
									         
											
											<input type="text" class="form-control" id="SEARCH"  placeholder="SEARCH">
															  
											</div>
                                                   </div>
                                                   <div class="col-md-2">
												   <div class="form-group">
											<select class="form-control" id="selser">
												<option>Service Line</option>
												<option>Extra Miler</option>
												<option>Knowledge Sharing</option>
												<option>Mentorship</option>
												<option>Pat on the back</option>
												<option>Customer Delight</option>
											</select>
							        </div>
							        </div>
							        <div class="col-md-2">
									<div class="form-group">
											<select class="form-control" id="selprac">
												<option>Practices</option>
												<option>Extra Miler</option>
												<option>Knowledge Sharing</option>
												<option>Mentorship</option>
												<option>Pat on the back</option>
												<option>Customer Delight</option>
											</select>
							        </div>
							        </div>
							        
					                          </div>
			                      </div>
								  <div class="row">
						<div class="col-lg-1"><center><img src="aimg.jpg" class="img-circle" style="height:60px;width:60px;margin:20px;"></center> </div>
						<div class="col-lg-10" style="margin:20px;"><b>Agam Agarwal</b> has received <img src="ico-badge-orange-7487656ca410c0f2051788659278f212.png" > from <b> Ankur Singhal</b> for karma this and reason thisssss.
						<br><br><b> DATE:1-1-2016</b></div>
						</div><hr>
						<div class="row">
						<div class="col-lg-1"><center><img src="itika.png" class="img-circle" style="height:60px;width:60px;margin:20px;"></center> </div>
						<div class="col-lg-10" style="margin:20px;"><b>Itika Tyagi</b> has received <img src="ico-badge-grey-6e2741b0311f87111d40aac66392bf22.png" > from <b> Pranav Sharma</b> for karma this and reason thaaaaatttt.
						<br><br><b> DATE:15-11-2016</b></div>
						</div><hr>
						<div class="row">
						<div class="col-lg-1"><center><img src="nitin.jpg" class="img-circle" style="height:60px;width:60px;margin:20px;"></center> </div>
						<div class="col-lg-10" style="margin:20px;"><b>Nitin Khulbe</b> has received <img src="ico-badge-brown-6e5dc638c4ee9eef490cfcb0a5cce103.png" > from <b> Piyush Goel</b> for karma this and reason thaaaaatttt.
						<br><br><b> DATE:15-11-2016</b></div>
						</div><hr>
			                      </div>
			                                       <!-- row2 ends -->
            </div>                                                <!-- col-md-9  end -->
                                             
   
	<div class="col-md-3">                                        <!-- col-md-3 start-->
	                                       
	                      <div class="panel panel-warning">
								  <div class="panel-heading">
								  <div class="row"><div class="col-xs-2"><img src="ico-badge-orange-7487656ca410c0f2051788659278f212.png" ></div>
								  <div class="col-xs-6"> <b>My Badges</b> </div>
								  </div>
								  </div>
			
                                        <div class="panel-body "><center>
		                                      <div class="row">
                                               
		                                      <div class="col-md-4">
											  <center>
							                    <img src="aimg.jpg" class="img-circle" style="height:60px;width:60px;margin-right:20px;"></center>
			                                  </div>
			                                  <div class="col-md-8" >
			                                       <div class="row " >
															  <a href="bb.html" ><b>AGAM AGARWAL<b></a>
												   </div>
															  <div class="row" style="margin-top:15px;">
															  <div class="col-xs-3"><img src="ico-badge-orange-7487656ca410c0f2051788659278f212.png" ></div>
															  <div class="col-xs-3"><img src="ico-badge-grey-6e2741b0311f87111d40aac66392bf22.png" ></div>
															  <div class="col-xs-3"><img src="ico-badge-brown-6e5dc638c4ee9eef490cfcb0a5cce103.png" ></div>
															  </div>
															  <div class="row" style="margin-top:15px;">
															  <div class="col-xs-3" >5</div>
															  <div class="col-xs-3">7</div>
															  <div class="col-xs-3">2</div>
															  </div>
		                                    </div>
											
		                                     </div>
											</center> 
	                                    </div>
                          </div>
   

			
                            <div class="panel panel-default">
                            <div class="panel-heading" style="text-align:center">
                            <b>Newer Board</b>
                            </div>
		                    
			
                                        <div class="panel-body">
		                                    <div class="row">           <!-- row1 -->
		                                         <div class="col-md-4">
							                         <center>  <img src="aimg.jpg" class="img-circle" style="height:60px;width:60px;margin-right:20px;"></center>
			                                     </div>
			                                     <div class="col-md-8" >
			                                           <div class="row" style="margin-left:5px;">
															  <a href="bb.html" ><b>AGAM AGARWAL<b></a>
													   </div>
															  <div class="row" style="margin-top:15px;">
															  <div class="col-xs-3"><img src="ico-badge-orange-7487656ca410c0f2051788659278f212.png" ></div>
															  <div class="col-xs-3"><img src="ico-badge-grey-6e2741b0311f87111d40aac66392bf22.png" ></div>
															  <div class="col-xs-3"><img src="ico-badge-brown-6e5dc638c4ee9eef490cfcb0a5cce103.png" ></div>
															  </div>
															  <div class="row" style="margin-top:15px;margin-left:-5px;">
															  <div class="col-xs-3" >5</div>
															  <div class="col-xs-3">7</div>
															  <div class="col-xs-3">2</div>
															  </div>
		                                         </div>
		                                    </div>  <hr>                   <!-- row1 end -->
	                                        <div class="row" style="margin-top:20px;">
		                                          <div class="col-md-4">
							                            <center> <img src="nitin.jpg" class="img-circle"style="height:60px;width:60px;margin-right:20px;"></center>
			                                      </div>
															<div class="col-md-8" >
															<div class="row" style="margin-left:5px;">
																			  <a href="#" ><b>NITIN KHULBE<b></a></div>
																			  <div class="row" style="margin-top:15px;">
																			  <div class="col-xs-3"><img src="ico-badge-orange-7487656ca410c0f2051788659278f212.png" ></div>
																			  <div class="col-xs-3"><img src="ico-badge-grey-6e2741b0311f87111d40aac66392bf22.png" ></div>
																			  <div class="col-xs-3"><img src="ico-badge-brown-6e5dc638c4ee9eef490cfcb0a5cce103.png" ></div>
																			  </div>
																			  <div class="row" style="margin-top:15px;margin-left:-5px;">
																			  <div class="col-xs-3" >5</div>
																			  <div class="col-xs-3">7</div>
																			  <div class="col-xs-3">2</div>
																			  </div>
														     </div>
		                                      </div><hr>
	                                          <div class="row" style="margin-top:20px;">
															  <div class="col-md-4">
																			<center>	  <img src="itika.png" class="img-circle"style="height:60px;width:60px;margin-right:20px;"></center>
																</div>
																<div class="col-md-8" >
																<div class="row" style="margin-left:5px;">
																				  <a href="badges.html" ><b>Itika Tyagi<b></a></div>
																				  <div class="row" style="margin-top:15px;">
																				  <div class="col-xs-3"><img src="ico-badge-orange-7487656ca410c0f2051788659278f212.png" ></div>
																				  <div class="col-xs-3"><img src="ico-badge-grey-6e2741b0311f87111d40aac66392bf22.png" ></div>
																				  <div class="col-xs-3"><img src="ico-badge-brown-6e5dc638c4ee9eef490cfcb0a5cce103.png" ></div>
																				  </div>
																				  <div class="row" style="margin-top:15px;margin-left:-5px;">
																				  <div class="col-xs-3" >5</div>
																				  <div class="col-xs-3">7</div>
																				  <div class="col-xs-3">2</div>
																				  </div>
															  </div>
											   </div><hr>
	                                           <div style="background-color:white;text-align:right;margin-top:10px;"><a href="#"> VIEW ALL</a></div>
	
        
                                            </div>
											</div>
               
		 </div>
		 
<div class="row" >
<p><marquee>ALL RIGHT RESERVED BY TTND<img  src="r.png" alt="View" class ="hidden-xs" style="width:335px;height:15px;"></marquee></p>

</div>
</div>
</div>
                                                        
            
</body>
</html>

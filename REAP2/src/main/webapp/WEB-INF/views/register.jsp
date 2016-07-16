<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
       
        <title>Sign Up Form</title>
        <link rel="stylesheet" href="css/normalize.css">
        <link href='http://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/main.css">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<style>
		*, *:before, *:after {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}

body {
  font-family: 'Nunito', sans-serif;
  color: #384047;
}

form {
  max-width: 300px;
  margin: 10px auto;
  padding: 10px 20px;
  background: #f4f7f8;
  border-radius: 8px;
}

h1 {
  margin: 0 0 30px 0;
  text-align: center;
}

input[type="text"],
input[type="password"],
input[type="date"],
input[type="datetime"],
input[type="email"],
input[type="number"],
input[type="search"],
input[type="tel"],
input[type="time"],
input[type="url"],
textarea,
select {
  background: rgba(255,255,255,0.1);
  border: none;
  font-size: 16px;
  height: auto;
  margin: 0;
  outline: 0;
  padding: 15px;
  width: 100%;
  background-color: #e8eeef;
  color: #8a97a0;
  box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
  margin-bottom: 30px;
}

input[type="radio"],
input[type="checkbox"] {
  margin: 0 4px 8px 0;
}

select {
  padding: 6px;
  height: 32px;
  border-radius: 2px;
}

button {
  padding: 19px 39px 18px 39px;
  color: #FFF;
  background-color: #4bc970;
  font-size: 18px;
  text-align: center;
  font-style: normal;
  border-radius: 5px;
  width: 100%;
  border: 1px solid #3ac162;
  border-width: 1px 1px 3px;
  box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;
  margin-bottom: 10px;
}

fieldset {
  margin-bottom: 30px;
  border: none;
}

legend {
  font-size: 1.4em;
  margin-bottom: 10px;
}

label {
  display: block;
  margin-bottom: 8px;
}

label.light {
  font-weight: 300;
  display: inline;
}

.number {
  background-color: #5fcf80;
  color: #fff;
  height: 30px;
  width: 30px;
  display: inline-block;
  font-size: 0.8em;
  margin-right: 4px;
  line-height: 30px;
  text-align: center;
  text-shadow: 0 1px 0 rgba(255,255,255,0.2);
  border-radius: 100%;
}

@media screen and (min-width: 480px) {

  form {
    max-width: 480px;
  }

}
		</style>
    </head>
    <body style="background-image:url(images/a.jpg)">
	
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="INDEX.HTML.html"><img src="reap.png" alt="View" style="width:120px;height:35px;margin-top:-5px"></a>
	  <img  src="r.png" alt="View" class ="hidden-xs" style="width:350px;height:45px;margin-top:5px;position:relative;">
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
	   <li class="active"><a href="INDEX.HTML.html">Dashboard</a></li>
        <li ><a href="bb.html">My Bagdes</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">My Account <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Configure</a></li>
            <li><a href="#">Logout</a></li>
            
          </ul>
        </li>
         <li> <img src="aimg.jpg" class=" hidden-xs" style="height:60px;width:60px;"></li>
      </ul>
      
    </div>
  </div>
</nav>

      <form action="register" method="post" id="registration-form" >
      
        <h1>Sign Up</h1>
        
        <fieldset>
          <!-- <legend><span class="number">1</span>Your basic info</legend>  -->
          <label for="name">Name:</label>
          <input type="text" id="name" name="name">
          
          <label for="mail">Email:</label>
          <input type="email" id="mail" name="email">
          
          <label for="password">Password:</label>
          <input type="password" id="password" name="password">
          
		  <label for="mobilenumber">Mobile Number:</label>
          <input type="text" id="mobilenumber" name="mobilenumber">
		  
          <label>Role:</label>
		  <select id="job" name="user_job">
          
            <option value="Admin">Admin</option>
            <option value="supervisor">Supervisor</option>
            <option value="practicehead">Practice Head</option>
            
          </select>
      
        
        <label for="job">Service</label>
        <select id="job" name="user_job">
          <optgroup label="Web">
            <option value="frontend_developer">Technology</option>
            <option value="php_developor"></option>
            <option value="python_developer">Python Developer</option>
            <option value="rails_developer"> Rails Developer</option>
            <option value="web_designer">Web Designer</option>
            <option value="WordPress_developer">WordPress Developer</option>
          </optgroup>
          <optgroup label="Mobile">
            <option value="Android_developer">Androild Developer</option>
            <option value="iOS_developer">iOS Developer</option>
            <option value="mobile_designer">Mobile Designer</option>
          </optgroup>
          <optgroup label="Business">
            <option value="business_owner">Business Owner</option>
            <option value="freelancer">Freelancer</option>
          </optgroup>
          <optgroup label="Other">
            <option value="secretary">Secretary</option>
            <option value="maintenance">Maintenance</option>
          </optgroup>
        </select>
        
          <label>Practice</label>
		  <select id="job" name="user_job">
          <optgroup label="Web">
            <option value="frontend_developer">Technology</option>
            <option value="php_developor"></option>
            <option value="python_developer">Python Developer</option>
            <option value="rails_developer"> Rails Developer</option>
            <option value="web_designer">Web Designer</option>
            <option value="WordPress_developer">WordPress Developer</option>
          </optgroup>
          <optgroup label="Mobile">
            <option value="Android_developer">Androild Developer</option>
            <option value="iOS_developer">iOS Developer</option>
            <option value="mobile_designer">Mobile Designer</option>
          </optgroup>
          <optgroup label="Business">
            <option value="business_owner">Business Owner</option>
            <option value="freelancer">Freelancer</option>
          </optgroup>
          <optgroup label="Other">
            <option value="secretary">Secretary</option>
            <option value="maintenance">Maintenance</option>
          </optgroup>
        </select>
         
        
        </fieldset>
        <button type="submit">Sign Up</button>
      </form>
	  
	  <script src="js/jquery-1.7.1.min.js"></script> 

<script src="js/jquery.validate.js"></script> 

<script src="script.js"></script> 
<script>
		addEventListener('load', prettyPrint, false);
		$(document).ready(function(){
		$('pre').addClass('prettyprint linenums');
			});
		</script> 
      
    </body>
</html>
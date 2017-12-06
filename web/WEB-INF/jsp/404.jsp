<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Minimal 1.0 - Page 404</title>
	<link rel="icon" href="assets/images/title.ico" type="image/x-icon" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8" />

    <!-- Bootstrap -->
    <link href="assets/css/vendor/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/vendor/bootstrap-checkbox.css">

    <link href="assets/css/minimal.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="bg-1">

 


    <!-- Wrap all page content here -->
    <div id="wrap">

      <!-- Make page fluid -->
      <div class="row">
        
        <!-- Page content -->
        <div id="content" class="col-md-12 full-page error">

          <div class="search">
            <input type="text" class="form-control" placeholder="Search...">
          </div><!-- /input-group -->


          <div class="inside-block">

            <img src="assets/images/logo-big.png" alt class="logo">
          
            <h1 class="error">Error <strong>404</strong></h1>
            <p class="lead"><span class="overline">something's</span> not right here</p>
            <p>the page you are looking for cannot be found</p>

            <div class="controls">
              <button class="btn btn-cyan"><i class="fa fa-refresh"></i> Try Again</button>
              <button class="btn btn-greensea"><i class="fa fa-home"></i> Return to home</button>
              <button class="btn btn-red"><i class="fa fa-envelope"></i> Contact Support</button>
            </div>

          </div>


        </div>
        <!-- /Page content -->  

      </div>

    </div>
    <!-- Wrap all page content end -->

   </body>
</html>
      
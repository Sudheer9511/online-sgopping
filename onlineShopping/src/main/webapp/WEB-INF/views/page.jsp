<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var = "css" value = "/assets/css/" />
<spring:url var = "js" value = "/assets/js" />
<spring:url var = "images" value = "/assets/images" />


<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
        
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>S!d'sFactory</title>

<!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">
    

  </head>

  <body>
  
	<!-- Header -->
	   <%@ include file="shared/navbar.jsp" %>
	 <!-- End of Header -->
	 
	 <!-- Home page -->
	 	<%@ include file="home.jsp" %>
	 <!-- End of Home page -->
	 
	<!-- Footer -->
	   <%@ include file="shared/footer.jsp" %>
	<!-- End of Footer -->

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>

  </body>

</html>

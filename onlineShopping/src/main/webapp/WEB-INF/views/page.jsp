<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/assets/css/" />
<spring:url var="js" value="/assets/js" />
<spring:url var="images" value="/assets/images" />


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>S!d'sFactory - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<!-- Cosmo theme for this template -->
<link href="${css}/bootstrape-cosmo-theme.css" rel="stylesheet">


</head>

<body>

	<div class="wrapper">
		<!-- Header -->
		<%@ include file="shared/navbar.jsp"%>
		<!-- End of Header -->

		<div class="content">

				<!-- Page Content -->
					<!-- Load only when user clicks Home -->
					<c:if test="${userClickHome == true}">
						<%@ include file="home.jsp"%>
					</c:if>
					<!-- End of Home page -->
		
					<!-- Load only when user clicks About -->
					<div style="margin:15px; padding:15px;">
						<c:if test="${userClickAbout == true}">
							<%@ include file="about.jsp"%>
						</c:if>
					</div>
					<!-- End of About page -->
		
					<!-- Load only when user clicks Contact -->
					<c:if test="${userClickContact == true}">
						<%@ include file="contact.jsp"%>
					</c:if>
					
					<!-- Load only when user clicks ViwProducts -->
					<div style="margin:-15px; padding:-15px;">
						<c:if test="${userClickAllProducts == true}"><!--  or userClickCategoryProducts == true -->
							<%@ include file="listProducts.jsp"%>
						</c:if>
					</div>
					
					<!-- Load only when user clicks ViwCategory -->
					<div style="margin:-15px; padding:-15px;">
						<c:if test="${userClickCategoryProducts == true}">
							<%@ include file="listProducts.jsp"%>
						</c:if>
					</div>
					
				<!-- End of Contact page -->

			<!-- End of Page Content -->

		</div>

		<!-- Footer -->
		<%@ include file="shared/footer.jsp"%>
		<!-- End of Footer -->

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/myapp.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>

	</div>

</body>

</html>

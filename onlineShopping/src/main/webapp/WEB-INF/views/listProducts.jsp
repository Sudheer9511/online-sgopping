<div class="container">
	<div class="row">
	
		<!--  To display sideBar -->
		<div class="col-md-3">
			<%@ include file="./shared/sidebar.jsp" %>
		</div>
		<!--  End of sideBar sideBar -->
		
		<!--  To display the products -->
		<div class="col-md-9">
			
			<!-- add BreadCrumb component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href = "${contextRoot}/home"> Home </a></li>
							<li class="active"> / All  Products</li>
							
						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href = "${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
							
						</ol>
					</c:if>
					
				</div>
			</div>
		
		</div>    
		<!--  End of Products products -->
		
	</div>

</div>
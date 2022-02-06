<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifier un produit</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <%@ include file="header.jsp" %>
	<div class="container justify-container-center col-md-4 mt-5">
	   
		<div class="card">
		  <div class="card-header">Modifier un produit</div>
		  <div class="card-body">
		 <form method="post" action="update.do">
		 <div class="mb-3">
			    <label  class="form-label">Id</label>
			    <input type="hidden" name="id" value="${produit.id}" class="form-control" >
			    <label> ${produit.id} </label>
			    <span></span>
			  </div>
			   <div class="mb-3">
			    <label  class="form-label">Designation</label>
			    <input type="text" name="designation" value="${produit.designation}" class="form-control" >
			    <span></span>
			  </div>
			   <div class="mb-3">
			    <label  class="form-label">Prix</label>
			    <input type="text" name="prix" value="${produit.prix}" class="form-control" >
			    <span></span>
			  </div>
			   <div class="mb-3">
			    <label  class="form-label">Quantité</label>
			    <input type="text" name="quantity" value="${produit.quantity}" class="form-control" >
			    <span></span>
			  </div>
			  <button type="submit" class="btn btn-warning">Modifier</button>
			</form>
		  	
		  </div>
		</div>
	</div>
</body>
</html>
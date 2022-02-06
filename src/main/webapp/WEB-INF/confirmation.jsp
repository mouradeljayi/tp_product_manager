<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <%@ include file="header.jsp" %>
	<div class="container justify-container-center col-md-4 mt-5">
	   
		<div class="card">
		  <div class="card-header">Confirmation</div>
		  <div class="card-body">
		  <div class="mb-3">
			    <label  class="form-label">Id:</label>
			    <label  class="form-label">${produit.id}</label>
			  </div>
		  	<div class="mb-3">
			    <label  class="form-label">Designation:</label>
			    <label  class="form-label">${produit.designation}</label>
			  </div>
			   <div class="mb-3">
			    <label  class="form-label">Prix:</label>
			    <label  class="form-label">${produit.prix}</label>
			  </div>
			   <div class="mb-3">
			    <label  class="form-label">Quantité:</label>
			    <label  class="form-label">${produit.quantity}</label>
			  </div>
		  	
		  </div>
		</div>
	</div>
</body>
</html>
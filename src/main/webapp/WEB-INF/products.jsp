<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste de produits</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <%@ include file="header.jsp" %>
	<div class="container justify-container-center col-md-8 mt-5">
		<div class="card">
		  <div class="card-header">Catalogue de produits</div>
		  <div class="card-body">
		  	<form action="recherche.do" method="get">
		  		<div class="row g-3 align-items-center">
		  		<div class="col-auto">
				    <label class="col-form-label">Mot clé</label>
				  </div>
				  <div class="col-auto">
				    <input type="text" name="motCle" value="${model.motCle}" class="form-control">
				  </div>
				  <div class="col-auto">
				    <button class="btn btn-primary" type="submit">Rechercher</button>
				  </div>
				</div>
		  	</form>
		  	<table class="table table-bordered mt-3">
			  <thead>
			    <tr>
			      <th>Id</th>
			      <th>Designation</th>
			      <th>Prix</th>
			      <th>Quantité</th>
			    </tr>
			  </thead>
			  <tbody>
				  <c:forEach items="${model.products}" var="p">
				    <tr>
				      <td>${p.id}</td>
				      <td>${p.designation}</td>
				      <td>${p.prix}</td>
				      <td>${p.quantity}</td>
				      <td> <a class="btn btn-sm btn-warning" href="edit.do?id=${p.id}">Modifier</a> </td>
				      <td> <a class="btn btn-sm btn-danger" href="delete.do?id=${p.id}">Supprimer</a> </td>
				    </tr>
				   </c:forEach>
			  </tbody>
			</table>
		  </div>
		</div>
	</div>
</body>
</html>
package web;

import java.io.IOException;
import java.util.List;

import org.apache.catalina.connector.Response;

import dao.IProduitDao;
import dao.ProduitDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.entities.Product;

@WebServlet(name="/produits", urlPatterns= {"*.do"})
public class ControllerServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IProduitDao metier;
	
	@Override
	public void init() throws ServletException {
		metier =  new ProduitDaoImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	         throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/recherche.do")) {
			String motCle = request.getParameter("motCle");
			ProductsModel model = new ProductsModel();
			model.setMotCle(motCle);
			List<Product> products = metier.produitParMC("%"+motCle+"%");
			model.setProducts(products);
			request.setAttribute("model", model);
			request.getRequestDispatcher("WEB-INF/products.jsp").forward(request, response);
		}
		else if(path.equals("/ajout.do")) {
			request.getRequestDispatcher("WEB-INF/addProduct.jsp").forward(request, response);
		}
		else if(path.equals("/save.do") && (request.getMethod().equals("POST"))) {
			String des = request.getParameter("designation");
			double prix = Double.parseDouble(request.getParameter("prix"));
			int qty = Integer.parseInt(request.getParameter("quantity"));
			Product p = metier.save(new Product(des, prix, qty));
			request.setAttribute("produit", p);
			request.getRequestDispatcher("WEB-INF/confirmation.jsp").forward(request, response);
		} 
		else if(path.equals("/delete.do")) {
			Long id = Long.parseLong(request.getParameter("id"));
			metier.delete(id);
			response.sendRedirect("recherche.do?motCle=");
		}
		else if(path.equals("/edit.do")) {
			Long id = Long.parseLong(request.getParameter("id"));
			Product p = metier.getProduct(id);
			request.setAttribute("produit", p);
			request.getRequestDispatcher("WEB-INF/edit.jsp").forward(request, response);
		}
		else if(path.equals("/update.do") && (request.getMethod().equals("POST"))) {
			String des = request.getParameter("designation");
			Long id = Long.parseLong(request.getParameter("id"));
			double prix = Double.parseDouble(request.getParameter("prix"));
			int qty = Integer.parseInt(request.getParameter("quantity"));
			Product p = new Product(des, prix, qty);
			p.setId(id);
			metier.update(p);
			request.setAttribute("produit", p);
			request.getRequestDispatcher("WEB-INF/confirmation.jsp").forward(request, response);
		} 
		else if(path.equals("/index.do")) {
			request.getRequestDispatcher("WEB-INF/products.jsp").forward(request, response);
		} else {
			response.sendError(Response.SC_NOT_FOUND);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}

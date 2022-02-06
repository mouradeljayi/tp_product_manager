package dao;

import java.util.List;

import metier.entities.Product;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImpl dao = new ProduitDaoImpl();
		Product p1 = dao.save(new Product("HP", 900, 45));
		Product p2 = dao.save(new Product("DELL", 800, 50));
		Product p3 = dao.save(new Product("LENOVO", 400, 32));
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		System.out.println("Chercher un produit");
		List<Product> products = dao.produitParMC("%N%");
		for(Product p :products) {
			System.out.println(p.toString());
		}
	}

}

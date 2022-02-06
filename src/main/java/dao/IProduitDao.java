package dao;

import java.util.List;

import metier.entities.Product;

public interface IProduitDao {
	
	public Product save(Product p);
	public List<Product> produitParMC(String mc);
	public Product getProduct(Long id);
	public Product update(Product p);
	public void delete(Long id);
}

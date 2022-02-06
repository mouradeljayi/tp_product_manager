package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Product;

public class ProductsModel {
	private String motCle;
	private List<Product> products = new ArrayList<Product>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}

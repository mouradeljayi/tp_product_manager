package metier.entities;

import java.io.Serializable;

public class Product implements Serializable {
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", designation=" + designation + ", prix=" + prix + ", quantity=" + quantity + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String designation;
	private double prix;
	private int quantity;
	public Product(String designation, double prix, int quantity) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantity = quantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

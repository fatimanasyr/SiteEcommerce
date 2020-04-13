package model;

import java.util.List;

public class Product {
	
	private int id;
	private String name;
	private float salePrice;
	private float oldPrice;
	private String mainPathPicture;
	private String description;
	private int quantityStock;
	private List<Review> listReview;
	private Categorie categorie;

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Review> getListReview() {
		return listReview;
	}

	public void setListReview(List<Review> listReview) {
		this.listReview = listReview;
	}

	public Product(int id, String name, float salePrice, float oldPrice, String mainPathPicture, String description, int quantityStock) {
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
		this.oldPrice = oldPrice;
		this.mainPathPicture = mainPathPicture;
		this.description = description;
		this.quantityStock = quantityStock;

		if(this.oldPrice<this.salePrice)
			this.oldPrice = this.salePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public float getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(float oldPrice) {
		this.oldPrice = oldPrice;
	}

	public String getMainPathPicture() {
		return mainPathPicture;
	}

	public void setMainPathPicture(String mainPathPicture) {
		this.mainPathPicture = mainPathPicture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}
}

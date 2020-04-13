package controller;

import model.Categorie;
import model.Customer;
import model.Product;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product(1,"souris",40,60,"","cette souris perment de faire double click",15);
		Customer c1 = new Customer();
		Categorie cat1 = new Categorie();

		p1.setCategorie(cat1);
	}

}

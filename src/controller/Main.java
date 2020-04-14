package controller;

import model.Categorie;
import model.Customer;
import model.Product;
import model.Review;

public class Main {

	public static void main(String[] args) {
		//senario of using classes
        //senario1
		Review r = new Review(1,"great product",4);
		Customer c = new Customer(1,"ahmed","dsqfd","dsqf@fqf.fe","1213","lksjdqfl");
		Product p = new Product(1,"souris",15,12,"","great product",20);
		r.setCustomer(c);
		r.setProduct(p);
		c.addReview(r);
		System.out.println(c.getListReview().get(0).getComment());
	}

}

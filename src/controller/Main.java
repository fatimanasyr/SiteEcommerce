package controller;

import model.*;
import repository.AdminRepository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
        AdminRepository adminRepository = new AdminRepository();


		//senario of using classes
		//senario1
		Review r = new Review(1,"great product",4);
		Customer c = new Customer(1,"ahmed","dsqfd","dsqf@fqf.fe","1213","lksjdqfl");
		Product p = new Product(1,"souris",15,12,"","great product",20);
		Order o = new Order(1,new Date(2020,01,01));
		r.setCustomer(c);
		r.setProduct(p);
		c.addReview(r);

//		Admin admin = new Admin(1,"hello@gqs.co","sometihing","something");
//		Admin admin2 = new Admin(2,"hello@gqs.co","sometihing","something");
//		Admin admin3 = new Admin(3,"hello@gqs.co","sometihing","something");
//		Admin admin4 = new Admin(4,"hello@gqs.co","sometihing","something");

//		adminRepository.create(admin);
//		adminRepository.create(admin2);
//		adminRepository.create(admin3);
//		adminRepository.create(admin4);

//		adminRepository.remove(admin.getId());
		for (Admin admin:	adminRepository.getAll()) {
			System.out.println(admin.getId());
		}

//		Admin admin4 = new Admin(4,"hello@gqs.co","sometihing","something");
//		admin4.setEmail("aaaaa@sqf.fe");
//		adminRepository.update(admin4);

		System.out.println(c.getListReview().get(0).getComment());
	}
}

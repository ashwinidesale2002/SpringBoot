package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.Entity.Product;
import com.product.Repository.ProductRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class Productcreateupdatedelete1Application implements CommandLineRunner{
	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(Productcreateupdatedelete1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Product p1=Product.builder().productName("HP").price(34000).build();
		Product p2=Product.builder().productName("lenovo").price(32000).build();
		Product p3=Product.builder().productName("dell").price(30000).build();
		Product p4=Product.builder().productName("Apple").price(90000).build();
		
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		
		System.out.println("--------All Saved");
		
	}

}

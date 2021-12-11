package usantatecla.movies.v22;

import usantatecla.movies.v22.Customer;
import usantatecla.movies.v22.Rental;

import java.util.ArrayList;
import java.util.List;

public class CustomerBuilder {

	private String name;
	private List<usantatecla.movies.v22.Rental> rentals;
	
	public CustomerBuilder() {
		rentals = new ArrayList<usantatecla.movies.v22.Rental>();
	}
	
	public CustomerBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public CustomerBuilder rental(usantatecla.movies.v22.Rental rental) {
		rentals.add(rental);
		return this;
	}
	
	public usantatecla.movies.v22.Customer build() {
		usantatecla.movies.v22.Customer customer = new Customer(name);
		for(Rental rental : rentals) {
			customer.addRental(rental);
		}
		return customer;
	}
}

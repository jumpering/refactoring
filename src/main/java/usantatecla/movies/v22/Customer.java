package usantatecla.movies.v22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentalList;

	public Customer(String name) {
		this.name = name;
		rentalList = new ArrayList<Rental>();
	}

	public void addRental(Rental rental) {
		rentalList.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		String result = Message.RENTAL_RECORD + this.getName() + Message.LINE_BREAK;
		while (this.rentalList.iterator().hasNext()){
			Rental nextRental = this.rentalList.iterator().next();
			result += Message.TABULATE + nextRental.getMovie().getTitle() + Message.TABULATE + String.valueOf(nextRental.getCharge()) + Message.LINE_BREAK;
		}
		result += Message.AMOUNT + String.valueOf(this.getTotalCharge()) + Message.LINE_BREAK;
		result += Message.EARNED + String.valueOf(this.getTotalFrequentRenterPoints()) + Message.FREQUENT_RENTER;
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		while (this.rentalList.iterator().hasNext()) {
			Rental nextRental = rentalList.iterator().next();
			result += nextRental.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		while (this.rentalList.iterator().hasNext()) {
			Rental nextRental = rentalList.iterator().next();
			result += nextRental.getFrequentRenterPoints();
		}
		return result;
	}

}

package vehicl;

public class Vehicle {
	    private String make;
	    private String model;
	    private int year;

	    public Vehicle(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public String description() {
	        return "This is a " + year + " " + make + " " + model + ".";
	    }

	    public String drive(int distance) {
	        return "The " + make + " " + model + " drove " + distance + " miles.";
	    }

	    public String service() {
	        return "The " + make + " " + model + " underwent regular service.";
	    }

	    public String service(String serviceType) {
	        return "The " + make + " " + model + " underwent " + serviceType + " service.";
	    }

	public static void main(String[] args) {
		Vehicle car = new Vehicle("Toyota", "Camry", 2020);

	        // Calling overloaded methods with different numbers of arguments
	        System.out.println(car.description());        // Method with no arguments
	        System.out.println(car.drive(100));           // Method with one argument
	        System.out.println(car.service());            // Method with default argument
	        System.out.println(car.service("major"));     // Method with different argument
	    }
	

	}



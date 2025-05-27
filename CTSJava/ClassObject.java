package CTSJava;

class Car{
	String make;
	String model;
	int year;

 Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
}
 public void displayDetails() {
     System.out.println("Car Details: \n");
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
 }
 }

public class ClassObject {
	public static void main(String[] args) {
	Car myCar = new Car("BMW", "M5 CS", 2025);
	myCar.displayDetails();
}
}
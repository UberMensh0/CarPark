package fop.w5cars;

public class Car {
	// TODO
    private static int count = 0;
    int chassisNumber;
    String brand;
   LicensePlate licensePlate;
    public Car(String brand, LicensePlate LicensePlate){
        this.brand = brand;
        this.licensePlate = licensePlate;

        this.chassisNumber = count;
        count++;
    }
    public String toString(){
        return "Car: " + this.chassisNumber + "(Brand: " + this.brand + ". licensePlate: " + this.licensePlate.toString() + ")";
    }
}

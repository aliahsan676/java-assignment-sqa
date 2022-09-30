package assignment5;

public class TestPolymorphism {
    public static void main(String[] args) {
        Vehicle4 myVehicle = new Vehicle4();       // Object created for each class under Super Class: Vehicle
        Vehicle4 myBus = new Bus();
        Vehicle4 myCar = new Car();
        Vehicle4 myMotorcycle = new Motorcycle();
        myVehicle.vehicleFuel();            // Calling the vehicleFuel method for each class
        myBus.vehicleFuel();
        myCar.vehicleFuel();
        myMotorcycle.vehicleFuel();
    }
}

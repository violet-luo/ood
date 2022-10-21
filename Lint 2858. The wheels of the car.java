// Vehicle.java
public abstract class Vehicle {
    public abstract String NoOfWheels();
}

// Car.java
public class Car extends Vehicle {    
    public String NoOfWheels() {
        return "This car has four wheels";
    }
}

// Motorbike.java
public class Motorbike extends Vehicle {
    public String NoOfWheels() {
        return "This Motorbike has two wheels";
    }
}

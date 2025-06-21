package finalAssignment;
abstract class Vehicle {
    abstract double calculateRental(int hours);
}

class Car extends Vehicle {
    @Override
    double calculateRental(int hours) {
        return hours * 20.0;
    }
}

class Motorcycle extends Vehicle {
    @Override
    double calculateRental(int hours) {
        return hours * 10.0;
    }
}

class Bicycle extends Vehicle {
    @Override
    double calculateRental(int hours) {
        return hours * 5.0;
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();

        int rentalHours = 4;

        System.out.println("Car rental cost for " + rentalHours + " hours: $" + car.calculateRental(rentalHours));
        System.out.println("Motorcycle rental cost for " + rentalHours + " hours: $" + motorcycle.calculateRental(rentalHours));
        System.out.println("Bicycle rental cost for " + rentalHours + " hours: $" + bicycle.calculateRental(rentalHours));
    }
}

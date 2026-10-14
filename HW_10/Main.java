abstract class Vehicle {
    String brand;
    int speed;

    public abstract void move();
}
    class Car extends Vehicle {
    public void move(){
        System.out.println("The car drives on the road.");
    }
   }

   class Motorbike extends Vehicle{
    public void move(){
        System.out.println("The motorbike rides on the road.");
    }
   }

   class Aircraft extends Vehicle{
    public void move(){
        System.out.println("The aircraft flies in the sky.");
    }
   }

   class Ship extends Vehicle{
    public void move(){
        System.out.println("The ship sails on the water.");
    }
   }

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Toyota";
        car.speed = 120;

        System.out.println("Car: " + car.brand);
        System.out.println("Speed: " + car.speed);

        car.move();

        Motorbike motorbike = new Motorbike();

        motorbike.brand = "Honda";
        motorbike.speed = 100;

        System.out.println();
        System.out.println("Motorbike: " + motorbike.brand);
        System.out.println("Speed: " + motorbike.speed);

        motorbike.move();

        Aircraft aircraft = new Aircraft();

        aircraft.brand = "Boeing";
        aircraft.speed = 900;

        System.out.println();
        System.out.println("Aircraft: " + aircraft.brand);
        System.out.println("Speed: " + aircraft.speed);

        aircraft.move();

        Ship ship = new Ship();

        ship.brand = "Royal Caribbean";
        ship.speed = 40;

        System.out.println();
        System.out.println("Ship: " + ship.brand);
        System.out.println("Speed: " + ship.speed);

        ship.move();
    }
    
    
}

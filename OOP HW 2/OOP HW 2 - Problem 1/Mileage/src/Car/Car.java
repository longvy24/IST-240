
package Car;

/**
 *
 * @author lfv5020
 */




class Car {

    double fuelEfficiency;
    double fuel;

    Car(double efficiency) {

        fuelEfficiency = efficiency;

    } 

    void drive(double distance) {

        fuel -= distance / fuelEfficiency; 

    } 

    double getFuelLevel() {

        return fuel; 

    } 

    void tank(double extraFuel) {

        fuel += extraFuel; 

    }

    public static void main(String[] args) {
      
        

        Car myCar1 = new Car(30);                                                // Why Doesn't this print out properly?
        System.out.println("Miles per gallon: " + myCar1.getFuelLevel());        // Why does this work all together, but not separately?
        
        myCar1.tank(20); 
        System.out.println("Gallons added: " + myCar1.getFuelLevel()); 
        
        myCar1.drive(100); 
        System.out.println("Fuel leftover: " + myCar1.getFuelLevel()); 

    } 
} 
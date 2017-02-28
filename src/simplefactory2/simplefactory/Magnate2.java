package simplefactory2.simplefactory;

import simplefactory2.simplefactory.imple.factory.BenzDriver;
import simplefactory2.simplefactory.interf.Car;
import simplefactory2.simplefactory.role.abs.Driver;

/**
 * Created by wind on 2017/2/24.
 */
public class Magnate2 {
    public static void main(String args[]) {
        System.out.println("Hello World2!");
        try {
//            Car benz = Driver.driverCar("Bmw");
//            benz.drive();
            Driver driver = new BenzDriver();
            Car car = driver.driverCar();
            car.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

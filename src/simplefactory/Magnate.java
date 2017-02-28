package simplefactory;

import simplefactory.interf.Car;
import simplefactory.role.Driver;

/**
 * Created by hui on 2017/2/24.
 */
public class Magnate {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        try {
            Car benz = Driver.driverCar("Bmw");
            benz.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

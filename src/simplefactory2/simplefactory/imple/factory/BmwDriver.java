package simplefactory2.simplefactory.imple.factory;

import simplefactory2.simplefactory.imple.Bmw;
import simplefactory2.simplefactory.interf.Car;
import simplefactory2.simplefactory.role.abs.Driver;

/**
 * Describe 具体工厂角色
 * Created by hui on 2017/2/28.
 */
public class BmwDriver implements Driver {
    public BmwDriver() {
        System.out.println("new BmwDriver..");
    }

    @Override
    public Car driverCar() {
        return new Bmw();
    }
}

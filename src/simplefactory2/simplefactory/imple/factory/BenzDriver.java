package simplefactory2.simplefactory.imple.factory;

import simplefactory2.simplefactory.imple.Benz;
import simplefactory2.simplefactory.interf.Car;
import simplefactory2.simplefactory.role.abs.Driver;

/**
 * Describe 具体工厂角色
 * Created by wind on 2017/2/28.
 */
public class BenzDriver implements Driver {
    @Override
    public Car driverCar() {
        return new Benz();
    }
}
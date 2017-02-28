package simplefactory2.simplefactory.imple.factory;

import simplefactory2.simplefactory.imple.Audi;
import simplefactory2.simplefactory.interf.Car;
import simplefactory2.simplefactory.role.abs.Driver;

/**
 * Describe 具体工厂角色
 * Created by wind on 2017/2/28.
 */
public class AudiDriver implements Driver {
    @Override
    public Car driverCar() {
        return new Audi();
    }
}

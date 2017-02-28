package simplefactory.role;

import simplefactory.imple.Audi;
import simplefactory.imple.Bmw;
import simplefactory.imple.Benz;
import simplefactory.interf.Car;

/**Describe 工厂类角色
 * Created by wind on 2017/2/27.
 */
public class Driver {
    public static Car driverCar(String s) throws Exception{
        if (s.equalsIgnoreCase("Benz")){
            return new Benz();
        }else if (s.equalsIgnoreCase("Bmw")){
            return new Bmw();
        }else if (s.equalsIgnoreCase("Audi")){
            return new Audi();
        }else{
            return null;
        }
    }
}

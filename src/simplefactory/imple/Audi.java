package simplefactory.imple;

import simplefactory.interf.Car;

/**Describe 具体产品角色
 * Created by hui on 2017/2/27.
 */
public class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Audi----");
    }
}

package simplefactory2.simplefactory.imple;

import simplefactory2.simplefactory.interf.Car;

/**Describe 具体产品角色
 * Created by hui on 2017/2/28.
 */
public class Audi implements Car {
    public Audi() {
        System.out.println("new Audi...");
    }

    @Override
    public void drive() {
        System.out.println("Audi----");
    }
}

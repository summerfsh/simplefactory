package simplefactory2.simplefactory.imple;

import simplefactory2.simplefactory.interf.Car;

/**Describe 具体产品角色
 * Created by hui on 2017/2/27.
 */
public class Benz implements Car {
    public Benz() {
        System.out.println("new Benz...");
    }

    @Override
    public void drive() {
        System.out.println("Benz----");
    }
}

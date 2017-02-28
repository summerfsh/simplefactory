package simplefactory2.simplefactory.imple;

import simplefactory2.simplefactory.interf.Car;

/**Describe 具体产品角色
 * Created by wind on 2017/2/27.
 */
public class Bmw implements Car {
    @Override
    public void drive() {
        System.out.println("Bmw----");
    }
}

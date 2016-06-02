package DuckImpl;

import BehaviorImpl.FlyWithWingsImpl;
import BehaviorImpl.Quack;
import Duck.Duck;
/**
 * 
 * @author Administrator
 *
 */
public class MallardDuck extends Duck {
public MallardDuck() {
	setFlyBehavior(new FlyWithWingsImpl());
	setQuackBehavior(new Quack());
}
	@Override
	public void display() {
		System.out.println("我是  一只MallarDuck");
	}

}

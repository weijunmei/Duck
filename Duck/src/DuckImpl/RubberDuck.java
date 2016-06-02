package DuckImpl;

import BehaviorImpl.FlyNoWay;
import BehaviorImpl.Squeak;
import Duck.Duck;
/**
 * 
 * @author Administrator
 *
 */

public class RubberDuck extends Duck {
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}
	@Override
	public void display() {
		System.out.println("我是 一只RubberDuck");
	}

}

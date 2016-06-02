package DuckImpl;

import BehaviorImpl.FlywithRocketImpl;
import BehaviorImpl.Quack;
import Duck.Duck;
/**
 * 
 * @author Administrator
 *
 */
public class RedHeadDuck extends Duck {
public RedHeadDuck() {
	setFlyBehavior(new FlywithRocketImpl());
	setQuackBehavior(new Quack() );
}
	@Override
	public void display() {
		System.out.println("我是一只  RedHeadDuck!");
	}

}

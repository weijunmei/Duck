package Duck.test;

import Duck.Duck;
import DuckImpl.MallardDuck;
import DuckImpl.RedHeadDuck;
import DuckImpl.RubberDuck;

public class DuckTest {
	public static void main(String[] args) {
		
		System.out.println("！！！！！！！！！！！！！！");
		Duck rubber=new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		rubber.swim();
		System.out.println("！！！！！！！！！！！！！！");
		
		
		Duck redHead=new RedHeadDuck();
		redHead.display();
		redHead.performFly();
		rubber.performQuack();
		redHead.swim();
		System.out.println("！！！！！！！！！！！！！！");
		
		
		Duck mallar=new MallardDuck();
		mallar.display();
		mallar.performFly();
		mallar.performQuack();
		mallar.swim();
		System.out.println("！！！！！！！！！！！！！！");
	}
}

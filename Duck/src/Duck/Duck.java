package Duck;

import IBehavior.IFlyBehavior;
import IBehavior.IQuackBehavior;
/**
 * 
 * @author Administrator
 *
 */
public abstract class Duck {
	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void swim(){
		System.out.println("���ǻ���Ӿ��");
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	public abstract void display();
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(IQuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}

package factory.halfsimple;


import factory.after.model.IPhone;
import factory.halfsimple.factory.IPhone11Factory;
import factory.halfsimple.factory.IPhoneFactory;
import factory.halfsimple.factory.IPhoneXFactory;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = gen11Factory.orderIPhone("standard");
		System.out.println(iphone2);


	}
}

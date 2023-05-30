package factory.simple;


import factory.after.model.IPhone;
import factory.simple.factory.IPhoneSimpleFactory;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone3 = IPhoneSimpleFactory.orderIPhone("11", "standard");
		System.out.println(iphone3);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone4 = IPhoneSimpleFactory.orderIPhone("X", "highEnd");
		System.out.println(iphone4);
	}
}

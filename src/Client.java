import factory.IPhone11Factory;
import factory.IPhoneFactory;
import factory.IPhoneXFactory;
import factory.IPhoneXSMaxFactory;
import model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		IPhoneFactory genXSFactory = new IPhoneXSMaxFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone();
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone XS MAX");
		IPhone iphone3 = genXSFactory.orderIPhone();
		System.out.println(iphone2);
	}
}

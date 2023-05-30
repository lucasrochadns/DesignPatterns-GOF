package abstractfactory.apple;


import abstractfactory.apple.factory.IPhone11Factory;
import abstractfactory.apple.factory.IPhoneFactory;
import abstractfactory.apple.factory.IPhoneXFactory;
import abstractfactory.apple.factory.abstractfactory.BrazilianRulesAbstractFactory;
import abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import abstractfactory.apple.factory.abstractfactory.USRulesAbstractFactory;
import abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		/**/
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory rules1 = new USRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);

		IPhoneFactory genXFactory1 = new IPhoneXFactory(rules1);
		IPhoneFactory gen11Factory1 = new IPhone11Factory(rules1);



		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);

		System.out.println("### Ordering an iPhone X");
		IPhone iphone3 = genXFactory1.orderIPhone("standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone4 = gen11Factory1.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}

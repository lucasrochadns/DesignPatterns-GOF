package before;


import after.model.*;

public class Client {
	
	public IPhone orderIPhone(String generation, String level) {
		IPhone device = null;
		
		if("X".equals(generation)) {
			if("standard".equals(level)) {
				device = new IPhoneX();
			} else if("highEnd".equals(level)) {
				device = new IPhoneXSMax();
			}
		} else if("11".equals(generation)) {
			if("standard".equals(level)) {
				device = new IPhone11();
			} else if("highEnd".equals(level)) {
				device = new IPhone11Pro();
			}
		}

		if(device != null){
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}

		return device;
	}

	public static void main(String[] args) {
		Client client = new Client();
		
		System.out.println("### Ordering an iPhone 11");
		IPhone iphone = client.orderIPhone("11", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = client.orderIPhone("11", "highEnd");
		System.out.println(iphone2);

		System.out.println("### Ordering an iPhone X");
		IPhone iphone3 = client.orderIPhone("X", "standard");
		System.out.println(iphone3);

		System.out.println("\n\n### Ordering an iPhone X HighEnd");
		IPhone iphone4 = client.orderIPhone("X", "highEnd");
		System.out.println(iphone3);
	}
}

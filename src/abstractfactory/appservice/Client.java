package abstractfactory.appservice;

import abstractfactory.appservice.factory.EJBAbstractFactory;
import abstractfactory.appservice.factory.RestAbstractFactory;
import abstractfactory.appservice.factory.ServicesAbstractFactory;
import abstractfactory.appservice.services.CarService;
import abstractfactory.appservice.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new EJBAbstractFactory();
        ServicesAbstractFactory factory2 = new RestAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");


	     UserService userService1 = factory2.getUserService();
		 userService1.save("Luck");
		 userService1.delete(2);

		 CarService carService1 = factory2.getCarService();
		 carService1.save("S10");
		 carService1.update("HILLUX HIGHLANDS");
	}
}

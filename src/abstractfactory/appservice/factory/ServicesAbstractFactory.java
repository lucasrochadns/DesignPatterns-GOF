package abstractfactory.appservice.factory;


import abstractfactory.appservice.services.CarService;
import abstractfactory.appservice.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}

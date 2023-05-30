package abstractfactory.appservice.factory;


import abstractfactory.appservice.services.CarEJBService;
import abstractfactory.appservice.services.CarService;
import abstractfactory.appservice.services.UserEJBService;
import abstractfactory.appservice.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}




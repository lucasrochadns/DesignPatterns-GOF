package abstractfactory.appservice.factory;


import abstractfactory.appservice.services.CarRestApiService;
import abstractfactory.appservice.services.CarService;
import abstractfactory.appservice.services.UserRestApiService;
import abstractfactory.appservice.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}

package factory;


import model.IPhone;
import model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}

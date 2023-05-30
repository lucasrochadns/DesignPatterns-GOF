package after.factory;


import after.model.IPhone;
import after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}

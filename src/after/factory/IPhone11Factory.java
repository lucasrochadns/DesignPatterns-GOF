package after.factory;


import after.model.IPhone;
import after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}

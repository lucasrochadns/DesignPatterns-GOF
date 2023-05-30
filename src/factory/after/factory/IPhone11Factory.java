package factory.after.factory;


import factory.after.model.IPhone;
import factory.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}

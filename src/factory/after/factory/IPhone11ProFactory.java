package factory.after.factory;


import factory.after.model.IPhone;
import factory.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}

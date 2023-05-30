package after.factory;


import after.model.IPhone;
import after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}

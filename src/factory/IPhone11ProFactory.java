package factory;


import model.IPhone;
import model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}

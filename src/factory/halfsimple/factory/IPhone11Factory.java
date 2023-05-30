package factory.halfsimple.factory;


import factory.after.model.IPhone;
import factory.after.model.IPhone11;
import factory.after.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;
	}

}

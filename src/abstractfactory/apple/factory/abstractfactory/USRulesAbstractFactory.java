package abstractfactory.apple.factory.abstractfactory;


import abstractfactory.apple.model.certificate.Certificate;
import abstractfactory.apple.model.certificate.USCertificate;
import abstractfactory.apple.model.packing.Packing;
import abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}

package abstractfactory.apple.factory.abstractfactory;


import abstractfactory.apple.model.certificate.BrazilianCertificate;
import abstractfactory.apple.model.certificate.Certificate;
import abstractfactory.apple.model.packing.BrazilianPacking;
import abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}

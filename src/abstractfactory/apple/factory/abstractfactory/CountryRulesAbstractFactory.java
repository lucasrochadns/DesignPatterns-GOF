package abstractfactory.apple.factory.abstractfactory;


import abstractfactory.apple.model.certificate.Certificate;
import abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}

package factory.dbadapter.after.factory;


import factory.dbadapter.after.db.DB;
import factory.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}

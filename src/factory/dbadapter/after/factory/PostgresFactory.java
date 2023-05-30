package factory.dbadapter.after.factory;


import factory.dbadapter.after.db.DB;
import factory.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}

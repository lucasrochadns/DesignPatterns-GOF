package factory.dbadapter.after;


import factory.dbadapter.after.db.DB;
import factory.dbadapter.after.factory.OracleFactory;
import factory.dbadapter.after.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB db1 = new PostgresFactory().getDatabase();
		DB db2 = new OracleFactory().getDatabase();
		db1.query("SELECT * FROM users");
		db1.update("INSERT INTO users VALUES ('User', 25)");

		db2.query("SELECT * FROM users");
		db2.update("INSERT INTO users VALUES ('User', 25)");

	}
}

package sample.spring.chapter03.bankapp.event;

import java.util.Properties;

//이벤트를 데이터베이스에 보낸다
public class DatabaseEventSender implements EventSender {
	@SuppressWarnings("unused")
	private Properties databaseProperties;

	public DatabaseEventSender(Properties databaseProperties) {
		this.databaseProperties = databaseProperties;
	}

	@Override
	public void sendEvent(Event e) {
		// -- save events in the database
	}

}

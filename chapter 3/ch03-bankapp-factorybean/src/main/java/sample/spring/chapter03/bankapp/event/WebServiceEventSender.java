package sample.spring.chapter03.bankapp.event;

import java.util.Properties;

//이벤트를 원격 웹 서비스에 보낸다.
public class WebServiceEventSender implements EventSender {
	@SuppressWarnings("unused")
	private Properties webServiceProperties;

	public WebServiceEventSender(Properties webServiceProperties) {
		this.webServiceProperties = webServiceProperties;
	}

	@Override
	public void sendEvent(Event e) {
		// -- send the event to the remote web service
	}

}

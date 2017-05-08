package org.hubotek.jms.message;

import javax.jms.Message;
import javax.ejb.MessageDriven;
import javax.jms.MessageListener;

@MessageDriven
public class BaseMessageListener implements MessageListener{

	public BaseMessageListener() {
	}

	public void onMessage(Message message) {
	}

}

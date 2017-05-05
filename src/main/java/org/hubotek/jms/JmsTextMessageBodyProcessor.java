package org.hubotek.jms;

import javax.inject.Named;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.hubotek.HubotekException;
import org.hubotek.Processor;

@Named(value="jmsMessageBodyProcessor")
public class JmsTextMessageBodyProcessor implements Processor<TextMessage,String>{

	public JmsTextMessageBodyProcessor() {
	}

	public String process(TextMessage m) {
		String messageBody;
		try {
			messageBody = m.getText();
		} catch (JMSException jmsEx) {
			throw new HubotekException(jmsEx);	
		}
		return messageBody;
	}

}

package org.hubotek.jms.message;

import javax.decorator.Decorator;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.Message;

import org.hubotek.MessageBase;
import org.hubotek.Processor;
import org.hubotek.jms.JmsMessageProcessor;

/**
 * TODO: Finish base class implementation.
 * 
 * @author JoseCanova
 *
 */
@Decorator
public class JmsMessageProcessorBase<T,V> implements JmsMessageProcessor<MessageBase<T,V>> {

	@Inject @Named(value="changeMyValue")
	Processor <Message,?> headerProcessor;
	
	@Inject @Named(value="changeMyValue")
	Processor <Message,?> bodyMessageProcessor;
	
	public JmsMessageProcessorBase() {
	}

	public MessageBase<T,V> process(Message m) {
		return null;
	}

}

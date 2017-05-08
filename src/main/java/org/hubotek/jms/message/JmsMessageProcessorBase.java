package org.hubotek.jms.message;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.Message;

import org.hubotek.MessageBase;
import org.hubotek.Processor;
import org.hubotek.jms.JmsMessageProcessor;

/**
 * TODO: Code and test the implementation on container.
 * 
 * @author JoseCanova
 *
 */
@Decorator
public class JmsMessageProcessorBase<T,V> implements JmsMessageProcessor<MessageBase<T,V>> {

	@Inject @Delegate @Named(value="headerProcessor")
	Processor <Message,?> headerProcessor;
	
	@Inject @Delegate @Named(value="changeMyValue")
	Processor <Message,?> bodyMessageProcessor;
	
	public JmsMessageProcessorBase() {
	}

	public MessageBase<T,V> process(Message m) {
		return null;
	}

}

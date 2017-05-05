package org.hubotek.jms;

import java.util.function.Function;

import org.hubotek.Processor;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.Message;

/**
 * Using a setter injection to permits overriding in the transfomer function.
 * 
 * @author JoseCanova
 *
 * @param <T> - Any Kind of result for the transformer funciton
 * 
 */
@Named(value="headerProcessor")
public class HeaderProcessor<T> implements Processor<Message,T>{

	private Function<Message,T> headerTransfomer;
	
	public HeaderProcessor() {
	}

	public T process(Message m) {
		return headerTransfomer.apply(m);
	}

	@Inject
	public void setHeaderTransformer(@Named(value="baseHaderTransformer") Function<Message,T> transformer)
	{
		this.headerTransfomer = transformer;
	}
}

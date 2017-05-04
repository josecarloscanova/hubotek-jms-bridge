package org.hubotek;

@FunctionalInterface
public interface Dispatcher<T> {

	void send(T t);
	
}

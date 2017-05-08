package org.hubotek;

/**
 * Functional interface declaring a {@link}process method.
 * 
 * @author JoseCanova
 *
 * @param <T> result of the method execution
 * @param <M> system message to be processed 
 */
@FunctionalInterface
public interface Processor<M,T> {

	 T process(M m);
	
}

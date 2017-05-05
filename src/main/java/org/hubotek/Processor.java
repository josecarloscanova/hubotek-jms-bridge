package org.hubotek;

/**
 * 
 * @author JoseCanova
 *
 * @param <T>
 */
@FunctionalInterface
public interface Processor<M,T> {

	 T process(M m);
	
}

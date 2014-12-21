package com.digiburo.backprop1b.network;

/**
 * Abstract parent for arcs and nodes
 */
import java.io.Serializable;

/**
 * Abstract parent for arcs and nodes
 */
public abstract class AbstractArcNode implements Serializable {

	/**
     * Each arc and node has a globally unique identifier
         */
    public int getId() {
    	return(id);
    }
    
    /**
     * Globally unique identifier
     */
    final int id = SequenceGenerator.getId();

    /**
	 * eclipse generated
	 */
	private static final long serialVersionUID = -876174107044791987L;
}


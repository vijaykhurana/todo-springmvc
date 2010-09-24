package org.vnoss.todo.domain;

import java.io.Serializable;

/**
 * To be implemented by all domain model objects (entities).
 */
public interface Persistable extends Serializable {

   Long getId();

}

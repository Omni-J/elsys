package org.elsys.todo.impl;

import org.elsys.todo.Criteria;
import org.elsys.todo.Task;

abstract class AbstractCriteria implements Criteria {

	@Override
	//This one
	public Criteria and(Criteria other) {
		return new AndCriteria(this, (AbstractCriteria) other);
	}

	
	@Override
	public Criteria or(Criteria other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria not() {
		return new NotCriteria(this);
	}

	abstract boolean matches(Task task);
	
}

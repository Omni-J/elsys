package org.elsys.todo.impl;

import org.elsys.todo.Criteria;
import org.elsys.todo.Task;

public class AndCriteria extends AbstractCriteria implements Criteria {

	private AbstractCriteria criteria1;
	private AbstractCriteria criteria2;
	
	public AndCriteria(AbstractCriteria criteria1, AbstractCriteria criteria2){
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}
	
	
	
	@Override
	boolean matches(Task task) {
		return criteria1.matches(task)&&criteria2.matches(task);
	
	}

}

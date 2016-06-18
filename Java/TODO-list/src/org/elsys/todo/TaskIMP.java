package org.elsys.todo;

import java.util.Arrays;

public class TaskIMP implements Task{

	private Status status;
	private String description;
	private Priority priority;
	private String[] tags;

	public TaskIMP(Status status, String description,
			Priority priority, String[] tags) {
		// TODO Auto-generated constructor stub
		this.status = status;
		this.description = description;
		this.priority = priority;
		this.tags = tags;
	}
	
	@Override
	public Status getStatus() {
		// TODO Auto-generated method stub
		
		return status;
	}
	

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public Priority getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}

	@Override
	public String[] getTags() {
		// TODO Auto-generated method stub
		return tags;
	}

}

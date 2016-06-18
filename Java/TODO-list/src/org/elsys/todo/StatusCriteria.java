package org.elsys.todo;

public class StatusCriteria implements Criteria {

	private Status status;
	
	public StatusCriteria(Status status) {
		this.status = status;
	}
	
	boolean matches(Task task) {
		return status == task.getStatus();
	}
	
	public static StatusCriteria status(){
		return; //
	}
	
	
	@Override
	public Criteria and(Criteria other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria or(Criteria other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria not() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package org.elsys.todo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TodoIMP implements TodoList{

	String Task;
	
	@Override
	public Boolean isCompleted() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public TodoListImpl(String input){
		Arrays.stream(input.split("\n")).map(line -> {
			String[] spitted = Arrays.stream(line.split("\\|")).map(String::trim)
			.toArray(size -> new String[size]);
			return new TaskImpl(Status.valueOf(splitted[0].toUpperCase()), 
					splitted[1],
					Priority.valueOf(splitted[2].toUpperCase()),
					splitted[3].split(", "));
		}).collect(Collectors.toList());
	}

	@Override
	public Double percentageCompleted() {
		// TODO Auto-generated method stub
		return tasks.stream().allMatch(task -> task.getStatus() == Status.DONE);
	}

	@Override
	public List<Task> getTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TodoList filter(Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TodoList join(TodoList other) {
		// TODO Auto-generated method stub
		return null;
	}

}

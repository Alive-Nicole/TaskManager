package com.nicole.taskmanager;

import java.util.ArrayList;

public class AddTask implements Task {
	// Mandatory Parameter
	String newTask;
	
	// Default Constructor
	public AddTask() {
		newTask = "";
	}
	
	//Overloaded Constructor
	public AddTask(String newTask) {
		this.newTask = newTask;
	}
	
	//Getter Methods
	public String getTask() {
		return newTask;
	}
	
	//Setter Method
	public void setNewTask(String newTask, ArrayList<String> taskList, ArrayList<Boolean> isCompleted) {
		this.newTask = newTask;
		
		//add new task to list
		taskList.add(newTask);
		
		//Set added task as not completed
		isCompleted.add(false);
		
		System.out.println("  ");
	}
}

package com.nicole.taskmanager;

import java.util.ArrayList;

public class ListTasks implements Task {
	//Optional parameter
	String taskName;
	
	// Default Constructor
	public ListTasks() {
		taskName = "";
	}
	
	//Getter Methods
	public String getTask() {
		return taskName;
	}
	
	//List all the task in the array list including those completed
	public void listTasks(ArrayList<String> taskList, ArrayList<Boolean> isCompleted) {
		for(int i = 0; i < taskList.size(); i++) {
			int number = i + 1;
			
			if(isCompleted.get(i) == true) {
				System.out.println(number + ". " + taskList.get(i) + "(Completed)");
			}
			else if(isCompleted.get(i) == false) {
				System.out.println(number + ". " + taskList.get(i));
			}
		}
		System.out.println("  ");
	}
}

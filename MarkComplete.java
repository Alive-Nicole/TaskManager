package com.nicole.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class MarkComplete implements Task {
	// Mandatory parameter
	int taskNumber;
	
	//Optional parameter
	String taskName;
	
	public MarkComplete() {
		taskNumber = 0;
	}
	
	public MarkComplete(int taskNumber) {
		this.taskNumber = taskNumber;
	}
	
	// Getter Method
	public String getTask() {
		return taskName;
	}
	
	// Display all tasks where completed is false
	public void displayTask(List<String> taskList, ArrayList<Boolean> isCompleted) {
				
		for(int i = 0; i < taskList.size(); i++) {
			int number = i + 1;
						
			if(isCompleted.get(i) == false) {
				System.out.println(number + ". " + taskList.get(i));
			}	
		}
		System.out.println("  ");
	}
	
	//Mark selected task as completed
	public void markComplete(int taskNumber, ArrayList<String> taskList, ArrayList<Boolean> isCompleted) {
		this.taskNumber = taskNumber;
		
		if(taskNumber <= taskList.size()) {
			//get task attached to index (index = taskNumber - 1)
			String selectedTask = taskList.get(taskNumber - 1);
			
			//set task as completed
			isCompleted.set(taskNumber - 1, true);
			
			// Output in console
			System.out.println(selectedTask + " was successfully marked as complete.");
			System.out.println(" ");
		}
		
		else {
			System.out.println("Please enter a task on the list");
			System.out.println(" ");
		}		
	}

}

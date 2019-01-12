package com.nicole.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class RemoveTask implements Task {
	//Mandatory parameter
	int taskNumber;
	
	//Optional parameter
	String taskName;
	
	public RemoveTask() {
		taskNumber = 0;
	}
	
	public RemoveTask(int taskNumber) {
		this.taskNumber = taskNumber;
	}
	
	//Getter method
	public String getTask() {
		return taskName;
	}
		
	// Display all tasks in the list indicating those completed
	public void displayTask(ArrayList<String> taskList, ArrayList<Boolean> isCompleted) {
		for(int i = 0; i < taskList.size(); i++) {
			int number = i + 1;
					
			if(isCompleted.get(i) == true) {
				System.out.println(number + ". " + taskList.get(i) + " (Completed).");
			}
			else if(isCompleted.get(i) == false) {
				System.out.println(number + ". " + taskList.get(i));
			}
		}
		System.out.println("  ");
	}
	
	// User Enters the number on task to remove task
	public void removeTask(int taskNumber, List<String> taskList) {
		this.taskNumber = taskNumber;
		if(taskNumber <= taskList.size()) {
			taskList.remove(taskNumber - 1);
		}
		else {
			System.out.println("Please select a task on the list");
			System.out.println("  ");
		}		
	}
}

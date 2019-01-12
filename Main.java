package com.nicole.taskmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	//Main Method
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Task Manager Object
		TaskManager taskManager = new TaskManager();
		
		// List of Task
		List<String> taskList = new ArrayList<String>();
		
		// Is completed Object
		List<Boolean> isCompleted = new ArrayList<Boolean>();
		
		// Scan input
		Scanner input = new Scanner(System.in);
		
		//Create a string variable to store scanned user input
		String userInputString;
		
		
		do {
			// Display main menu
			taskManager.mainMenu();
			
			// Store user input in variable
			userInputString = input.nextLine();
			
			if(userInputString.equalsIgnoreCase("add a task")) {
				System.out.println("Enter the task: ");
			
				// Get user input
				String userInput = input.nextLine();
			
				// Create new Add Task Object
				AddTask newTask = new AddTask(userInput);
			
				// Add user input to list of task
				newTask.setNewTask(userInput, (ArrayList<String>) taskList, (ArrayList<Boolean>) isCompleted);
			}
		
			else if(userInputString.equalsIgnoreCase("remove a task")) {
				// Create a new Remove Task object (Without parameter)
				RemoveTask toDisplay = new RemoveTask();
				
				// Display all the task with numbers, marking those completed
				toDisplay.displayTask((ArrayList<String>) taskList, (ArrayList<Boolean>) isCompleted);
				
				// Prompt user to enter task number to remove
				System.out.println("Enter task number to remove: ");
				
				//Get user input
				int userInputInt = input.nextInt();
				
				// Create another Remove Task object (With parameter)
				RemoveTask toRemove = new RemoveTask(userInputInt);
							
				// Remove task
				toRemove.removeTask(userInputInt, taskList);
			}
		
			else if(userInputString.equalsIgnoreCase("mark a task complete")) {
				//Create new Mark Complete object
				MarkComplete notComplete = new MarkComplete();
				
				// Display not completed tasks
				notComplete.displayTask(taskList, (ArrayList<Boolean>) isCompleted);
				
				// Prompt user to enter task number to mark as complete
				System.out.println("Enter task number to mark as complete: ");
				
				// Get user input
				int userInputInt = input.nextInt();
				
				// Create another Mark Complete Object that takes a parameter
				MarkComplete taskComplete = new MarkComplete(userInputInt);
				
				// Mark selected task as completed
				taskComplete.markComplete(userInputInt, (ArrayList<String>) taskList, (ArrayList<Boolean>) isCompleted);
			}
			
			else if(userInputString.equalsIgnoreCase("list the tasks")) {
				//Create new object List Tasks
				ListTasks printList = new ListTasks();
				
				// Print all tasks
				printList.listTasks((ArrayList<String>) taskList, (ArrayList<Boolean>) isCompleted);			
			}
			
			else {
				System.out.println(userInputString + " is not a recognized option.");
				System.out.println("  ");
			}
		}
		while(userInputString != "");
	}
}
			

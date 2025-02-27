package app;

import service.TaskQueueService;
import java.util.Scanner;

import model.Task;
public class QueueApp {

	public static void main(String[] args) {
		TaskQueueService queueService = new TaskQueueService();
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		while (input < 4) {
			System.out.println("Press 1 to Add a Task to the Queue: ");
			System.out.println("Press 2 to List All the Tasks: ");
			System.out.println("Press 3 to Remove a Task: ");
			System.out.println("Press 4 to Exit the Application: ");
			input = scanner.nextInt();
			scanner.nextLine();
		
			switch(input) {
				case 1:
					
					System.out.println("Enter the Task Id: ");
					int id = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter the Task Description: ");
					String description = scanner.nextLine();
					Task task = new Task(id, description);
					queueService.enqueue(task);
					System.out.println("Task Added.");
					break;
				case 2:
					for(Task t : queueService.listTasks()) {
						System.out.println(t);
					}
					break;
				case 3:
					System.out.println(queueService.dequeue() + " Removed.");
					break;
				case 4:
					System.out.println("System exiting...");
				break;
			}
		}
		scanner.close();
	}
	
}

package app;

import service.TaskQueueService;
import java.util.Scanner;
import model.Task;

public class QueueApp {

	public static void main(String[] args) {
		TaskQueueService queueService = new TaskQueueService();
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		/*
		 * Interface so a user can add/remove/removeById/search tasks and print a list of the tasks.
		 */
		while (input != 6) {
			System.out.println("Press 1 To Add a Task to the Queue: ");
			System.out.println("Press 2 To List All the Tasks: ");
			System.out.println("Press 3 To Remove Front Task: ");
			System.out.println("Press 4 Search for a Task by Id: ");
			System.out.println("Press 5 To Delete a Task by Id: ");
			System.out.println("Press 6 to Exit the Application: ");
			input = scanner.nextInt();
			scanner.nextLine();
			
			switch (input) {
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
				for (Task t : queueService.listTasks()) {
					System.out.println(t);
				}
				break;
			case 3:
				System.out.println(queueService.dequeue() + " Removed.");
				break;
			case 4:
				System.out.println("Enter Id");
				int idSearch = scanner.nextInt();
				scanner.nextLine();
				if(queueService.searchById(idSearch) == null) {
					System.out.println("Task by That Id Does Not Exist");
				}
				else {
				System.out.println(queueService.searchById(idSearch));
				}
				break;
			case 5:
				System.out.println("Enter Id");
				int idDelete = scanner.nextInt();
				scanner.nextLine();
				queueService.deleteTaskById(idDelete);
				break;
			case 6:
				System.out.println("System exiting...");
				break;
			}
		}
		scanner.close();
	}

}

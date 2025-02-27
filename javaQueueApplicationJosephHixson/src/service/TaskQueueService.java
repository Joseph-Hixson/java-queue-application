package service;
import java.util.LinkedList;

import model.Task;
public class TaskQueueService {
	
	LinkedList<Task> taskList = new LinkedList<>();
	/*
	 * Add task to the queue.
	 */
	public void enqueue(Task task) {
		taskList.add(task);
	}
	/*
	 *  Removes task from the list unless task is empty.
	 */
	public Task dequeue() {
		if(taskList.isEmpty()) {
			System.out.println("Task list is empty.");
			return null;
		}
		else {
		return taskList.poll();
		}
	}
	
}

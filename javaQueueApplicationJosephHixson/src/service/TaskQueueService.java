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
	
}

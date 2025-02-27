package service;
import java.util.LinkedList;
import java.util.Queue;

import model.Task;
public class TaskQueueService {
	
	private Queue<Task> queue = new LinkedList<>();
	/*
	 * Add task to the queue.
	 */
	public void enqueue(Task task) {
		queue.add(task);
	}
	/*
	 *  Removes task from the list unless task is empty.
	 */
	public Task dequeue() {
		if(queue.isEmpty()) {
			System.out.println("Task list is empty.");
			return null;
		}
		else {
		return queue.poll();
		}
	}
	/*
	 * returns the all the tasks in the queue
	 */
	public Queue<Task> listTasks(){
		return queue;
	}
}

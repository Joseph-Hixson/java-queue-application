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
	 * returns the all the tasks in the queue
	 */
	public Queue<Task> listTasks() {
		return queue;
	}

	/*
	 * Removes task from the list unless task is empty.
	 */
	public Task dequeue() {
		if (queue.isEmpty()) {
			System.out.println("Task list is empty.");
			return null;
		} else {
			return queue.poll();
		}
	}

	/*
	 * Method to search through queue.
	 */
	public Task searchById(int id) {
		for (Task t : queue) {
			if (t.getId() == id)
				return t;
		}
		return null;
	}
	/*
	 * Method to delete task anywhere in the queue by id.
	 */
	public void deleteTaskById(int id) {
		for(Task t: queue) {
			if(t.getId() == id) {
				System.out.println(t + "  Has Been Removed.");
				queue.remove(t);
			}
		}
	}
}

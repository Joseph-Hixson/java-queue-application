Program created by Joseph Hixson for asssignment Java Queue Application class COSC-2436.

What the program does:

The program allows the user to mange a queue of tasks by adding task to the queue with an id and description for each task.

functions of the program:

1.Add a task to the queue.
2.Print out a list of all the tasks.
3.Remove the first task in the queue.
4.Search for a task by their id number.
5.Delete a task by their id number.
6.Exit application with done.

Instructions to Compile:

Open cmd and go to folder that has this program and then type: javac -d bin src/app/QueueApp.java

Instructions to Run:

After program compiles type: java -cp bin app.QueueApp Program then should be running in cmd.
Changes made from sample structure:

Created the methods in javaQueueService searchById and deleteTaskById. 
The fucnction searchById allows the users to search for a task using the id of the task. 
If there is no task matching the id inputed then the method returns null. 
In QueueApp it checks if the method returns null if it does then it prints out a message telling the user. 
The fucnction deleteTaskById delete task if the id inputed matchs with one in the queue. 
It prints out a message if the task has been removed.
With the method dequeue I put check if empty in the javaQueueService class instead of having it in the class QueueApp.

Screenshots of it working in cmd.
![image](https://github.com/user-attachments/assets/5be66fff-82b8-41c2-88e4-bf3dbdc03beb)

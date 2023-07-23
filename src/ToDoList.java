import java.util.Scanner;

public class ToDoList {
		TaskList taskList = new TaskList();
		
		public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1.Add a new task");
		System.out.println("2.Remove an existing task");
		System.out.println("3.Edit a task");
		System.out.println("4.Mark a task as comleted");
		System.out.println("5.List all tasks");
		System.out.println("6.Sort tasks by date");
		System.out.println("7.Exit");
		System.out.println("Enter your choice:");
		int choice = input.nextInt();
		switch (choice) {
		case 1: { taskList.addTask(); System.out.print("\n"); run(); }
		case 2:{ taskList.remove(); System.out.print("\n"); run(); }
		case 3:{ taskList.edit(); System.out.print("\n"); run(); }
		case 4:{ taskList.markTaskAsCompleted();; System.out.print("\n"); run(); }
		case 5:{taskList.listTasks(); System.out.print("\n"); run(); }
		case 6:{ taskList.sort(); System.out.print("\n"); run(); }
		case 7: { System.out.println("Exiting the program."); break; }
		default : { System.out.println("Invalid choice. Please try again."); run();}
		}
	}

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		toDoList.run();
	}

}

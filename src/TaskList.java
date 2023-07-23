import java.util.Scanner;
import java.util.ArrayList;

public class TaskList {	
	ArrayList <Task> tasks = new ArrayList<>();
	
	public void addTask() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter task Descreption:");
	    String desc = input.nextLine();
	    
		System.out.print("Enter task year:");
	    int year = input.nextInt();
	    
	    System.out.print("Enter task month:");
	    int month = input.nextInt();
	    
	    System.out.print("Enter task day:");
	    int day  = input.nextInt();

		Dates date = new Dates(day, month, year);
		
		Task task1 = new Task(desc, date); 
		tasks.add(task1);
	    System.out.println("\n**Task has been added successfully**");
	
	}
	
    public void reassignTaskIds() {
	        for (int i = 0; i < tasks.size(); i++) {
	            tasks.get(i).setId(i + 1);
	        }
	    }
	 
	public void listTasks() {
		System.out.println("Here are all the tasks:");
		System.out.println("ID\t\tDescreption\t\tDue Date\t\tstatus");
		System.out.println("--\t\t-----------\t\t----------\t\t------");
		 reassignTaskIds();
		for (int i=0; i<tasks.size(); i++) {
		System.out.print(tasks.get(i).getId()+"\t\t"+tasks.get(i).getDescription()+"\t\t\t"+tasks.get(i).getDueDate()+"\t\t");
		if (tasks.get(i).isCompleted()) {
			System.out.println("Completed");
		}
		else System.out.println("In progress");
	}
     	}
	public void remove() {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the id:");
		int id = input.nextInt();
		for (int i=0;i<tasks.size();i++) {
		if (id==tasks.get(i).getId()) {
			tasks.remove(i);
			}
		}
		System.out.println("Task has been ramoved successfully");
	}
	public void edit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID of the task to edit:");
        int id = input.nextInt();
        input.nextLine(); 

        Task taskToEdit = null;
        for (int i=0; i<tasks.size(); i++) {
        	Task task=tasks.get(i);
            if (id == task.getId()) {
                taskToEdit =task;
                break;
            }
        }

        if (taskToEdit != null) {
            System.out.print("Enter the new task Description:");
            String newDesc = input.nextLine();

            System.out.print("Enter the new task year:");
            int newYear = input.nextInt();

            System.out.print("Enter the new task month:");
            int newMonth = input.nextInt();

            System.out.print("Enter the new task day:");
            int newDay = input.nextInt();

            Dates newDate = new Dates(newDay, newMonth, newYear);

            taskToEdit.setDescription(newDesc);
            taskToEdit.setDueDate(newDate);

            System.out.println("Task has been edited successfully");
        } else {
            System.out.println("No task found with the specified ID");
        }
    }
	public void markTaskAsCompleted() {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the ID of the task to mark as completed: ");
	    int taskId = input.nextInt();

	   for(int i=0; i<tasks.size(); i++) {
		   Task task= tasks.get(i);
	        if (task.getId() == taskId) {
	            task.setCompleted(true);
	            System.out.println("Task marked as completed successfully.");
	            return;
	        }
	    }

	    System.out.println("Task not found. Please enter a valid task ID.");
	}
	

	public void sort() {
	    int n = tasks.size();
	    boolean swapped;
	    for (int i = 0; i < n - 1; i++) {
	        swapped = false;
	        for (int j = 0; j < n - i - 1; j++) {
	            Dates date1 = tasks.get(j).getDueDate();
	            Dates date2 = tasks.get(j + 1).getDueDate();
	            if (date1.getYear() > date2.getYear() || 
	                (date1.getYear() == date2.getYear() && date1.getMonth() > date2.getMonth()) || 
	                (date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDay() > date2.getDay())) {
	                Task temp = tasks.get(j);
	                tasks.set(j, tasks.get(j + 1));
	                tasks.set(j + 1, temp);
	                swapped = true;
	            }
	        }
	        if (!swapped) {
	        	break;
	        }
	    }
	    System.out.println("Tasks sorted by date.");
	}

  } 
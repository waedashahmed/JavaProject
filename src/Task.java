
public class Task {
	private int id;
    private String description;
    private boolean isCompleted = false;
    private Dates dueDate;

	public Task(String description, Dates date ) {
		this.description = description;
		this.dueDate = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Dates getDueDate() {
		return dueDate;
	}

	public void setDueDate(Dates dueDate) {
		this.dueDate = dueDate;
	}

}

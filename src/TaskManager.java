import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public void printCompletedTasks() {
        System.out.println("Tâches terminées :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printPendingTasks() {
        System.out.println("Tâches non terminées :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}

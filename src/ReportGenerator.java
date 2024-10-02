public class ReportGenerator {

    private TaskManager taskManager;

    public ReportGenerator(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public void printCompletedTasks() {
        System.out.println("Tâches terminées :");
        for (Task task : taskManager.getTasks()) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printPendingTasks() {
        System.out.println("Tâches non terminées :");
        for (Task task : taskManager.getTasks()) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}

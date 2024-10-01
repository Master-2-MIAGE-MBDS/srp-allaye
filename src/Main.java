public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Tâche 1", "Description de la tâche 1");
        taskManager.addTask("Tâche 2", "Description de la tâche 2");

        taskManager.markTaskAsComplete(0); // Marque la première tâche comme terminée

        taskManager.printCompletedTasks();
        taskManager.printPendingTasks();
    }
}

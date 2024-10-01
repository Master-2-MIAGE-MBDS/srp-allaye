public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Ajout des tâches
        taskManager.addTask("Tâche 1", "Description de la tâche 1");
        taskManager.addTask("Tâche 2", "Description de la tâche 2");

        // Marquer une tâche comme terminée
        taskManager.markTaskAsComplete(0);

        // Créer un générateur de rapport
        ReportGenerator reportGenerator = new ReportGenerator(taskManager);

        // Générer les rapports
        reportGenerator.printCompletedTasks();
        reportGenerator.printPendingTasks();
    }
}

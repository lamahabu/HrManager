public class Main {
    public static void main(String[] args) {
        // Access the HRManager singleton instance
        HR_Manager hrManager = HR_Manager.getInstance();

        // Perform HR tasks
        hrManager.performTask("Organize team-building event");
        hrManager.performTask("Review employee performance");
    }
}

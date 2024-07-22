public class HR_Manager{
    // The single instance of the class, initialized when the class is first accessed
    private static final HR_Manager INSTANCE = new HR_Manager();

    // Private constructor to prevent instantiation
    private HR_Manager() {
    }

    // Public method to access the singleton instance
    public static HR_Manager getInstance() {
        return INSTANCE;
    }

    // Method to perform some HR management task
    public void performTask(String task) {
        System.out.println("Performing HR task: " + task);
    }

    // The company only need one HR manager so one instance is created 
}

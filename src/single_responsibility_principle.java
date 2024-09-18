/*public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        // Code to save user to database
    }

    public void logActivity(String activity) {
        // Code to log user activity
    }

    // Getters and setters
}

*/



















/**/

// User.java
 class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
// UserRepository.java
class UserRepository {
    public void saveToDatabase(User user) {
        // Simulate saving user to a database
        System.out.println("Saving user " + user.getName() + " to the database.");
        // Actual database code would go here
    }
}
// UserRepository.java
// ActivityLogger.java
class ActivityLogger {
    public void logActivity(User user, String activity) {
        // Simulate logging user activity
        System.out.println("Logging activity for user " + user.getName() + ": " + activity);
        // Actual logging code would go here
    }
}

// Main.java
public class single_responsibility_principle {
    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");

        UserRepository userRepository = new UserRepository();
        userRepository.saveToDatabase(user);

        ActivityLogger activityLogger = new ActivityLogger();
        activityLogger.logActivity(user, "User logged in.");
    }
}

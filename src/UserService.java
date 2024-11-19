public class UserService implements IUserService {
    private static int pointer = 0;
    public static final User[] users = new User[100];

    @Override
    public void register(User user) {

        UserValidation userValidation = new UserValidation();

        if (!userValidation.validateUser(user.getUsername())) {
            throw new RuntimeException("Invalid name");
        }
        if (!userValidation.validatePassword(user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }
        users[pointer++] = user;
        System.out.println("User registered successfully: " + user.getUsername());
    }

    @Override
    public void login(String username, String password) {

        boolean found = false;
        for (User user : users) {
            if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Logged in successfully");
                found = true;
            }
        }
        if (!found) {
            System.out.println("User not found");
        }
    }

    @Override
    public void uptade(String username) {
        boolean found = false;
        for (User user : users) {
            if (user != null && user.getUsername().equals(username)) {
                users[pointer - 1] = user;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found");
        }
    }
}

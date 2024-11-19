public class Main {
    public static void main(String[] args) {
    User admin = new User("Admin","123");
    User user = new User("John","123");
    User user1 = new User("Ali","123");

    UserService userService = new UserService();
    userService.register(admin);
    userService.register(user);
    userService.register(user1);

    for (User tempUser : UserService.users){
        if(tempUser == null){
            break;
        }
        System.out.println(tempUser);
    }
    }
}
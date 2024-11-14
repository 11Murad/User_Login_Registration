public interface IUserService {
    public static final User[] users = new User[100];

    void register(User user);
    void login(String username, String password);
    void uptade(String username) ;

    }



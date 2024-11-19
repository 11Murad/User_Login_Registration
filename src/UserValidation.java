public class UserValidation {

    public boolean validateUser(String username) {
        if (username.isBlank() || username == null || username.length() > 11) {
            return false;
        }
        return true;
    }

    public boolean validatePassword(String password) {
        if (password == null || password.length() >=8) {
            return false;
        }
        return true;
    }
}

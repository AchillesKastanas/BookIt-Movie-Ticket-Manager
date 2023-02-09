package Model.DefineUsers;

public class UserRegister extends Users{

    public String getUsername() {
        return username;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    private final String username;
    private final String email;
    private final String password;
    private final String confirmPassword;

    public UserRegister(String username,String email,String password,String confirmPassword)
    {
        this.username=username;
        this.email=email;
        this.password=password;
        this.confirmPassword=confirmPassword;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{\"name\":\"" + this.getUsername() + "\",\"email\":\"" + this.getEmail() + "\",\"password\":\"" + this.getPassword() + "\",\"confirmPassword\":\"" + this.getConfirmPassword() + "\"}";
    }
}

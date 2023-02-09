package Model.DefineUsers;

public class LoginProc implements AbstractFactory{
    private final String username;
    private final String password;

    public LoginProc(String username, String password)
    {
        this.username = username;
        this.password=password;
    }

    @Override
    public Users manipulateUser() {
        return new UserLogin(username,password);
    }
}

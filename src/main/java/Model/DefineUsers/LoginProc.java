package Model.DefineUsers;

public class LoginProc implements AbstractFactory{
    private final String email;
    private final String password;

    public LoginProc(String email,String password)
    {
        this.email=email;
        this.password=password;
    }

    @Override
    public Users manipulateUser() {
        return new UserLogin(email,password);
    }
}

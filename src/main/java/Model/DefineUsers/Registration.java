package Model.DefineUsers;

public class Registration implements AbstractFactory{
    private final String username;
    private final String email;
    private final String password;
    private final String confirmedPassword;

    public Registration(String username,String email,String password,String confirmedPassword)
    {
        this.username=username;
        this.password=password;
        this.email=email;
        this.confirmedPassword=confirmedPassword;
    }


    @Override
    public Users manipulateUser() {
        return new UserRegister(username,email,password,confirmedPassword);
    }
}

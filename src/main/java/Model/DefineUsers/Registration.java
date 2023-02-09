package Model.DefineUsers;

public class Registration implements AbstractFactory{
    private final String username;
    private final String email;
    private final String password;
    private final String phoneNumber;

    public Registration(String username,String email,String password,String phoneNumber)
    {
        this.username=username;
        this.password=password;
        this.email=email;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public Users manipulateUser() {
        return new UserRegister(username,email,password, phoneNumber);
    }
}

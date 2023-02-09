package Model.DefineUsers;

public class UserLogin extends Users{

    private final String email;
    private final String password;

    public UserLogin(String email,String password)
    {
        this.email=email;
        this.password=password;
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
        return "{\"email\":\"" + this.getEmail() + "\",\"password\":\"" + this.getPassword() + "\"}";
    }

}


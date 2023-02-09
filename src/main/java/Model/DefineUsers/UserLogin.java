package Model.DefineUsers;

public class UserLogin extends Users{

    private final String username;
    private final String password;

    public UserLogin(String username, String password)
    {
        this.username = username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }


    @Override
    public String getEmail() {
        return getEmail();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{\"username\":\"" + this.getUsername() + "\",\"password\":\"" + this.getPassword() + "\"}";
    }

}


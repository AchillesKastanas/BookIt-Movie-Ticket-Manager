package Model.DefineUsers;

public class UserRegister extends Users{

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private final String username;
    private final String email;
    private final String password;
    private final String phoneNumber;

    public UserRegister(String username,String email,String password,String phoneNumber)
    {
        this.username=username;
        this.email=email;
        this.password=password;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }



    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{\"name\":\"" + this.getUsername() + "\",\"email\":\"" + this.getUsername() + "\",\"password\":\"" + this.getPassword() + "\",\"confirmPassword\":\"" + this.getPhoneNumber() + "\"}";
    }
}

package Model.DefineUsers;

public abstract class Users {
    public abstract String getEmail();
    public abstract String getPassword();

    public String toString(){
        String finalString = "{\"email\":\"" + this.getEmail() + "\",\"password\":\"" + this.getPassword() + "\"}";
        return finalString;
    }
}


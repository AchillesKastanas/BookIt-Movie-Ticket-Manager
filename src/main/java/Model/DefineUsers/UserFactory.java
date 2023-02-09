package Model.DefineUsers;

public class UserFactory {
    public static Users getUsers(AbstractFactory prod)
    {
        return prod.manipulateUser();
    }
}

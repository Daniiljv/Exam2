package task1;

public class BasicUserAccount implements UserAccount {

    private String userName;
    private String password;

    public BasicUserAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public BasicUserAccount() {
    }

    @Override
    public void createAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void updateAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void deleteAccount() {
        this.userName = null;
        this.password = null;
    }

    public String toString(){
        return "UserName - " + userName +
                "\nPassword - " + password + "\n";

    }

}


package task1;

public class UserAccountManager {
    public static void main(String[] args) {
        BasicUserAccount willBeChangedUser = new BasicUserAccount("DeFold", "fdgfdgdfg");
        willBeChangedUser.updateAccount("HasBeenChanged","000000");

        BasicUserAccount ordinaryUser = new BasicUserAccount();
        ordinaryUser.createAccount("Daniil","12321fdfgdfg");

        BasicUserAccount willBeDeleted = new BasicUserAccount("ffgdfbfxb", "eewrewte");
        willBeDeleted.deleteAccount();

        System.out.println(willBeChangedUser);
        System.out.println(ordinaryUser);
        System.out.println(willBeDeleted);
    }
}

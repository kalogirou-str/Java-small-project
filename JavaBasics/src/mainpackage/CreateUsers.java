package mainpackage;

public class CreateUsers {
    public static void main(String args []){
        Users user1 = new Users("strat", "123", "statos", "kalog") {
            @Override
            public void login() {
                System.out.println("You are in");
            }

            @Override
            public void logout() {
                System.out.println("You are out");
            }
        };
        user1.login();
        Admin admin1 = new Admin("strat", "123", "statos", "kalog");
    }
}

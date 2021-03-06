package mainpackage;

public abstract class Users {
    private String username;
    private String password;
    private String name;
    private String surname;
    static int usersCounter = 0;

    public Users(String username, String password, String name, String surname){
        this.name = name;
        this.password = password;
        this.surname = surname;
        this.username = username;
        usersCounter++;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract void login();
    public abstract void logout();
}

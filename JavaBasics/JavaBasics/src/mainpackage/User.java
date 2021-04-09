package mainpackage;

public class User {
    private String username;
    private String password;
    private String name;
    private String surname;
    private int age;
    //+1 each time we call the constructor
   static int usersCounter = 0;

   void login(){

   }
   void logout(){

   }
    public User(){
        
    }
    //GETTERS AND SETTERS
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
    public String getSurname() { return surname; }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

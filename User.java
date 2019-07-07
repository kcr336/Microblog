package org.launchcode;

public class User {
    private String avatarUrl;
    private String username;
    private String firstName;
    private String lastName;
    private String email;

    //Constructor that requires all User fields at creation
    public User(String avatarUrl, String username, String firstName, String lastName, String email) {
        this.avatarUrl = avatarUrl;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public User(){}
    //Getters and setter for each field:
    public String getAvatarUrl() {return this.avatarUrl; }

    public void setAvatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl; }

    public String getUsername() { return this.username; }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Username: " + this.getUsername() +
                "\nName: " + this.getFirstName() +" " + this.getLastName()+
                "\nEmail: " + this.getEmail()+
                "\nAvatar: " + this.getAvatarUrl();
    }

}

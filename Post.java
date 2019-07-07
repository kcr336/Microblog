package org.launchcode;

public class Post {
    //Static variable that stores how many posts have been created
    //so the id of each post is unique
    private static int postCounter = 0;

    private User user;
    private int id;
    private String content;
    private String url;

    //Constructor to create new Post object with just user and content
    public Post(User user, String content) {
        postCounter++;
        this.id = postCounter;
        this.user = user;
        this.content = content;
    }

    //Constructor to create new Post object with user, content, and url
    public Post(User user, String content, String url) {
        postCounter++;
        this.id = postCounter;
        this.user = user;
        this.content = content;
        this.url = url;
    }
    public Post(){
        postCounter++;
        this.id= postCounter;
    }

    public int getPostCounter() {
        return postCounter;
    }

    public void setPostCounter(int postCounter) {
        this.postCounter = postCounter;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

   public void setId(int id) { this.id = id; }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return  "Post number: " + this.id +
                "\nPost:" + this.content+
                "\nWritten by: " + user.getUsername() +
                "\nURL: " + (this.url != null ? this.url : "");

    }

}

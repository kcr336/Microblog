package org.launchcode;
import java.util.Scanner;



public class PostCreator {

    private Scanner keyboard;

    //this is my constructor
    public PostCreator() {
        this.keyboard = new Scanner(System.in);
    }

    private Post makePost(User user) {
        System.out.println("Would you like to make a post?");
        String postResponse = this.keyboard.nextLine();
        if (postResponse.toLowerCase().equals("y")) {
            System.out.println("Alright let's make a post.");
            writeThePost(user);
        } else if (postResponse.toLowerCase().equals("n")) {
            System.out.println("Alright, that is not a problem");
            keyboard.skip("\n");
        } else {
            System.out.println("That is not a valid response");
            keyboard.skip("\n");
        }
        return makePost(user);

    }

    public Post writeThePost(User user){
        Post post = new Post();
        int id=2;
        id++;
        post.setUser(user);
        post.setPostCounter(id++);
        System.out.println("Go ahead and write your post.");
        post.setContent(this.keyboard.nextLine());
        System.out.println("Excellent, let's post it.");
        PostMenu.newPost.add(post);

        return post;
        }

    }



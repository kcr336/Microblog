package org.launchcode;
import java.util.Scanner;
import java.util.ArrayList;

public class PostMenu {

    public static ArrayList <Post> newPost = new ArrayList();
    public static ArrayList<User> userLog = new ArrayList();

    Scanner keyboard = new Scanner(System.in);

    //Here is my first Constructor
    public PostMenu() {
    }

    //First menu to see what they want to do
    public void run() {
        int choices;
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Log in");
            System.out.println("2. Create a new user");
            System.out.println("3. Print out all of the Users");
            System.out.println("4. Create a new post");
            System.out.println("5. Print out all of the Posts");
            choices = keyboard.nextInt();
            keyboard.skip("\n");
            if (choices != 0) {
                signUp(choices);
                break;
            }

        } while (choices != 0);
    }

    private void signUp(int choices) {
        switch (choices) {
            case 1:
                System.out.println("You may proceed.");
                pickUser();
                keyboard.skip("\n");
                break;
            case 2:
                //create user
                System.out.println("I will need some information from you.");
                giveMeInfo();
                break;
            case 3:
                //print out the users
                System.out.println("Here are the Users in my system.");
                viewUsers();
                break;
            case 4:
                //make a post
                System.out.println("Go ahead and make a post.");
                PostCreator postCreator = new PostCreator();
                postCreator.writeThePost(pickUser());
                break;
            case 5:
                //print out the posts
                System.out.println("Here are the posts in my system.");
                viewPosts();
                break;
            default:
                System.out.println("You have chosen poorly.");
                keyboard.skip("\n");
                break;

        }

    }

    //This is my method to get all my info to make a new user
    public User giveMeInfo() {
        User user = new User();
        System.out.println("What is your first name?");
        user.setFirstName(keyboard.nextLine());
        System.out.println("What is your last name?");
        user.setLastName(keyboard.nextLine());
        System.out.println("What do you want your username to be?");
        user.setUsername(keyboard.nextLine());
        System.out.println("What is your email?");
        user.setEmail(keyboard.nextLine());
        System.out.println("What is your avatar?");
        user.setAvatarUrl(keyboard.nextLine());
        validateUser(user);
        userLog.add(user);
        return user;
    }

    //verify the info is correct
    public boolean validateUser(User user) {
        String response;
        System.out.println("\n" + user.toString());
            System.out.println("Is this correct? Please type /y/ or /n/");
            response = this.keyboard.nextLine();
            if (response.toLowerCase().equals("y")) {
                System.out.println("Congratulations, you have made a login.");
                return true;
            } else if (response.toLowerCase().equals("n")) {
                System.out.println("Alright, lets do this again.");
                giveMeInfo();
                return false;
            } else {
                System.out.println("You have chosen poorly.");
                return false;
            }
    }

    //pick a user
    public User pickUser() {
        System.out.println("Please pick a user.");
        int pickOne;
        User user = new User();
        for (int i = 0; i < userLog.size(); i++) {
            System.out.println(i+" "+userLog.get(i).getUsername());
        }
        pickOne = keyboard.nextInt();
        return user;
    }

    public Post counter(){
        System.out.println("Here are the number of posts.");
        Post id = new Post();
        for(int i=0; i<newPost.size();i++){
            System.out.println(i+1+" "+newPost.get(i).getContent());

        }return id;
    }


//method to print out the users for my system
    public void viewUsers(){

        for(User instance : userLog) {
            System.out.println("------------------------------------------");
            System.out.println("\n" + instance.toString());

        }
        System.out.println("------------------------------------------");
        System.out.println(" ");


    }
//method to print out the posts in my system
    public void viewPosts(){
        for(Post post: newPost){
            System.out.println("---------------------------------------");
            System.out.println("\n"+post.toString());
        }
        System.out.println("---------------------------------------------");
        System.out.println();
    }


}








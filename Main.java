package org.launchcode;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        user1.setAvatarUrl("bird");
        user1.setFirstName("Indiana");
        user1.setLastName("Jones");
        user1.setUsername("Indy");
        user1.setEmail("indy1@yahoo.com");
        PostMenu.userLog.add(user1);

        User user2 = new User();
        user2.setAvatarUrl("Falcon");
        user2.setFirstName("Han");
        user2.setLastName("Solo");
        user2.setUsername("iKnow");
        user2.setEmail("milleniumfalcon4ever@gmail.com");
        PostMenu.userLog.add(user2);

        Post post1 = new Post();
        post1.setUser(user1);
        post1.setId(1);
        post1.setContent("Why did it have to be snakes?!");
        PostMenu.newPost.add(post1);

        Post post2 = new Post();
        post2.setUser(user2);
        post2.setId(2);
        post2.setContent("It's the ship that made the Kessel Run in less than 12 parsecs!");
        post2.setUrl("Falcon");
        PostMenu.newPost.add(post2);



       PostMenu postMenu = new PostMenu();

       postMenu.run();
       postMenu.run();
       postMenu.run();
       postMenu.run();
       postMenu.run();


        }



    }


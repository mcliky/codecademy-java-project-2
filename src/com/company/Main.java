package com.company;

public class Main {
    /*
   In this program I will create variables to fill in the story
    */
    public static void main(String[] args) {
        String name1 = "John";
        String adjective1 = "awesome";
        String adjective2 = "great";
        String adjective3 = "happy";
        String verb1 = "dance";
        String noun1 = "people";
        String noun2 = "products";
        String noun3 = "music";
        String noun4 = "people";
        String noun5 = "rain";
        String noun6 = "aboriginal";
        String name2 = "Alex";
        int number = 2003;
        String place1 = "Alberta";


        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";
        System.out.println(story);
    }
}

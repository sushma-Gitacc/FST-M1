package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("E");
        hs.add("D");
        hs.add("C");
        hs.add("A");
        hs.add("B");
        hs.add("G");
        System.out.println("Original HashSet: " + hs);
        System.out.println("Size of HashSet: " + hs.size());
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        if(hs.remove("H")) {
            System.out.println("H removed from the Set");
        } else {
            System.out.println("H is not present in the Set");
        }


        System.out.println("Checking if M is present: " + hs.contains("M"));

        System.out.println("Updated HashSet: " + hs);
    }
}

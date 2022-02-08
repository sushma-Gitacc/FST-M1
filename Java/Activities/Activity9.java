package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("papaya");
        myList.add("watermelon");
        myList.add("Banana");
        myList.add(3, "orange");
        myList.add(1, "strawberry");

        System.out.println("Print All the Objects:");
        for(String fruit:myList){
            System.out.println(fruit);
        }

        System.out.println("3rd element in the list : " + myList.get(2));
        System.out.println("does orange exist in list: " + myList.contains("orange"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("Papaya");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}

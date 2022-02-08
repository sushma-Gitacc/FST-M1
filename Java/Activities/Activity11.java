package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "pink");
        hash_map.put(2, "yellow");
        hash_map.put(3, "Blue");
        hash_map.put(4, "White");
        hash_map.put(5, "orange");
        System.out.println("The Original map: " + hash_map);
        hash_map.remove(4);

        System.out.println("After removing White: " + hash_map);
        if(hash_map.containsValue("yellow")) {
            System.out.println("yellow exists in the Map");
        } else {
            System.out.println("yellow does not exist in the Map");
        }
        System.out.println("Number of pairs in the Map is: " + hash_map.size());
    }
}

package lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lists {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("John");
        names.add("Alice");
        names.add("Jane");
        names.add("Mary");

        System.out.println("Original list: " + names);

        Set<String> uniqueNames = new HashSet<>(names);
        List<String> result = new ArrayList<>(uniqueNames);

        System.out.println("List after removing duplicates: " + result);
    }
}


package listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Ashi");
        names.add("Rahul");
        names.add("Priya");
        names.add("Rohan");
        names.add("Aisha");

        // Traverse a list
        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            String nm = i.next();
            System.out.println(nm);

            if (nm.equals("Ashi"))
                i.remove();
        }

        System.out.println("Name List is: " + names);

        // Traverse in reverse / Backward order
        ListIterator<String> li = names.listIterator(names.size());

        while (li.hasPrevious()) {
            String nm = li.previous();
            System.out.println(nm);
        }
    }
}
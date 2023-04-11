import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Hashset Demo: ");
        HashSet<String> set = new HashSet<String>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Mango");
        set.add("Orange");
        System.out.println(set);
        boolean containsApple = set.contains("Apple");
        boolean containsGrapes = set.contains("Grapes");
        System.out.println("Contains apple: " + containsApple);
        System.out.println("Contains grapes: " + containsGrapes);
        set.remove("Cherry");
        System.out.println(set);


        System.out.println("TreeSet Demo: ");
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Mango");
        set2.add("Orange");
        System.out.println(set2);
        String firstFruit = set2.first();
        String lastFruit = set2.last();
        System.out.println("First fruit is " + firstFruit + " & Last fruit is " + lastFruit );
        System.out.println(set2);
        TreeSet<String> headSet = (TreeSet<String>) set2.headSet("Mango");
        TreeSet<String> tailSet = (TreeSet<String>) set2.tailSet("Mango");
        System.out.println(headSet);
        System.out.println(tailSet);

        System.out.println("ArrayList Demo: ");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");
        System.out.println(list);
        String fruitAtIndex2 = list.get(2);
        System.out.println("Fruit at index 2 is " + fruitAtIndex2);
        list.remove(3);
        System.out.println("After removing fruit at index 3");
        System.out.println(list);


        System.out.println("TreeMap Demo: ");
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        map.put("Apple", 1.99);
        map.put("Banana", 0.99);
        map.put("Cherry", 2.99);
        map.put("Mango", 3.99);
        map.put("Orange", 1.49);
        System.out.println(map);
    }
}
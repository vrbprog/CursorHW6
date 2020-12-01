package BaseTasksCollections;

import java.util.*;

public class HashSetTasks {

    public static void main(String[] args) {

        //Task 1
        Set<String> set = new HashSet<String>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        System.out.println("Task 1: Set is : " + set);

        //Task 2
        Set<String> iterateSet = new HashSet<String>(set);
        System.out.print("Task 2: Iterate through all elements of set " + set + " is : ");
        for (String s : iterateSet) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3: Size of set : " + set + " is : " + set.size());

        //Task 4
        Set<String> emptySet = new HashSet<String>(set);
        emptySet.removeAll(emptySet);
        System.out.println("Task 4: Set " + set + " after remove all elements is set : " + emptySet);

        //Task5
        System.out.println("Task 5: Checking set " + emptySet + " is empty ? : " + emptySet.isEmpty());

        //Task6
        HashSet<String> cloningSet = new HashSet<>(Arrays.asList("Yellow", "Grey", "Blue"));
        Set<String> clonedSet = (HashSet<String>) cloningSet.clone();
        System.out.println("Task 6: " + "Cloned list of " + cloningSet + " is list " + clonedSet);

        //Task7
        Set<String> initSet = new HashSet<>(Arrays.asList("Yellow", "Grey", "Blue"));
        String[] array = new String[initSet.size()];
        initSet.toArray(array);
        System.out.print("Task 7: Array : ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println(" from set " + initSet);

        //Task8
        Set<String> treeSet = new TreeSet<>(initSet);
        System.out.println("Task 8: TreeSet " + treeSet + " from set " + initSet);

        //Task9
        List<String> list = new ArrayList<>(initSet);
        System.out.println("Task 9: ArrayList " + list + " from set " + initSet);

        //Task10
        Set<String> oneSet = new HashSet<>(Arrays.asList("Yellow", "Grey", "Cyan"));
        Set<String> twoSet = new HashSet<>(Arrays.asList("Blue", "Cyan", "Black"));
        System.out.print("Task 10: " + "Compare set " + oneSet + " and set " + twoSet + " is: ");
        for (String element : oneSet) {
            System.out.print(twoSet.contains(element) ? "Yes " : "No ");
        }
        System.out.println();

        //Task11
        Set<String> onesSet = new HashSet<>(Arrays.asList("Yellow", "Pink", "Grey", "Cyan"));
        Set<String> twosSet = new HashSet<>(Arrays.asList("Blue", "Cyan", "Black", "Pink"));
        System.out.print("Task 11: " + "Compare set " + onesSet + " and set " + twosSet + " and retain same elements : ");
        for (String element : onesSet) {
            System.out.print(twosSet.contains(element) ? element + " " : "");
        }
        System.out.println();

        //Task 12
        Set<String> clearSet = new HashSet<String>(set);
        clearSet.clear();
        System.out.println("Task 12: Set " + set + " after clear all elements is set : " + clearSet);

    }
}

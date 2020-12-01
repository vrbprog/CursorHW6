package BaseTasksCollections;

import java.util.*;

public class TreeSetTasks {
    public static void main(String[] args) {

        //Task 1
        Set<String> tSet = new TreeSet<>();
        tSet.add("Red");
        tSet.add("Green");
        tSet.add("Black");
        tSet.add("Yellow");
        System.out.println("Task 1: TreeSet is : " + tSet);

        //Task 2
        Set<String> iterateSet = new TreeSet<String>(tSet);
        System.out.print("Task 2: Iterate through all elements of set " + tSet + " is : ");
        for (String s : iterateSet) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Task 3
        Set<String> newSet = new TreeSet<>(tSet);
        Set<String> addingSet = new TreeSet<>();
        addingSet.add("Pink");
        addingSet.add("Orange");
        newSet.addAll(addingSet);
        System.out.println("Task 3: TreeSet " + tSet + " after add new set " + addingSet +
                " is set : " + newSet);

        //Task4
        TreeSet<String> setRev = new TreeSet<>(tSet);
        Iterator ir = setRev.descendingIterator();
        System.out.print("Task 4: Iterate through all elements of set " + tSet +
                " in reverse order is : ");
        while (ir.hasNext()) {
            System.out.print(ir.next() + " ");
        }
        System.out.println("");

        //Task 5
        TreeSet<String> getFirstSet = new TreeSet<>(tSet);
        String firstElement = getFirstSet.first();
        String lastElement = getFirstSet.last();
        System.out.println("Task 5: First element of set " + getFirstSet + " is: " +
                firstElement + ", last element is: " + lastElement);

        //Task6
        TreeSet<String> cloningSet = new TreeSet<>(Arrays.asList("Yellow", "Grey", "Blue"));
        TreeSet<String> clonedSet = (TreeSet<String>) cloningSet.clone();
        System.out.println("Task 6: " + "Cloning list of " + cloningSet + " is list " + clonedSet);

        //Task 7
        System.out.println("Task 7: Size of set : " + tSet + " is : " + tSet.size());

        //Task8
        Set<String> oneSet = new TreeSet<>(Arrays.asList("Yellow", "Grey", "Cyan"));
        Set<String> twoSet = new TreeSet<>(Arrays.asList("Blue", "Cyan", "Black"));
        System.out.print("Task 8: " + "Compare set " + oneSet + " and set " + twoSet + " is: ");
        for (String element : oneSet) {
            System.out.print(twoSet.contains(element) ? "Yes " : "No ");
        }
        System.out.println();

        //Task9
        TreeSet<Integer> numSet = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        TreeSet<Integer> treeHeadSet = (TreeSet<Integer>) numSet.headSet(7);
        System.out.print("Task 9: Numbers less than 7 in a tree set " + numSet +
                " is set: ");
        for (Integer i: treeHeadSet) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task10
        TreeSet<Integer> numberSet = new TreeSet<>(Arrays.asList(11,19,23,31,38,42,57,68,79));
        System.out.println("Task 10: Element in a tree set " + numberSet +
                " which is greater than or equal to 20 is: " + numberSet.ceiling(20));

        //Task11
        TreeSet<Integer> numberLessSet = new TreeSet<>(Arrays.asList(11,19,23,31,38,42,57,68,79));
        System.out.println("Task 11: Element in a tree set " + numberLessSet +
                " which is less than or equal to 40 is: " + numberLessSet.floor(40));

        //Task12
        TreeSet<Integer> numHigSet = new TreeSet<>(Arrays.asList(11,19,23,31,38,42,57,68,79));
        System.out.println("Task 12: Element in a tree set " + numHigSet +
                " which is strictly greater than or equal to 19 is: " + numHigSet.higher(19));

        //Task13
        TreeSet<Integer> numLessSet = new TreeSet<>(Arrays.asList(11,19,23,31,38,42,57,68,79));
        System.out.println("Task 13: Element in a tree set " + numLessSet +
                " which is strictly less than or equal to 42 is: " + numLessSet.lower(42));

        //Task14
        TreeSet<Integer> firstSet = new TreeSet<>(Arrays.asList(11,23,31,38,57,68,79));
        TreeSet<Integer> delFirstSet = new TreeSet<>(firstSet);
        System.out.println("Task 14: TreeSet " + firstSet + " after removing first element " +
                delFirstSet.pollFirst() + " is TreeSet: " + delFirstSet);

        //Task15
        TreeSet<Integer> lastSet = new TreeSet<>(Arrays.asList(11,23,31,38,57,68,79));
        TreeSet<Integer> delLastSet = new TreeSet<>(lastSet);
        System.out.println("Task 15: TreeSet " + lastSet + " after removing last element " +
                delLastSet.pollLast() + " is TreeSet: " + delLastSet);

        //Task16
        TreeSet<Integer> iSet = new TreeSet<>(Arrays.asList(11,23,31,38,57,68,79));
        TreeSet<Integer> removeSet = new TreeSet<>(iSet);
        removeSet.remove(57);
        System.out.println("Task 16: TreeSet " + iSet + " after removing element 57" +
                " is TreeSet: " + removeSet);



    }
}

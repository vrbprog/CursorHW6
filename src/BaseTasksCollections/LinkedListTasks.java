package BaseTasksCollections;

import java.util.*;

public class LinkedListTasks {
    public static void main(String[] args) {

        //Task1
        List<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Black");
        list.add("Grey");
        System.out.println("Task 1: ArrayList is :" + list);

        //Task2
        System.out.print("Task 2: Iterate through all elements - ");
        for (String color : list) {
            System.out.print(color + ",");
        }

        //Task3
        Iterator i = list.listIterator(1);
        System.out.print("\n\rTask 3: Iterate through all elements of list " + list +
                " from 1 element is : ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        //Task4
        LinkedList<String> listRev = new LinkedList<>(list);
        Iterator ir = listRev.descendingIterator();
        System.out.print("\n\rTask 4: Iterate through all elements of list " + list +
                " in reverse order is : ");
        while (ir.hasNext()) {
            System.out.print(ir.next() + " ");
        }
        System.out.println("");

        //Task5
        List<String> noReplaceList = new LinkedList<>(Arrays.asList("Yellow", "Grey", "Blue"));
        List<String> replaceList = new LinkedList<>(noReplaceList);
        replaceList.set(1, "Red");
        System.out.println("Task 5: List with replaced 1 index element of list " + noReplaceList +
                " for new element of Red is " + replaceList);

        //Task6
        LinkedList<String> addFirstList = new LinkedList<>(list);
        addFirstList.addFirst("White");
        addFirstList.addLast("Cyan");
        System.out.println("Task 6: List with added new first and last elements to list " +
                list +  " is list " + addFirstList);


    }

}

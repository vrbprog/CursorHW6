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
        List<String> noAddingList = new LinkedList<>(Arrays.asList("Yellow", "Grey", "Blue"));
        List<String> addingList = new LinkedList<>(noAddingList);
        addingList.add(1, "Orange");
        System.out.println("Task 5: List with added 1 index element of list " + noAddingList +
                " for new element of Red is " + addingList);

        //Task6
        LinkedList<String> addFirstList = new LinkedList<>(list);
        addFirstList.addFirst("White");
        addFirstList.addLast("Cyan");
        System.out.println("Task 6: List with added new first and last elements to list " +
                list + " is list " + addFirstList);

        //Task 7
        LinkedList<String> addList = new LinkedList<>(list);
        addList.offerFirst("White");
        System.out.println("Task 7: List with added new first elements to list " +
                list + " is list " + addList);

        //Task 8
        LinkedList<String> addLastList = new LinkedList<>(list);
        addLastList.offerLast("Brown");
        System.out.println("Task 8: List with added new last elements to list " +
                list + " is list " + addLastList);

        //Task 9
        List<String> addSubList = new LinkedList<>(list);
        LinkedList<String> subList = new LinkedList<>(Arrays.asList("Brown", "Cyan"));
        addSubList.addAll(1, subList);
        System.out.println("Task 9: List with added subList " + subList + " to index 1 of list " +
                list + " is list " + addSubList);

        //Task 10
        LinkedList<String> getFirstList = new LinkedList<>(list);
        String firstElement = getFirstList.getFirst();
        String lastElement = getFirstList.getLast();
        System.out.println("Task 10: First element of list " + getFirstList + " is: " +
                firstElement + ", last element is " + lastElement);

        //Task 11
        List<String> positionList = new LinkedList<>(list);
        System.out.print("Task 11: Positions elements of list " + positionList + " is: ");
        for (String s : positionList) {
            System.out.print(" " + s + " - " + positionList.indexOf(s));
        }

        //Task 12
        List<String> removeList = new LinkedList<>(list);
        removeList.remove(1);
        System.out.println("\n\rTask 12: List with removed second element of list " + list +
                " is list " + removeList);

        //Task 13
        LinkedList<String> removeFirstList = new LinkedList<>(list);
        removeFirstList.removeFirst();
        removeFirstList.removeLast();
        System.out.println("Task 13: List with removed first and last elements of list " + list +
                " is list " + removeFirstList);

        //Task 14
        List<String> clearList = new LinkedList<>(list);
        clearList.clear();
        System.out.println("Task 14: List with removed all elements of list " + list +
                " is list " + clearList);

        //Task15
        List<String> swapList = new LinkedList<>(list);
        Collections.swap(swapList, 0, 3);
        System.out.println("Task 15: Swap 0 and 3 element of list " + list +
                " is list " + swapList);

        //Task16
        List<String> shuffledList = new LinkedList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("Task 16: " + "Shuffle list from list " +
                list + " is list " + shuffledList);

        //Task17
        List<String> oneJoinList = new LinkedList<>(Arrays.asList("Yellow", "Grey", "Cyan"));
        List<String> twoJoinList = new LinkedList<>(Arrays.asList("Blue", "White", "Black"));
        List<String> joinList = new LinkedList<>();
        joinList.addAll(oneJoinList);
        joinList.addAll(twoJoinList);
        System.out.println("Task 17: Join list " + oneJoinList + " and list " +
                twoJoinList + " is list " + joinList);

        //Task18
        LinkedList<String> cloningList = new LinkedList<>(Arrays.asList("Yellow", "Grey", "Blue"));
        LinkedList<String> clonedList = (LinkedList<String>) cloningList.clone();
        System.out.println("Task 18: " + "Cloned list of " + cloningList + " is list " + clonedList);

        //Task19
        LinkedList<String> popList = new LinkedList<>(list);
        System.out.println("Task 19: List with removed " + popList.pop() + " elements of list " + list +
                " is list " + popList);

        //Task20
        LinkedList<String> peekList = new LinkedList<>(list);
        System.out.println("Task 20: List with retrieved " + peekList.peekFirst() + " elements of list " + list +
                " is list " + peekList);

        //Task21
        LinkedList<String> peekLastList = new LinkedList<>(list);
        System.out.println("Task 21: List with retrieved " + peekLastList.peekLast() + " elements of list " + list +
                " is list " + peekLastList);

        //Task22
        List<String> containList = new LinkedList<>(list);
        System.out.println("Task 22: List " + containList + " contains elements Orange ? : " + containList.contains("Orange"));

        //Task23
        List<String> linkList = new LinkedList<>(list);
        List<String> arrayList = new ArrayList<>(linkList);
        System.out.println("Task 23: ArrayList " + arrayList + " from LinkedList " + linkList);

        //Task24
        List<String> oneList = new LinkedList<>(Arrays.asList("Yellow", "Grey", "Cyan", "Blue", "Orange"));
        List<String> twoList = new LinkedList<>(Arrays.asList("Blue", "Cyan", "Black", "White", "Brown"));
        System.out.println("Task 24: " + "Compare list " + oneList + " and list "
                + twoList + " is list " + compareTwoList(oneList, twoList));

        //Task25
        List<String> emptyList = new LinkedList<>();
        System.out.println("Task 25: Checking list " + emptyList + " is empty ?: " + emptyList.isEmpty());

        //Task26
        List<String> noReplaceList = new LinkedList<>(Arrays.asList("Yellow", "Grey", "Blue"));
        List<String> replaceList = new LinkedList<>(noReplaceList);
        replaceList.set(1, "Red");
        System.out.println("Task 26: List with replaced 1 index element of list " + noReplaceList +
                " for new element of Red is " + replaceList);
    }

    public static List<String> compareTwoList(List<String> one, List<String> two) {
        List<String> res = new ArrayList<>();
        for (String s : one) {
            res.add(two.contains(s) ? "Yes" : "No");
        }
        return res;
    }

}

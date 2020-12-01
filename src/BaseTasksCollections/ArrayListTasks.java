package BaseTasksCollections;

import java.util.*;

public class ArrayListTasks {
    public static void main(String[] args) {

        //Task1
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Black");
        System.out.println("Task 1: ArrayList is :" + list);

        //Task2
        System.out.print("Task 2: iterate through all elements - ");
        for (String color : list) {
            System.out.print(color + ",");
        }

        //Task3
        list.add(0, "White");
        System.out.println("\n\rTask 3: List with insert of first element is :" + list);

        //Task4
        int index = 1;
        System.out.println("Task 4: " +
                "Element index of " + index + " from list " +
                list + " is " + list.get(index));

        //Task5
        List<String> updateList = new ArrayList<>(list);
        String updateElement = "Blue";
        String newElement = "Cyan";
        updateList.set(updateList.indexOf(updateElement), newElement);
        System.out.println("Task 5: " +
                "List with update on " + newElement + " element " +
                updateElement + " from list " + list + " is :" + updateList);

        //Task6
        List<String> deleteList = new ArrayList<>(updateList);
        int index3 = 2;
        deleteList.remove(index3);
        System.out.println("Task 6: " + "List with third removed element from list " +
                updateList + " is :" + deleteList);

        //Task7
        String searchingElement = "Red";
        System.out.println("Task 7: " + "Index of searching element " + searchingElement +
                " from list " + deleteList + " is : " + deleteList.indexOf(searchingElement));

        //Task8
        List<String> sortedList = new ArrayList<>(deleteList);
        Collections.sort(sortedList);
        System.out.println("Task 8: " + "Sorted list from unsorted list " +
                deleteList + " is list " + sortedList);

        //Task9
        List<String> copyList = new ArrayList<>(Arrays.asList("Yellow", "Grey", "Cyan"));
        List<String> copiedList = new ArrayList<>(deleteList);
        Collections.copy(copiedList, copyList);
        System.out.println("Task 9: " + "Copy list " + copyList + " to list " +
                deleteList + " is list " + copiedList);

        //Task10
        List<String> shuffledList = new ArrayList<>(copiedList);
        Collections.shuffle(shuffledList);
        System.out.println("Task 10: " + "Shuffle list from list " +
                copiedList + " is list " + shuffledList);

        //Task11
        List<String> reversedList = new ArrayList<>(shuffledList);
        Collections.reverse(reversedList);
        System.out.println("Task 11: " + "Reversed list from list " +
                shuffledList + " is list " + reversedList);

        //Task12
        List<String> extractedList = reversedList.subList(0, 2);
        System.out.println("Task 12: " + "Extract part of 2 elements list " + reversedList +
                " from 0 index is list : " + extractedList);

        //Task13
        List<String> oneList = new ArrayList<>(Arrays.asList("Yellow", "Grey", "Cyan", "Blue", "White"));
        List<String> twoList = new ArrayList<>(Arrays.asList("Blue", "Cyan", "Black", "White", "Brown"));
        System.out.println("Task 13: " + "Compare list " + oneList + " and list "
                + twoList + " is list " + compareTwoList(oneList, twoList));

        //Task14
        List<String> swapList = new ArrayList<>(oneList);
        Collections.swap(swapList, 0, 3);
        System.out.println("Task 14: Swap 0 and 3 element of list " + oneList +
                " is list " + swapList);

        //Task15
        List<String> oneJoinList = new ArrayList<>(Arrays.asList("Yellow", "Grey", "Cyan"));
        List<String> twoJoinList = new ArrayList<>(Arrays.asList("Blue", "White", "Black"));
        List<String> joinList = new ArrayList<>();
        joinList.addAll(oneJoinList);
        joinList.addAll(twoJoinList);
        System.out.println("Task 15: Join list " + oneJoinList + " and list " +
                twoJoinList + " is list " + joinList);

        //Task16
        ArrayList<String> cloningList = new ArrayList<>(Arrays.asList("Yellow", "Grey", "Blue"));
        ArrayList<String> clonedList = (ArrayList<String>) cloningList.clone();
        System.out.println("Task 16: " + "Cloned list of " + cloningList + " is list " + clonedList);

        //Task17
        List<String> originList = new ArrayList<>(Arrays.asList("Yellow", "Grey", "Blue"));
        List<String> emptyList = new ArrayList<>(originList);
        emptyList.removeAll(originList);
        System.out.println("Task 17: " + "Emptied list of " + originList + " is list " + emptyList);

        //Task18
        System.out.println("Task 18: checking list " + emptyList + " is empty : " + emptyList.isEmpty());

        //Task19
        List<String> noTrimList = new ArrayList<>(Arrays.asList("Yellow", "Grey", "Blue"));
        ArrayList<String> trimList = new ArrayList<>(noTrimList);
        trimList.trimToSize();
        System.out.println("Task 19: Trim size of list " + noTrimList + " is list : " + trimList);

        //Task20
        ArrayList<String> minList = new ArrayList<>(3);
        minList.add("Yellow");
        minList.add("Blue");
        minList.add("Grey");
        System.out.print("Task 20: List with initial size of 3 is " + minList);
        minList.ensureCapacity(6);
        minList.add("White");
        minList.add("Red");
        minList.add("Cyan");
        System.out.println(". After increase the size to 6, list is " + minList);

        //Task21
        List<String> noReplaceList = new ArrayList<>(Arrays.asList("Yellow", "Grey", "Blue"));
        List<String> replaceList = new ArrayList<>(noReplaceList);
        replaceList.set(1, "Red");
        System.out.println("Task 21: List with replaced 1 index element of list " + noReplaceList +
                " for new element of Red is " + replaceList);

        //Task22
        List<String> arrayList = new ArrayList<>(Arrays.asList("Yellow", "Grey", "Blue", "Red"));
        System.out.print("Task 22: Printing all elements of current list " + arrayList + " : ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

    }

    public static List<String> compareTwoList(List<String> one, List<String> two) {
        List<String> res = new ArrayList<>();
        for (String s : one) {
            res.add(two.contains(s) ? "Yes" : "No");
        }
        return res;
    }
}



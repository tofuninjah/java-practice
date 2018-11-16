import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Java Collection: 22 LinkList Exercises
 */
class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> aLinkedList = new LinkedList<>();
        aLinkedList.add("default-a");
        aLinkedList.add("default-b");
        aLinkedList.add("default-c");
        aLinkedList.add("default-d");
        aLinkedList.add("default-e");

        /**
         * 1. Append the specified element to the end of a linked list
         */
        String element = "new-a";
        System.out.println(aLinkedList);
        aLinkedList.add(element);
        System.out.println(aLinkedList);

        /**
         * 2. Iterate through all elements in a linked list
         */
        for (String el : aLinkedList) {
            System.out.println(el);
        }

        /**
         * 3. Iterate through all elements in a linked list starting at the specified
         * position.
         */
        Iterator iterator = aLinkedList.iterator();

        while (iterator.hasNext()) {
            System.out.printf("Iterating... %s | ", iterator.next());
        }
        System.out.printf("%n");

        /**
         * 4. Iterate a linked list in reverse order.
         */
        Iterator listIterator = aLinkedList.descendingIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        /**
         * 5. Insert the specified element at the specified position in the linked list.
         */
        String el = "Specific Element";
        aLinkedList.add(0, el);
        System.out.println(aLinkedList);

        /**
         * 6. Insert elements into the linked list at the first and last position.
         */
        aLinkedList.addFirst("veryFirst");
        aLinkedList.addLast("veryLast");
        System.out.println(aLinkedList);

        /**
         * 7. Insert the specified element at the front of a linked list. The difference
         * is what happens when the addition fails, due to a queue capacity restriction:
         * .addFirst() throws an (unchecked) exception, .offerFirst() returns false.
         */
        aLinkedList.offerFirst("aVeryOfferFirst");
        System.out.println(aLinkedList);

        /**
         * 8. Insert the specified element at the end of a linked list.
         */
        aLinkedList.offerLast("averyOfferLast");
        System.out.println(aLinkedList);

        /**
         * 9. Insert some elements at the specified position into a linked list.
         */
        LinkedList<String> newElements = new LinkedList<>();
        newElements.add("newEl1");
        newElements.add("newEl2");
        aLinkedList.addAll(4, newElements);
        System.out.println(aLinkedList);

        /**
         * 10. get the first and last occurrence of the specified elements in a linked
         * list.
         */
        String firstEl = aLinkedList.getFirst();
        String lastEl = aLinkedList.getLast();
        System.out.printf("First index: %s%n", firstEl);
        System.out.printf("Last index: %s%n", lastEl);

        /**
         * 11. display the elements and their positions in a linked list.
         */
        for (int i = 0; i < aLinkedList.size(); i++) {
            System.out.println(i);
            System.out.println(aLinkedList.get(i));
        }

        /**
         * 12. remove a specified element from a linked list.
         */

        /**
         * 13. remove first and last element from a linked list.
         */

        /**
         * 14. remove all the elements from a linked list.
         */

        /**
         * 15. Write a Java program of swap two elements in an linked list.
         */

        /**
         * 16. shuffle the elements in a linked list.
         */

        /**
         * 17. join two linked lists.
         */

        /**
         * 18. clone an linked list to another linked list.
         */

        /**
         * 19. remove and return the first element of a linked list.
         */

        /**
         * 20. retrieve but does not remove, the first element of a linked list.
         */

        /**
         * 21. retrieve but does not remove, the last element of a linked list.
         */

        /**
         * 22. check if a particular element exists in a linked list.
         */

        /**
         * 23. convert a linked list to array list.
         */

        /**
         * 24. compare two linked lists.
         */

        /**
         * 25. test an linked list is empty or not.
         */

        /**
         * 26. replace an element in a linked list.
         */

    }
}


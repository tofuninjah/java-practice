import java.util.*;

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
         * 10. Get the first and last occurrence of the specified elements in a linked
         * list.
         */
        String firstEl = aLinkedList.getFirst();
        String lastEl = aLinkedList.getLast();
        System.out.printf("First index: %s%n", firstEl);
        System.out.printf("Last index: %s%n", lastEl);

        /**
         * 11. Display the elements and their positions in a linked list.
         */
        for (int i = 0; i < aLinkedList.size(); i++) {
            System.out.println(i);
            System.out.println(aLinkedList.get(i));
        }

        /**
         * 12. Remove a specified element from a linked list.
         */
        aLinkedList.remove(4);

        /**
         * 13. Remove first and last element from a linked list.
         */
        System.out.printf("Before first and last element removed: %s%n", aLinkedList);
        aLinkedList.removeFirst();
        aLinkedList.removeLast();
        System.out.printf("After first and last element removed: %s%n", aLinkedList);

        /**
         * 14. Remove all the elements from a linked list.
         */
        LinkedList removeEverything = new LinkedList();
        removeEverything.add("this");
        removeEverything.add("that");
        
        System.out.println(removeEverything);
        removeEverything.clear();
        System.out.println(removeEverything);

        /**
         * 15. Write a Java program of swap two elements in an linked list.
         */
        Collections.swap(aLinkedList, 4, 5);
        System.out.println(aLinkedList);

        /**
         * 16. Shuffle the elements in a linked list.
         */
        Collections.shuffle(aLinkedList);
        System.out.println(aLinkedList);

        /**
         * 17. Join two linked lists.
         */
        LinkedList joinedLinkedList = new LinkedList();
        LinkedList addAllThis = new LinkedList();
        addAllThis.add("add-this");
        addAllThis.add("add-that");
        joinedLinkedList.addAll(aLinkedList);
        joinedLinkedList.addAll(addAllThis);
        System.out.println(joinedLinkedList);

        /**
         * 18. Clone an linked list to another linked list.
         */
        LinkedList clonedLinkList = new LinkedList(aLinkedList);
        System.out.printf("Cloned: %s%n", clonedLinkList);
        System.out.printf("Original: %s%n", aLinkedList);
        
        /**
         * 19. Remove and return the first element of a linked list.
         */
        System.out.printf("Pop First: %s%n", aLinkedList);
        String puhPuhPuhPopped = aLinkedList.pop();
        System.out.println(puhPuhPuhPopped);
        System.out.printf("Should have been removed: %s%n", aLinkedList);

        /**
         * 20. Retrieve but does not remove, the first element of a linked list.
         */
        System.out.printf("Peek First: %s%n", aLinkedList);
        String puhPuhPuhPeek = aLinkedList.peek();
        System.out.println(puhPuhPuhPeek);
        System.out.printf("Should have not been removed: %s%n", aLinkedList);

        /**
         * 21. Retrieve but does not remove, the last element of a linked list.
         */
         
         System.out.printf("Last element from LinkedList: %s%n", aLinkedList.peekLast());
         System.out.printf("Shouldn't have been removed: %s%n", aLinkedList);

        /**
         * 22. Check if a particular element exists in a linked list.
         */
		System.out.printf("Does this contain \"newEl2\" ?: %s%n", aLinkedList.contains("newEl2"));
		
        /**
         * 23. Convert a linked list to array list.
         */
        LinkedList <String> linked_list = new LinkedList <String> ();
        linked_list.add("Red");
        linked_list.add("Green");
        linked_list.add("Black");
        linked_list.add("White");
        linked_list.add("Pink");
        System.out.println("Original linked list: " + linked_list);
        
		List<String> list = new ArrayList<String>(linked_list);
		
		Class cls2 = list.getClass();
    	System.out.println("The type of the object is: " + cls2.getName());
		
		System.out.printf("LinkedList to an array: %s%n", list);
		
        /**
         * 24. Compare two linked lists.
         */
		LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");

        //comparison output in linked list
        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : c1) {
          c3.add(c2.contains(e) ? "Yes" : "No");
          System.out.println(c3);         
    	}

        /**
         * 25. Test an linked list is empty or not.
         */
	System.out.printf("Shouldn't be empty (false): %s%n",aLinkedList.isEmpty());
	System.out.printf("Should be empty (true): %s%n", removeEverything.isEmpty());
		
		
        /**
         * 26. Replace an element in a linked list.
         */
         System.out.println(aLinkedList);
         aLinkedList.set(1, "Hello");
         System.out.println(aLinkedList);
    }
}


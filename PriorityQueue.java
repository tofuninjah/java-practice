import java.util.*;

/**
 * Java Collection: 16 PriorityQueue Exercises
 * https://www.baeldung.com/java-tree-set
 */
class PriorityQueueDemo {
    public static void main(String args[]) {
        /**
         * 1. Create a new priority queue, add some colors (string) and print out the elements of the priority queue.
         */
         System.out.println("~~~~~~~~ 1. ~~~~~~~~");
         Queue<String> pQ = new PriorityQueue<>();
         pQ.add("White");
         pQ.add("black");
         pQ.add("red");
         pQ.add("green");
         pQ.add("blue");
         System.out.println(pQ);
         
        /**
         * 2. Iterate through all elements in priority queue. 
         */
        System.out.println("~~~~~~~~ 2. ~~~~~~~~");
    	
    	for(String str : pQ) {
        	System.out.printf("Elements in the queue: %s%n", str);
        }
        
        /**
         * 3. Add all the elements of a priority queue to another priority queue. 
         */
        System.out.println("~~~~~~~~ 3. ~~~~~~~~");
    	PriorityQueue<String> pQ2 = new PriorityQueue<>();
         pQ2.add("white-black");
         pQ2.add("black-red");
         pQ2.add("red-green");
         pQ2.add("green-blue");
         pQ2.add("blue-white");
         
         pQ.addAll(pQ2);
         System.out.println(pQ);
    	
        /**
         * 4. Insert a given element into a priority queue.
         * Difference between offer() and add()?
         * http://www.interviewsansar.com/2015/05/22/which-method-will-you-prefer-between-add-and-offer-methods-to-add-elements-in-a-queue-and-why/
         * https://stackoverflow.com/questions/2703984/what-is-the-difference-between-the-add-and-offer-methods-in-a-queue-in-java
         */
        System.out.println("~~~~~~~~ 4. ~~~~~~~~");
        pQ.offer("new-blue");
        pQ.add("new-blue-add-new");
        System.out.println(pQ);
    	
        /**
         * 5. Remove all the elements from a priority queue. 
         */
        System.out.println("~~~~~~~~ 5. ~~~~~~~~");
        System.out.println(pQ2);
        //pQ2.removeAll(pQ2);
        pQ2.clear();
        System.out.println(pQ2);
    	
        /**
         * 6. Count the number of elements in a priority queue. 
         */
        System.out.println("~~~~~~~~ 6. ~~~~~~~~");
        System.out.printf("pq.size() is: %s%n", pQ.size());
    	
        /**
         * 7. Compare two priority queues. 
         */
        System.out.println("~~~~~~~~ 7. ~~~~~~~~");
    	PriorityQueue<String> pq1 = new PriorityQueue<String>();  
    	
		pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("First Priority Queue: "+pq1);
        
        PriorityQueue<String> pq2 = new PriorityQueue<String>();  
        pq2.add("Red");
        pq2.add("Pink");
        pq2.add("Black");
        pq2.add("Orange");
        
        System.out.println("Second Priority Queue: "+pq2);
        
        //comparison output in Priority Queue
        for (String element : pq1){
        	System.out.println(pq2.contains(element) ? "Yes" : "No");
        }  
          
        /**
         * 8. Retrieve the first element of the priority queue.
         */
        System.out.println("~~~~~~~~ 8. ~~~~~~~~");
        System.out.println(pQ);
        System.out.printf("Peek at first element: %s%n", pQ.peek());
        
        /**
         * 9. Retrieve and remove the first element.
         */
        System.out.println("~~~~~~~~ 9. ~~~~~~~~");
        System.out.println(pQ);
    	System.out.printf("Retrieve and remove the first element: %s%n", pQ.poll());
    	System.out.println(pQ);
        
        /**
         * 10. Convert a priority queue to an array containing all of the elements of the queue.
         */
        System.out.println("~~~~~~~~ 10. ~~~~~~~~");
        PriorityQueue<String> pq_a = new PriorityQueue<String>();  
		// use add() method to add values in the Priority Queue
        pq_a.add("Red");
        pq_a.add("Green");
        pq_a.add("Black");
        pq_a.add("White");
    	System.out.println("Original Priority Queue: " + pq_a);
    	
    	List<String> array_list = new ArrayList<String>(pq_a);
    	System.out.println("Array containing all of the elements in the queue: " + array_list);
    	
    	Class clsA = array_list.getClass();
    	System.out.println("The type of the object is: " + clsA.getName());
    	 
        /**
         * 11. Convert a Priority Queue elements to a string representation. 
         */
        System.out.println("~~~~~~~~ 11. ~~~~~~~~");
        System.out.println(pQ.toString());
    	
        /**
         * 12. Change priorityQueue to maximum priorityqueue.
         */
        System.out.println("~~~~~~~~ 12. ~~~~~~~~");
        PriorityQueue<Integer> pqI = new PriorityQueue<>(10, Collections.reverseOrder());
      
		// Add numbers in the Queue
		pqI.add(10);
		pqI.add(22);
		pqI.add(36);
		pqI.add(25);
		pqI.add(16);
		pqI.add(70);
		pqI.add(82);
		pqI.add(89);
		pqI.add(14);
		System.out.println("\nOriginal Priority Queue: " + pqI);

		System.out.print("\nMaximum Priority Queue: ");
		
		Integer val = null;
		
		while( (val = pqI.poll()) != null) {
			System.out.print(val + " ");
		}
		
	}
    
}



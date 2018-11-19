import java.util.*;

/**
 * Java Collection: 16 TreeSet Exercises
 * https://www.baeldung.com/java-tree-set
 */
class TreeSetDemo {
    public static void main(String args[]) {
                
        /**
         * 1. create a new tree set, add some colors (string) and print out the tree set. 
         */
        Set<String> aTreeSet = new TreeSet<>();
        aTreeSet.add("blue");
        aTreeSet.add("yellow");
        aTreeSet.add("green");
        aTreeSet.add("black");
        aTreeSet.add("orange");
        
        System.out.println("~~~~ 1. ~~~~");
        System.out.println(aTreeSet);
        
        /**
         * 2. iterate through all elements in a tree set.
         */
         System.out.println("~~~~ 2. ~~~~");
         for(String str : aTreeSet) {
             System.out.println(str);
         }
         

        /**
         * 3. add all the elements of a specified tree set to another tree set. 
         */
		 System.out.println("~~~~ 3. ~~~~");
         Set<String> aTreeSet2 = new TreeSet<>();
         aTreeSet2.add("blue-green");
         aTreeSet2.add("yellow-blue");
         aTreeSet2.add("orange-red");
         aTreeSet.addAll(aTreeSet2);
         System.out.println(aTreeSet);
         
        /**
         * 4. create a reverse order view of the elements contained in a given tree set. 
         */
         System.out.println("~~~~ 4. ~~~~");
         TreeSet<String> aTS = new TreeSet<>(aTreeSet);
         System.out.printf("Descending Order: %s%n", aTS.descendingSet());

        /**
         * 5. get the first and last elements in a tree set.
         */
         System.out.println("~~~~ 5. ~~~~");
		String first = aTS.first();
		String last = aTS.last();
		System.out.printf("First: %s, and Last: %s%n", first, last);
		
        /**
         * 6. clone a tree set list to another tree set.
         */
         System.out.println("~~~~ 6. ~~~~");
         TreeSet<String> aTS2 = new TreeSet<>(aTreeSet);
         System.out.println(aTS2);
        
        /**
         * 7. get the number of elements in a tree set.
         */
        System.out.println("~~~~ 7. ~~~~");
        System.out.printf("Size of TreeSet is: %s%n", aTS2.size());
        
        /**
         * 8. compare two tree sets.
         */
        System.out.println("~~~~ 8. ~~~~");
        
        TreeSet<String> t_set1 = new TreeSet<String>();
    	// use add() method to add values in the tree set
        t_set1.add("Red");
        t_set1.add("Green");
        t_set1.add("Black");
        t_set1.add("White");
        System.out.println("Free Tree set: "+t_set1);

        TreeSet<String> t_set2 = new TreeSet<String>();
        t_set2.add("Red");
        t_set2.add("Pink");
        t_set2.add("Black");
        t_set2.add("Orange");
        System.out.println("Second Tree set: " + t_set2);
        TreeSet<String> result_set = new TreeSet<String>();
        for (String element : t_set1){
        	System.out.println(t_set2.contains(element) ? "Yes" : "No");
        }      
     
        /**
         * 9. find the numbers less than 7 in a tree set.
         */
        System.out.println("~~~~ 9. ~~~~");
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset2 = new TreeSet<Integer>();
		
		// Add numbers in the tree
		tree_num.add(1);
		tree_num.add(2);
		tree_num.add(3);
		tree_num.add(4);
		tree_num.add(5);
		tree_num.add(6);
		tree_num.add(7);
		tree_num.add(8);
		tree_num.add(9);
		tree_num.add(10);
		tree_num.add(20);
		tree_num.add(30);
		tree_num.add(40);
		tree_num.add(50);
		tree_num.add(60);
		
		for(int i : tree_num) {
			if(i < 7){
				treeheadset.add(i);
			}
		}
		
		System.out.println(treeheadset);
		
		// Using Iterator!!!!
		
		treeheadset2 = (TreeSet)tree_num.headSet(7); 
		
		Iterator itr = treeheadset2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
        
        /**
         * 10. get the element in a tree set which is greater than or equal to the given element.
         */
        System.out.println("~~~~ 10. ~~~~");
        // returns a view of elements | System.out.println(tree_num.tailSet(8));
        System.out.println(tree_num.ceiling(42));
        
        /**
         * 11. get the element in a tree set which is less than or equal to the given element.
         */
        System.out.println("~~~~ 11. ~~~~");
        // returns a view of elements | System.out.println(tree_num.headSet(8));
        System.out.println(tree_num.floor(35));
        
        /**
         * 12. get the element in a tree set which is strictly greater than or equal to the given element.
         */
        System.out.println("~~~~ 12. ~~~~");
        System.out.println(tree_num.higher(20));
        
        /**
         * 13. get an element in a tree set which is strictly less than the given element.
         */
        System.out.println("~~~~ 13. ~~~~");
        System.out.println(tree_num.lower(20));
        
        /**
         * 14. retrieve and remove the first element of a tree set.
         */
        System.out.println("~~~~ 14. ~~~~");
        System.out.println("Removes the first(lowest) element: " + tree_num.pollFirst());
        
        /**
         * 15. retrieve and remove the last element of a tree set.
         */
        System.out.println("~~~~ 15. ~~~~");
        System.out.println("Removes the first(lowest) element: " + tree_num.pollLast());
        
        /**
         * 16. remove a given element from a tree set.
         */
        System.out.println("~~~~ 16. ~~~~");
        System.out.println(tree_num);
        System.out.println(tree_num.remove(20));
        System.out.println(tree_num);
        
	}
    
}



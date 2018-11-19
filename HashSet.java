import java.util.*;

/**
 * Java Collection: 12 HashSet Exercises
 * clear() vs removeAll()
 * https://www.baeldung.com/java-collection-clear-vs-removeall
 */
class HashSetDemo {
    public static void main(String args[]) {
        Set<String> aHashSet = new HashSet<>();
        aHashSet.add("default-a");
        aHashSet.add("default-b");
        aHashSet.add("default-c");
        aHashSet.add("default-d");
        aHashSet.add("default-e");

	    /**
	     * 1. Append the specified element to the hash set. 
	     */
	    aHashSet.add("add-new-a");
	    aHashSet.add("add-new-b");
	    aHashSet.add("add-new-c");
	
	    /**
	     * 2. Iterate through all elements in a hash list.
	     */
	    for(String aString : aHashSet) {
	        System.out.printf("For Loop HashSet: %s%n", aString);
	    }
	    
	    Iterator<String> iterator = aHashSet.iterator();
	    
	    while(iterator.hasNext()) {
	    	System.out.printf("Iterator HashSet: %s%n", iterator.next());
	    }
	    
	    /**
	     * 3. Get the number of elements in a hash set.
	     */
	     System.out.println(aHashSet.size());
	    
	    /**
	     * 4. Empty an hash set.
	     */
	    Set<String> aClearedHashSet = new HashSet<>();
        aClearedHashSet.add("clear-a");
        aClearedHashSet.add("clear-b");
        aClearedHashSet.add("clear-c");
        aClearedHashSet.add("clear-d");
        aClearedHashSet.add("clear-e");
	    aClearedHashSet.clear();
	    System.out.printf("A cleared HashSet: %s%n", aClearedHashSet);
	    
	    /**
	     * 5. Test a hash set is empty or not.
	     */
	     System.out.printf("Should return true if empty: %s%n", aClearedHashSet.isEmpty());
	    
	    /**
	     * 6. Clone a hash set to another hash set.
	     */
	    Set<String> aClonedHashSet = new HashSet<>(aHashSet);
	    System.out.printf("A cloned HashSet: %s%n", aClonedHashSet);
	    
	    /**
	     * 7. Convert a hash set to an array.
	     */
	    List<String> list = new ArrayList<String>(aClonedHashSet);
	    System.out.printf("To Array: %s%n", list);
	    
	    Class cls2 = list.getClass();
    	System.out.println("The type of the object is: " + cls2.getName());
	    
	    /**
	     * 8. Convert a hash set to a tree set.
	     */
	     HashSet<String> h_set2 = new HashSet<String>();
		 h_set2.add("Red");
         h_set2.add("Green");
         h_set2.add("Black");
         h_set2.add("White");
         h_set2.add("Pink");
         h_set2.add("Yellow");
	     Set<String> treeSet = new TreeSet<>(h_set2);
	     System.out.printf("HashSet to TreeSet: %s%n", treeSet);
	    
	     Class clsB = treeSet.getClass();
    	 System.out.println("The type of the object is: " + clsB.getName());
	    
	    /**
	     * 9. Convert a hash set to a List/ArrayList.
	     */
	     System.out.println("~~~~~~ HashSet to List/ArrayList ~~~~~~~");
	     List<String> newArrayList = new ArrayList<>(h_set2);
	     Class clsC = newArrayList.getClass();
    	 System.out.println("The type of the object is: " + clsC.getName());
	     System.out.println("~~~~~~ END HashSet to List/ArrayList ~~~~~~~");
	    
	    /**
	     * 10. Compare two hash set.
	     */
	     HashSet<String> set1 = new HashSet<>();
	     HashSet<String> set2 = new HashSet<>();
	     
	     set1.add("red");
	     set1.add("white");
	     set1.add("blue");
	     set2.add("green");
	     set2.add("yellow");
	     set2.add("white");
	     
	     HashSet<String>result_set = new HashSet<String>();
	     
         for (String element : set1){
             System.out.println(set2.contains(element) ? "Yes" : "No");
         }
         
	    
	    /**
	     * 11. Compare two sets and retain elements which are same on both sets.
	     */
	     
	     set1.retainAll(set2);
	     
	     System.out.println(set1);
	     
	    
	    /**
	     * 12. Remove all of the elements from a hash set.
	     * Notice Pink and Yellow are still in the HashSet!!!
	     */
	     HashSet<String> h_set = new HashSet<String>();
		 h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
         
         HashSet<String> h_set3 = new HashSet<String>();
		 h_set3.add("Red");
         h_set3.add("Green");
         h_set3.add("Black");
         h_set3.add("White");

    	 System.out.println("Original Hash Set: " + h_set);
    	 // Remove all elements
    	 h_set.removeAll(h_set3);
    	 System.out.println("Hash Set after removing all the elements "+h_set); 
	    
	}
    
}



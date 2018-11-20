import java.util.*;

/**
 * Java Collection: 12 HashMap Exercises
 */
class HashMapDemo {
    public static void main(String args[]) {
        HashMap<Integer, String> aHashMap = new HashMap<>();

        /**
         * 1. associate the specified value with the specified key in a HashMap. 
         */
        System.out.println("~~~~~~~~~~ 1. ~~~~~~~~~~");
        aHashMap.put(0, "yellow");
        aHashMap.put(1, "white");
        aHashMap.put(2, "blue");
        aHashMap.put(3, "green");
        aHashMap.put(4, "red");
        aHashMap.put(5, "purple");
        aHashMap.put(6, "gold");
        System.out.println(aHashMap);
        
        /**
         * 2. count the number of key-value (size) mappings in a map.
         */
        System.out.println("~~~~~~~~~~ 2. ~~~~~~~~~~");
        System.out.println(aHashMap.size());
        
        /**
         * 3. copy all of the mappings from the specified map to another map.
         */
        System.out.println("~~~~~~~~~~ 3. ~~~~~~~~~~");
        HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
        hash_map2.put(10, "new1");
        hash_map2.put(11, "new2");
        hash_map2.put(12, "new3");
        aHashMap.putAll(hash_map2);
        
        System.out.println(aHashMap);
        
         /**
         * 4. remove all of the mappings from a map.
         */
        System.out.println("~~~~~~~~~~ 4. ~~~~~~~~~~");
        hash_map2.clear();
        System.out.println(hash_map2);
        
        /**
         * 5. check whether a map is Empty or not.
         */
        System.out.println("~~~~~~~~~~ 5. ~~~~~~~~~~");
        System.out.printf("Is the HashMap empty?: %s%n", aHashMap.isEmpty());
        
        /**
         * 6. get a shallow copy of a HashMap instance.
         */
        System.out.println("~~~~~~~~~~ 6. ~~~~~~~~~~");
        HashMap shallowCopy = new HashMap<>(aHashMap);
        System.out.println(shallowCopy);
        
        /**
         * 7. test if a map contains a mapping for the specified key.
         */
        System.out.println("~~~~~~~~~~ 7. ~~~~~~~~~~");
        System.out.println(aHashMap.containsKey(0));
        System.out.println(aHashMap.containsKey(100));
        
        /**
         * 8. test if a map contains a mapping for the specified value.
         */
        System.out.println("~~~~~~~~~~ 8. ~~~~~~~~~~");
        System.out.println(aHashMap.containsValue("green"));
        System.out.println(aHashMap.containsKey("gold-metallic"));
        
        /**
         * 9. create a set view of the mappings contained in a map.
         */
        System.out.println("~~~~~~~~~~ 9. ~~~~~~~~~~");
        System.out.println(aHashMap.entrySet());
        
        /**
         * 10. get the value of a specified key in a map.
         */
        System.out.println("~~~~~~~~~~ 10. ~~~~~~~~~~");
        System.out.println(aHashMap.get(2));
        
        /**
         * 11. get a set view of the keys contained in this map.
         */
        System.out.println("~~~~~~~~~~ 11. ~~~~~~~~~~");
        System.out.println(aHashMap.keySet());
        
        /**
         * 12. get a collection view of the values contained in this map.
         */
         System.out.println("~~~~~~~~~~ 12. ~~~~~~~~~~");
         System.out.println(aHashMap.values());
    }
}


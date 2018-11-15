import java.util.*;

/**
 * Java Collection: 22 ArrayList Exercises
 */
class ArrayListDemo {
    public static void main(String args[]) {

        /**
         * 1. Create an ArrayList of Strings
         */
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Teal");
        colors.add("Maroon");

        System.out.println(colors);

        /**
         * 2. Iterate through all Elements in an ArrayList
         */
        for (String color : colors) {
            System.out.printf(color + " | ");
        }
        System.out.printf("%n");

        /**
         * 3. Insert an element into the array list at the first position
         */
        colors.add(0, "Rainbow");
        System.out.println(colors);

        /**
         * 4. Retrieve an element (at a specified index) from a given array list
         */
        int index = 2;
        String color = colors.get(2);
        System.out.printf("Color at index %s contains: %s%n", index, color);

        /**
         * 5. Update specific array element by given color and change it to 'Shiny'
         */
        int indexOfColor = colors.indexOf("Rainbow");
        colors.set(indexOfColor, "Shiny"); // SET!
        String shinyColor = colors.get(indexOfColor);
        System.out.printf("Rainbow color is at index %s, and now contains: %s%n", indexOfColor, shinyColor);

        /**
         * 6. Remove the third element from an array list
         */
        System.out.println(colors);
        colors.remove(2);
        System.out.println(colors);

        /**
         * 7. Search an element in a array list.
         */
        System.out.printf("The color \"Blue\" is at index: %s%n", colors.indexOf("Blue"));
        System.out.printf("Does the ArrayList of Strings contain \"Blue\"? True or False:%s %n",
                colors.contains("Blue"));

        /**
         * 8. Sort a given ArrayList
         */
        Collections.sort(colors);
        System.out.println(colors);

        /**
         * 9. Copy one ArrayList into another
         */
        List<String> copy1 = new ArrayList<>();
        copy1.add("a");
        copy1.add("b");
        copy1.add("c");
        copy1.add("e");
        copy1.add("f");
        List<String> copy2 = new ArrayList<>();
        copy2.add("x");
        copy2.add("y");
        copy2.add("z");
        // Collections.copy(destination, source)
        Collections.copy(copy1, copy2);
        System.out.println(copy1);
        System.out.println(copy2);

        /**
         * 10. Shuffle elements in an ArrayList
         */
        Collections.shuffle(copy1);
        System.out.println(copy1);

        /**
         * 11. Reverse elements in an ArrayList
         */
        Collections.reverse(copy2);
        System.out.printf("[x, y, z] Reversed copy2 is: %s%n", copy2);

        /**
         * 12. Extract a portion of a array list.
         */
        List<String> extractFromArrayList = new ArrayList<>();
        extractFromArrayList.add("a");
        extractFromArrayList.add("b");
        extractFromArrayList.add("c");
        extractFromArrayList.add("extract1of3");
        extractFromArrayList.add("extract2of3");
        extractFromArrayList.add("extract3of3");
        extractFromArrayList.add("x");
        extractFromArrayList.add("x");
        extractFromArrayList.add("z");
        List<String> extractedColors = extractFromArrayList.subList(3, 6);
        System.out.println(extractedColors);

        /**
         * 13. Compare two array lists.
         */
        List<String> compare1 = new ArrayList<>();
        List<String> compare2 = new ArrayList<>();
        compare1.add("a");
        compare1.add("b");
        compare1.add("c");
        compare1.add("d");
        compare1.add("e");
        compare1.add("f");
        compare2.add("d");
        compare2.add("e");
        compare2.add("f");
        compare2.add("x");
        compare2.add("y");
        compare2.add("z");
        List<String> compared = new ArrayList<>();
        for (String s : compare1) {
            if (compare2.contains(s)) {
                compared.add(s);
            }
        }
        System.out.printf("expecting [d, e, f]: %s%n", compared);

        /**
         * 14. Swap two elements in an array list.
         */
        System.out.println(colors); // [Blue, Green, Maroon, Red, Shiny, Teal, Yellow]
        Collections.swap(colors, 0, 1);
        System.out.printf("Expected [Green, Blue, Maroon, Red, Shiny, Teal, Yellow]: %s%n", colors);

        /**
         * 15. Join two array lists.
         */
        System.out.println(compare1);
        System.out.println(compare2);
        List<String> joinCompare = new ArrayList<>();
        joinCompare.addAll(compare1);
        joinCompare.addAll(compare2);
        System.out.println("---");
        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(joinCompare);
        System.out.println("---");

        /**
         * 16. Clone an array list to another array list.
         */
        List<String> cloned = new ArrayList<>(joinCompare);
        System.out.printf("Cloning. [a, b, c, d, e, f, d, e, f, x, y, z] is expected: %s%n", cloned);

        /**
         * 17. Empty an array list.
         */
        cloned.removeAll(cloned);
        System.out.println(cloned);

        cloned.clear();
        System.out.println(cloned);

        /**
         * 18. Test an array list is empty or not.
         */
        System.out.printf("Is the cloned ArrayList empty? %s%n", cloned.isEmpty());

        /**
         * 19. Trim the capacity of an array list the current list size.
         */
        ArrayList<String> toTrimArrayList = new ArrayList<>();
        toTrimArrayList.add("1");
        toTrimArrayList.add("2");
        toTrimArrayList.add("3");
        toTrimArrayList.trimToSize();

        /**
         * 20. Increase the size of an array list. The idea behind the implementation of
         * ArrayList is that you should rarely care how big the size is exactly, you
         * should only care that it's big enough (controlled with ensureCapacity()), and
         * not too big (controlled with trimToSize()). So when you try to add more
         * elements to the already loaded ArrayList, you can be sure that their is very
         * minimum performance issue.
         */
        ArrayList<String> arrayListIs3 = new ArrayList<>(3);
        arrayListIs3.add("1");
        arrayListIs3.add("2");
        arrayListIs3.add("3");
        System.out.println(arrayListIs3.size());
        System.out.println(arrayListIs3);

        arrayListIs3.ensureCapacity(4);
        arrayListIs3.add("4?");
        System.out.println(arrayListIs3.size());

        /**
         * 21. Replace the second element of a ArrayList with the specified element.
         */
        colors.set(4, "blue-aqua");
        System.out.println(colors); // Expect to contain blue-aqua

        /**
         * 22. Print all the elements of a ArrayList using the position of the elements.
         */
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}

import java.util.*;

public class Tester {
    public static void main(String[] argargargs) {
        /*
        For more clarity
        ✔ - Correct
        ✘ - Bad
        */ 

        // NoNullArrayList testing
        NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();

        // A. Can add normally?
        Tester.printSection('A');
        try {
            a.add(Integer.valueOf(5));
            System.out.println("✔ Added 5");
        } catch (RuntimeException e) {
            Tester.printBad('A');
        }
        try {
            a.add(0, Integer.valueOf(69));
            System.out.println("✔ Added 69 (nice) to the start");
        } catch (RuntimeException e) {
            Tester.printBad('A');
        }
        try {
            a.set(1, Integer.valueOf(99));
            System.out.println("✔ Set the last value to 99");
        } catch (RuntimeException e) {
            Tester.printBad('A');
        }

        // B. Throws error?
        Tester.printSection('B');
        try {
            a.add(null);
            Tester.printBad('B');
        } catch (IllegalArgumentException e) {
            System.out.println("✔ Task failed successfully");
        } catch (RuntimeException e) {
            Tester.printBad('B');
        }
        try {
            a.add(0, null);
            Tester.printBad('B');
        } catch (IllegalArgumentException e) {
            System.out.println("✔ Task failed successfully");
        } catch (RuntimeException e) {
            Tester.printBad('B');
        }
        try {
            a.set(0, null);
            Tester.printBad('B');
        } catch (IllegalArgumentException e) {
            System.out.println("✔ Task failed successfully");
        } catch (RuntimeException e) {
            Tester.printBad('B');
        }

        // C. initialCapacity constructor
        Tester.printSection('C');
        try {
            NoNullArrayList<String> b = new NoNullArrayList<String>(24);
            System.out.println("✔ initialCapacity constructor works");
        } catch (RuntimeException e) {
            Tester.printBad('C');
        }

        // OrderedArrayList testing

        // D. Adding random items sorts correctly?
        Tester.printSection('D');
        Tester.randSortTest(8, 69);
        Tester.randSortTest(12, 4); // Close values
        Tester.randSortTest(10, 20);

        // E. adding null
        OrderedArrayList<Integer> b = new OrderedArrayList<Integer>();
        Tester.printSection('E');
        try {
            b.add(null);
            Tester.printBad('E');
        } catch (IllegalArgumentException e) {
            System.out.println("✔ Task failed successfully");
        } catch (RuntimeException e) {
            Tester.printBad('E');
        }
        try {
            b.add(0, null);
            Tester.printBad('E');
        } catch (IllegalArgumentException e) {
            System.out.println("✔ Task failed successfully");
        } catch (RuntimeException e) {
            Tester.printBad('E');
        }
        try {
            b.set(0, null);
            Tester.printBad('E');
        } catch (IllegalArgumentException e) {
            System.out.println("✔ Task failed successfully");
        } catch (RuntimeException e) {
            Tester.printBad('E');
        }
    }

    public static void printBad(char section) {
        System.out.println("✘ Whoops! Something went wrong in section " + section);
    }

    public static void printSection(char section) {
        System.out.println("\nSection " + section + ":");
    }

    public static void randSortTest(int times, int bounds) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        OrderedArrayList<Integer> b = new OrderedArrayList<Integer>(); // add(element)
        OrderedArrayList<Integer> c = new OrderedArrayList<Integer>(); // add(index, element)
        Random rand = new Random();
        for (int i = 0; i < times; i++) {
            Integer x = Integer.valueOf(rand.nextInt(bounds));
            a.add(x);
            b.add(x);
            c.add(rand.nextInt(i + 1), x);
        }
        Collections.sort(a);
        System.out.println("  " + a + " - ArrayList (sorted)");
        System.out.println("  " + b + " - OrderedArrayList add(element)");
        System.out.println("  " + c + " - OrderedArrayList add(index, element)");
        if (a.equals(b) && b.equals(c)) {
            System.out.println("✔ Lists are equal");
        } else {
            Tester.printBad('D');
        }
    }
}
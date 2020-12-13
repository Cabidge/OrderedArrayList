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
    }

    public static void printBad(char section) {
        System.out.println("✘ Whoops! Something went wrong in section " + section);
    }

    public static void printSection(char section) {
        System.out.println("\nSection " + section + ":");
    }
}
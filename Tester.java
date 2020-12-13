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
        try {
            a.add(Integer.valueOf(5));
            System.out.println("✔ Added 5");
        } catch (Exception e) {
            Tester.printBad('A');
        }
        try {
            a.add(0, Integer.valueOf(69));
            System.out.println("✔ Added 69 (nice) to the start");
        } catch (Exception e) {
            Tester.printBad('A');
        }

        // B. Throws error?
        try {
            a.add(null);
            Tester.printBad('B');
        } catch (Exception e) {
            System.out.println("✔ Threw error correctly");
        }
        try {
            a.add(0, null);
            Tester.printBad('A');
        } catch (Exception e) {
            System.out.println("✔ Threw error correctly");
        }
    }

    public static void printBad(char section) {
        System.out.println("✘ Whoops! Something went wrong in section " + section);
    }
}
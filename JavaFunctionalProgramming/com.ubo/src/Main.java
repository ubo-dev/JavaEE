import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        //printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        //printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        //printOddNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        //printCoursesContains(List.of("math","algorithm","programming","chemistry","history","biology"),"m");
        //printSquareOfNumbers(List.of(12,9,13,4,6,2,4,12,15));
        //printCubesOfNumbers(List.of(12,9,13,4,6,2,4,12,15));
        //printLengthsOfCourses(List.of("math","algorithm","programming","chemistry","history","biology"));

        List<String> fruits = List.of("apple","banana","watermelon","orange","cherry","strawberry");

        Predicate<? super String> predicate = fruit -> fruit.contains("q");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        // System.out.println(optional.get());
        // get() will give us a compile error if value is not present
        // we should use orElse function because it will give the object if its found or will print "Nothing found." otherwise.
        System.out.println(optional.orElse("Nothing found."));

    }

    private static void printCoursesContains(List<String> courses,String letter) {
        courses.stream()
                .filter(course -> course.contains(letter))
                .forEach(System.out::println);
    }

/*    private static void print(int number){
        System.out.println(number);
    }*/
/*    private static boolean isEven(int number){
        return number%2 == 0;
    }*/

    // we should use lambda expressions instead of creating each function
    private static void printAllNumbersInListFunctional(List<Integer> integers)
    {
        integers.stream()
                .forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> integers)
    {
        integers.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> integers)
    {
        integers.stream()
                .filter(integer -> integer % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printSquareOfNumbers(List<Integer> numbers) {
        numbers.stream()
                .map(number -> Math.pow(number,2))
                .forEach(System.out::println);
    }

    private static void printCubesOfNumbers(List<Integer> numbers) {
        numbers.stream()
                .map(number -> Math.pow(number,3))
                .forEach(System.out::println);
    }

    private static void printLengthsOfCourses(List<String> courses)
    {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

/*    private static void printAllNumbersInListStructured(List<Integer> integers)
    {
        for (int i : integers) System.out.println(i);
    }*/
}
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Ayman");
        names.add("Abdelfatah");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(50);
        numbers.add(90);
        System.out.println("names: old way");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-------------------------------");
        System.out.println("numbers: old way");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("--------------------");
        System.out.println("New way");
        System.out.println("names:");
        names.forEach(name -> System.out.println(name));
        System.out.println("--------------------");
        System.out.println("numbers:");
        numbers.forEach(number -> System.out.println(number));
        System.out.println("--------------------");
        System.out.println("print Multiple Statements");
        System.out.println("try on names");
        names.forEach(name -> {
            System.out.print("we have : ");
            System.out.println(name);
        });
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Phonebook phonebook1 = new Phonebook();
        phonebook1.add("John", "555-555-5555");
        phonebook1.add("Mary", "666-666-6666");
        phonebook1.add("Paul", "777-777-7777");
        ArrayList<String> joesNumbers = new ArrayList<>(Arrays.asList("123-123-1234", "321-321-3210"));
        phonebook1.addAll("Joe", joesNumbers);
        phonebook1.remove("Mary");
        System.out.println(phonebook1.lookup("Paul"));
        System.out.println(phonebook1.reverseLookUp("123-123-1234"));
        System.out.println(phonebook1.hasEntry("Paul"));
        System.out.println(phonebook1.getAllContactNames());
    }
}

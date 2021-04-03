import java.util.*;

public class Phonebook {

    private final LinkedHashMap<String, List<String>> phonebook;

    public Phonebook() {
        phonebook = new LinkedHashMap<String, List<String>>();
    }

    public Phonebook(LinkedHashMap<String, List<String>> map) {
        this.phonebook = map;
    }

    public Map<String, List<String>> getPhonebook() {
        return phonebook;
    }

    public void add(String name, String phoneNumber) {
        this.phonebook.put(name, new ArrayList<>(Arrays.asList(phoneNumber)));
    }

    public void addAll(String name, String... phoneNumbers) {
        this.phonebook.put(name, new ArrayList(Arrays.asList(phoneNumbers)));
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return this.phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

    public String reverseLookUp(String phoneNumber) {
        String nameToLookFor = "";
        for (String name : this.phonebook.keySet()) {
            for (int i = 0; i < this.phonebook.get(name).size(); i++) {
                if (this.phonebook.get(name).get(i) == phoneNumber) {
                    nameToLookFor = name;
                    return nameToLookFor;
                }
            }
        }
        return null;
    }

        public LinkedList<String> getAllContactNames () {
            LinkedList<String> allContacts = new LinkedList<>();
            for (String s : this.phonebook.keySet()) {
                allContacts.add(s);
            }
            return allContacts;
        }

}

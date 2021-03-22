import java.util.*;

public class Phonebook {

     private Map<String, ArrayList> phonebook;

     public Phonebook(){
        phonebook = new HashMap<String, ArrayList>();
     }

    public Map<String, ArrayList> getPhonebook() {
        return phonebook;
    }

    public void add(String name, String phoneNumber){
        this.phonebook.put(name, new ArrayList<String>(Arrays.asList(phoneNumber)));
    }

    public void addAll(String name, ArrayList<String> phoneNumbers){
         this.phonebook.put(name, phoneNumbers);
    }

    public void remove(String name){
         this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name){
         return this.phonebook.containsKey(name);
    }

    public List<String> lookup(String name){
         return this.phonebook.get(name);
    }

    public String reverseLookUp(String phoneNumber) {
         String nameToLookFor = "";
        for (String name : this.phonebook.keySet()) {
            for (int i = 0; i < this.phonebook.get(name).size(); i++) {
                if (this.phonebook.get(name).get(i) == phoneNumber) {
                    nameToLookFor = name;
                    return nameToLookFor;
                } else {
                    nameToLookFor = "Number not found in phonebook";
                }
            }
        }
        return nameToLookFor;
    }


    public String getAllContactNames(){
         String contactNames = "";
         for(String name : this.phonebook.keySet()){
             contactNames = contactNames + name + ", ";
         }
         return contactNames.substring(0, contactNames.length()-2);
    }
}

import java.lang.reflect.Array;
import java.util.*;

public class PhoneBook {
    //name: phoneNumber1,phoneNumber1
    //name: phoneNumber
    //String,ArrayList of String, Map of some king
    //Map to hold name and phoneNumbers
    //key is string amd values is arrayList of strings

    private Map<String,List<String>> phoneRecord;

    public PhoneBook(){
        this(new HashMap<>());

    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {
        this.phoneRecord = phoneRecord;
    }
    public void add(String name,String phoneNumber){
        List<String>numbers=new ArrayList<>();
        numbers.add(phoneNumber);

        phoneRecord.put(name,numbers);
    }
    public void addAll(String name,String...phoneNumbers){
        //put the record in the map by key and values
        phoneRecord.put(name, Arrays.asList(phoneNumbers));
    }
    public void remove(String name){
        //remove from the map
        phoneRecord.remove(name);
    }
    public boolean hasEntry(String name){
        //check if name exist in record and return true
        return phoneRecord.containsKey(name);
    }public List<String> lookup(String name){
        //return a list of phone numbers that belong to the name
        return  phoneRecord.get(name);
    }public String reverseLookup(String phoneNumber) {
        //takes a phone number and returns the name attached to the number
        for (Map.Entry<String, List<String>> entry : phoneRecord.entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            if (numbers.contains(phoneNumber)) {
                 // Return the name associated with the phone number
                return name;
            }
        }return null;
    }
    public List<String>getAllContactNames(){
        //need a list or container to store the names
        //need to iterate
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : phoneRecord.entrySet()) {
            String name = entry.getKey();
           names.add(name);
        }return names;

    }

    @Override
    public String toString() {
        return " "+phoneRecord;
    }

    public Map<String, List<String>> getPhoneRecord() {
        return phoneRecord;
    }
}

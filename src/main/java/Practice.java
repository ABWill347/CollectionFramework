import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // Create a TreeSet of these 5 numbers: 2, 12, 10, 4, 18
//        Set<Long> list = new TreeSet<>();
//        list.add(4L);
//        list.add(2L);
//        list.add(12L);
//        list.add(10L);
//        list.add(18L);
//
//        for (long l : list) {
//            System.out.println(l);
//        }
//
//        Iterator<Long>lit=list.iterator();
//        while (lit.hasNext()){
//            System.out.println(lit.next());
//        }

        // Use an iterator to print numbers that are less than 10
//        Iterator<Long> longIterator = list.iterator();
//        while (longIterator.hasNext()) {
//            Long currentNumber = longIterator.next();
//            if (currentNumber > 10) {
//                longIterator.remove();
//            }
//        }
//        System.out.println(list);

        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Tom","212-458-4545");
        phoneBook.add("Jerry","347-542-5548");
        phoneBook.add("Tim","718-524-6654");
        for (Map.Entry<String, List<String>> entry : phoneBook.getPhoneRecord().entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            for (String number : numbers) {
                System.out.println(name + ": " + number);
            }
        }

        System.out.println(phoneBook);
        phoneBook.remove("Tom");
        System.out.println(phoneBook.hasEntry("Luke"));
        System.out.println(phoneBook.lookup("Tim"));
        System.out.println(phoneBook.getAllContactNames());
        System.out.println(phoneBook.reverseLookup("718-524-6654"));
        phoneBook.addAll("Luke","325-525-6654","254-578-5545","547-854-5562");
        System.out.println(phoneBook);
    }
}


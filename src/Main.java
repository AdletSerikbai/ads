public class Main {

    public static void main(String[] args) {
        MyHashTable<String, Integer> phonebook = new MyHashTable<>();

        phonebook.put("Alice", 123456);
        phonebook.put("Bob", 789012);
        phonebook.put("Charlie", 345678);

        System.out.println("Charlie's number: " + phonebook.get("Charlie"));
        System.out.println("Phonebook contains 'Bob': " + phonebook.contains(1));

        phonebook.put("David", 987654);
        System.out.println(phonebook.getKey(345678)); // return Charlie / another key same value





        BST<Integer, String> studentAges = new BST<>();
        studentAges.put(18, "Emily");
        studentAges.put(17, "David");
        studentAges.put(20, "Sarah");

        System.out.println("Number of students: " + studentAges.size());
        System.out.println("Age of student with ID 17: " + studentAges.get(17));
        studentAges.delete(20);  // Remove Sarah

        System.out.println("In-order traversal of BST (optional, depends on BST implementation):");
    }
}
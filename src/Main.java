public class Main {
    public static void main(String[] args) {
        Person person = new Person(
                "Ryuk",     "35",     "male",
                new String[]{"being a hardarse", "agile", "SSD hard drives"}     // note that interests is an array of strings
        );
        String greeting = person.hello();
        System.out.println(greeting);
    }
}
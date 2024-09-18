import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Pair.java
 class Pair {
    private String key;
    private Integer value;

    public Pair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    // Optionally, override equals() and hashCode() if needed
}



public class Stream_Api_Practice {
    public static void main(String[] args) {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair("Alice", 25));
        list.add(new Pair("Bob", 30));
        list.add(new Pair("Charlie", 22));
        list.add(new Pair("David", 12));
        list.add(new Pair("Elisabe", 25));
        list.add(new Pair("Frank", 30));
        list.add(new Pair("George", 25));
        list.add(new Pair("Harry", 25));
        list.add(new Pair("Jack", 25));
        list.add(new Pair("Kate", 25));

             /*********  simple map, filter, collect****/

       List <String> mystring= list.stream().filter(name->name.getKey().contains("H")).map(name->name.getKey()).collect(Collectors.toList());
       mystring.stream().forEach(System.out::println);

            /*********  match terminal operator****/
        boolean isValid = list.stream().anyMatch(element -> element.getKey().contains("h"));
        boolean isValidOne = list.stream().allMatch(element -> element.getKey().contains("h"));
        boolean isValidTwo = list.stream().noneMatch(element -> element.getKey().contains("h"));

         System.out.println(isValid);
         System.out.println(isValidOne);
         System.out.println(isValidTwo);


            /*********  flatened  map, filter, collect****/

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry"),
                Arrays.asList("date", "elderberry", "fig")
        );

        List<String> flattened = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        flattened.stream().forEach(System.out::println);
         // Output: [apple, banana, cherry, date, elderberry, fig]


    }
}

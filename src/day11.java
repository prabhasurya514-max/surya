import java.util.*;

public class day11 {

    public static void main(String[] args) {
                Set<String> Set = new HashSet<>();
        Set.add("student1");
        Set.add("student2");
        Set.add("student1");
        Set.add("student2");
        Set.add("student1");
        Set.add("student2");
        for (String s : Set)
            System.out.println(s);
    }
}
static void main() {

        Map<String, Integer> person = new HashMap<>();
        person.put("Ram", 89);
        person.put("john", 78);
        person.put("Aravindh", 67);
        person.put("ramesh", 90);
        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }





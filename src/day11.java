import java.util.Set;
import java.util.HashSet;
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

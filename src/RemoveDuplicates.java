import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static Set<String> removeDuplicates(List<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        return uniqueSet;
    }

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Lviv");
        cities.add("New York");

        Set<String> uniqueCities = removeDuplicates(cities);
        System.out.println("Unique cities: " + uniqueCities);

        String city = "London";
        char[] charArray = city.toCharArray();
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
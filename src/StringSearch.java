import java.util.List;

public class StringSearch {
    public static boolean findStringInArray(String[] array, String searchString) {
        for (String element : array) {
            if (element.equals(searchString)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findStringInList(List<String> list, String searchString) {
        for (String element : list) {
            if (element.equals(searchString)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] citiesArray = {"London", "Lviv", "New York"};
        List<String> citiesList = List.of("London", "Lviv", "New York");

        String search = "Lviv";

        System.out.println("Searching in array: " + findStringInArray(citiesArray, search));
        System.out.println("Searching in list: " + findStringInList(citiesList, search));
    }
}
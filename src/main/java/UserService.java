import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static List<User> filterUsersByAgeWithFori (List<User> users, int filterParametr) {
        List<User> filterListByAge = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge() < filterParametr) {
                filterListByAge.add(users.get(i));
            }
        }
        return filterListByAge;
    }

    public static List<User> filterUsersByAgeWithForEach (List<User> users, int filterParametr) {
        List<User> filterListByAge = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() < filterParametr) {
                filterListByAge.add(user);
            }
        }
        return filterListByAge;
    }

    public static List<User> filterUsersByAgeWithWhile (List<User> users, int filterParametr) {
        List<User> filterListByAge = new ArrayList<>();
        int i = 0;
        while (i < users.size()) {
            if (users.get(i).getAge() < filterParametr) {
                filterListByAge.add(users.get(i));
            }
            i++;
        }
        return filterListByAge;
    }

    public static List<User> filterUsersByAgeWithStream (List<User> users, int filterParametr) {
        List<User> filterListByAge = users.stream()
                .filter(user -> user.getAge() < filterParametr)
                .toList();
        return filterListByAge;
    }
}

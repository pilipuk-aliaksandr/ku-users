import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    // this method ask for input filter parametr to users by the age
    public static int ageFilterParameter () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, press the number to filter users older than: ");
        return Integer.parseInt(reader.readLine());
    }
    // this method ask for input filter parametr to users by the gender
    public static String genderFilterParameter () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, choose the gender to filter users: ");
        return reader.readLine();
    }
    public static List<User> filterUsersWithFori (List<User> users, int ageFilterParameter, String genderFilterParameter) {
        List<User> filterList = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge() > ageFilterParameter && genderFilterParameter.equals(users.get(i).getGender())) {
                filterList.add(users.get(i));
            }
        }
        return filterList;
    }

    public static List<User> filterUsersWithForEach (List<User> users, int ageFilterParameter, String genderFilterParameter) {
        List<User> filterList = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() > ageFilterParameter && genderFilterParameter.equals(user.getGender())) {
                filterList.add(user);
            }
        }
        return filterList;
    }

    public static List<User> filterUsersWithWhile (List<User> users, int ageFilterParameter, String genderFilterParameter) {
        List<User> filterList = new ArrayList<>();
        int i = 0;
        while (i < users.size()) {
            if (users.get(i).getAge() > ageFilterParameter && genderFilterParameter.equals(users.get(i).getGender())) {
                filterList.add(users.get(i));
            }
            i++;
        }
        return filterList;
    }

    public static List<User> filterUsersWithStream (List<User> users, int ageFilterParameter, String genderFilterParameter) {
        List<User> filterList = users.stream()
                .filter(user -> user.getAge() > ageFilterParameter)
                .filter(user -> genderFilterParameter.equals(user.getGender()))
                .toList();
        return filterList;
    }

    public static Map<String, List<User>> mapUsersByCountry (List<User> users) {
        Map<String, List<User>> resultMap = new HashMap<>();
        for (User user : users) {
            if (resultMap.containsKey(user.getCountry())) {
                List<User> userListByCountry = resultMap.get(user.getCountry());
                userListByCountry.add(user);
                resultMap.put(user.getCountry(), userListByCountry);
            } else {
                List<User> userListByCountry = new ArrayList<>();
                userListByCountry.add(user);
                resultMap.put(user.getCountry(), userListByCountry);
            }
        }
        return resultMap;
    }

    public static Map<String, List<User>> mapUsersByGender (List<User> users) {
        Map<String, List<User>> resultMap = new HashMap<>();
        for (User user : users) {
            if (resultMap.containsKey(user.getGender())) {
                List<User> userListByGender = resultMap.get(user.getGender());
                userListByGender.add(user);
                resultMap.put(user.getGender(), userListByGender);
            } else {
                List<User> userListByGender = new ArrayList<>();
                userListByGender.add(user);
                resultMap.put(user.getGender(), userListByGender);
            }
        }
        return resultMap;
    }
}

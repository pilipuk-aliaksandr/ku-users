import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        UserService userService = new UserService();

        List<User> list = new ArrayList<>();

        User user1 = new User();
        user1.setName("Sasha");
        user1.setSurname("Pilipuk");
        user1.setAge(24);
        user1.setGender("Male");
        user1.setCountry("Belarus");

        User user2 = new User();
        user2.setName("Veronica");
        user2.setSurname("Piun");
        user2.setAge(22);
        user2.setGender("Female");
        user2.setCountry("Belarus");

        User user3 = new User();
        user3.setName("Veniamin");
        user3.setSurname("Plehanovich");
        user3.setAge(80);
        user3.setGender("Male");
        user3.setCountry("Russia");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        int ageFilterParameter = UserService.ageFilterParameter();
        String genderFilterParameter = UserService.genderFilterParameter();

        // The result of the zeroJavaLab Lesson1
        System.out.println("This program works on forEach cycle: " + UserService.filterUsersWithForEach(list, ageFilterParameter, genderFilterParameter));
        System.out.println("This program works on fori cycle: " + UserService.filterUsersWithFori(list, ageFilterParameter, genderFilterParameter));
        System.out.println("This program works on while cycle: " + UserService.filterUsersWithWhile(list, ageFilterParameter, genderFilterParameter));
        System.out.println("This program works on stream: " + UserService.filterUsersWithStream(list, ageFilterParameter, genderFilterParameter));

        // The boarder (enter) between Lesson1 and Lesson2
        System.out.println();

        // The result of the zeroJavaLab Lesson2
        System.out.println(UserService.mapUsersByCountry(list));
        System.out.println(UserService.mapUsersByGender(list));
    }
}
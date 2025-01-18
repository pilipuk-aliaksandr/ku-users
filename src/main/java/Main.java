import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        UserService userService = new UserService();

        List<User> list = new ArrayList<>();

        User user1 = new User();
        user1.setName("Sasha");
        user1.setSurname("Pilipuk");
        user1.setAge(24);
        user1.setGender("Male");

        User user2 = new User();
        user2.setName("Veronica");
        user2.setSurname("Piun");
        user2.setAge(22);
        user2.setGender("Female");

        User user3 = new User();
        user3.setName("Veniamin");
        user3.setSurname("Plehanovich");
        user3.setAge(80);
        user3.setGender("Male");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        int ageFilterParametr = UserService.ageFilterParameter();
        String genderFilterParametr = UserService.genderFilterParameter();

        System.out.println("This program works on forEach cycle: " + UserService.filterUsersWithForEach(list, ageFilterParametr, genderFilterParametr));
        System.out.println("This program works on fori cycle: " + UserService.filterUsersWithFori(list, ageFilterParametr, genderFilterParametr));
        System.out.println("This program works on while cycle: " + UserService.filterUsersWithWhile(list, ageFilterParametr, genderFilterParametr));
        System.out.println("This program works on stream: " + UserService.filterUsersWithStream(list, ageFilterParametr, genderFilterParametr));
    }
}
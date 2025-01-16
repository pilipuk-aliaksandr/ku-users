import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        List<User> list = new ArrayList<>();

        User user1 = new User();
        user1.setName("Sasha");
        user1.setSurname("Pilipuk");
        user1.setAge(24);

        User user2 = new User();
        user2.setName("Veronica");
        user2.setSurname("Piun");
        user2.setAge(22);

        User user3 = new User();
        user3.setName("Veniamin");
        user3.setSurname("Plehanovich");
        user3.setAge(80);

        list.add(user1);
        list.add(user2);
        list.add(user3);

        System.out.println("This program works on forEach cycle: " + UserService.filterUsersByAgeWithForEach(list, 80));
        System.out.println("This program works on fori cycle: " + UserService.filterUsersByAgeWithFori(list, 80));
        System.out.println("This program works on while cycle: " + UserService.filterUsersByAgeWithWhile(list, 80));
        System.out.println("This program works on stream: " + UserService.filterUsersByAgeWithStream(list, 80));
    }
}
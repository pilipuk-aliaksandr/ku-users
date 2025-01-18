import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private int height;
    private int weight;
    private String country;
    private String username;
    private int password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && height == user.height && weight == user.weight && password == user.password && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(gender, user.gender) && Objects.equals(country, user.country) && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender, height, weight, country, username, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", country='" + country + '\'' +
                ", username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}

package chapter9.calculation;

public class StringUsage2 {
    public static void main(String[] args) {
        String userData = "John#25#USA";

        String[] parts = userData.split("#");
        String name = parts[0];
        int age = Integer.parseInt(parts[1]);
        String country = parts[2];

        System.out.println("이름: " + name + ", 나이: " + age + ", 국가: " + country);


        User user = new User("John", 25, "USA");
        System.out.println(user);
    }

}

class User {
    private String name;
    private int age;
    private String country;

    public User(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age + ", 국가: " + country;
    }
}


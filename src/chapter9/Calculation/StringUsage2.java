package chapter9.Calculation;

public class StringUsage2 {
    public static void main(String[] args) {
        String userData = "John#25#USA"; // ❌ 문자열을 사용해 여러 데이터를 저장

        String[] parts = userData.split("#"); // 데이터를 나눠야 함
        String name = parts[0];
        int age = Integer.parseInt(parts[1]); // 변환 과정 필요
        String country = parts[2];

        System.out.println("이름: " + name + ", 나이: " + age + ", 국가: " + country);


        User user = new User("John", 25, "USA"); // ✅ 객체로 표현
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


package advance.dev;

public class Student {
	private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private double averageScore;

    public Student(String name, int age, String address, String phoneNumber, double averageScore) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getAverageScore() {
        return averageScore;
    }
}



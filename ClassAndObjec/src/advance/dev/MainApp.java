package advance.dev;
import java.util.Scanner;

public class MainApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = input();
        print(students);
    }

    public static Student[] input() {
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = scanner.nextLine();
            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String address = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Điểm trung bình: ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine();

            Student student = new Student(name, age, address, phoneNumber, averageScore);
            students[i] = student;
        }

        return students;
    }

    public static void print(Student[] students) {
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getName() + ", " + students[i].getAge() + " tuổi, "
                    + students[i].getAddress() + ", SĐT: " + students[i].getPhoneNumber() + ", Điểm TB: "
                    + students[i].getAverageScore());
        }
    }
}
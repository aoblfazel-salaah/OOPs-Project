package task2;

public class Tester {
    public static void main(String[] args) {
        Marks []students= {new StudentA(89, 90, 76),
                            new StudentB(90,66,87,90)};
        for (Marks student:students) {
            System.out.println(student.getPercentage() + " %");
        }
    }
}

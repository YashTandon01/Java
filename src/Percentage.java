import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Here We Should Use % Subjects
        // Must Enter Marks into The 100 Don't (100<) Do It

        System.out.println("The Calculator OF CBSC Exam Marks Percentage");

        System.out.println("Enter Your First Subject Marks");
        int sub1 = inp.nextInt();

        System.out.println("Enter Your Second Subject Marks");
        int sub2 = inp.nextInt();

        System.out.println("Enter Your Third Subject Marks");
        int sub3 = inp.nextInt();

        System.out.println("Enter Your Fourth Subject Marks");
        int sub4 = inp.nextInt();

        System.out.println("Enter Your Fifth Subject Marks");
        int sub5 = inp.nextInt();

        int sum = (sub1 + sub2 + sub3 + sub4 + sub5);
        float div = sum / 500f;
        float Percentage = div * 100;

        System.out.println("The Total Percentage Of Your CBSC Exam");
        System.out.println(Percentage + "%");
    }
}
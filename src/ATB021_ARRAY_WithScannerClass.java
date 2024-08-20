import java.util.Scanner;

public class ATB021_ARRAY_WithScannerClass {
    public static void main(String[] args) {

        int marks[] = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks");
        marks[0] = sc.nextInt();
        marks[1] = 76;
        marks[2] = 89;
        System.out.println(marks[1]);
        System.out.println(marks[2]);


    }


}

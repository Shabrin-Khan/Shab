import java.util.Scanner;

public class ATB06_if_elseif_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of first side");
        int a = sc.nextInt();

        System.out.println("Enter length of second side");
        int b = sc.nextInt();

        System.out.println("Enter length of third side");
        int c = sc.nextInt();

        if (a==b && b==c) {
            System.out.println("Equilateral Trianglr");
        }else if (a==b || b==c || c==a){
            System.out.println("Isoselece Triangle");
        }else {
            System.out.println("Scalene Triangle");
        }

        sc.close();

    }

}

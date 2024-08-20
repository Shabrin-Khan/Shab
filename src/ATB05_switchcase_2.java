import java.util.Scanner;

public class ATB05_switchcase_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Classify the Triangle");
        String Triangle = sc.next();

        switch(Triangle){

            case "equilateral":
                System.out.println("All Sides are Equal");
                break;

            case "scalene":
                System.out.println("No Sides are Equal");
                break;

            case "isosceles":
                System.out.println("Two Sides are Equal");
                break;

        }



    }
}

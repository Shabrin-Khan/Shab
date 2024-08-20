import java.util.Scanner;

public class ATB03_ifelseif {
    public static void main(String[] args) {

        //A-90-100
        //B - 80-89
        //C-70-79
        //D - 60-69
        //F - 0-59

        Scanner sc = new Scanner(System.in);//FUNCTION
        System.out.println("Enter the Score");//PRINT COMMAND
        int score = sc.nextInt();//CLASS TO MAKE THE INPUT AS VALUE(SCORE)

        //CONDITION STARTS..
        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade B");
        } else if (score >= 70 && score <= 79){
            System.out.println("Grade C");
        } else {
            System.out.println("FAIL");
        }
        sc.close();//TO CLOSE THE SCANNER CLASS
    }
}

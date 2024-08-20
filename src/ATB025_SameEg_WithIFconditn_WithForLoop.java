import java.util.Scanner;

public class ATB025_SameEg_WithIFconditn_WithForLoop {
    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);
        //float marks[] = new float[3];
        //System.out.println("Enter the Marks of Sub 1");
        //marks[0] = sc.nextFloat();

        //System.out.println("Enter the Marks of Sub 2");
        //marks[1] = sc.nextFloat();

        //System.out.println("Enter the Marks of Sub 3");
       // marks[2] = sc.nextFloat();

        //float avg = marks[0]+marks[1]+marks[2]/3;
       //System.out.println("avg marks is->"+avg);

        //-------OR------ (FOR LOOP)

    Scanner sc = new Scanner (System.in);
    float marks [] = new float[3];

        for (int i = 0; i < marks.length ; i++) {
            System.out.println("Enter the marks of Sub " + (i+1));
            marks[0] = sc.nextFloat();

        }
        float avg = marks[0]+marks[1]+marks[2]/3;
        System.out.println("avg marks is->"+avg);

    sc.close();

    }
}

import java.util.Arrays;

public class ATB026_ARRAY_SalaryExample_UsingForLoopAndIFcondition {
    public static void main(String[] args) {

        int salaries[] = {10, 8, 3, 4, 7, 12};

        //GET MIN & MAX SALARIES USING INBUILT FUNCTION
        //System.out.println("minimum salaries->"+Arrays.stream(salaries).min().getAsInt());
        //System.out.println("maximum salaries->"+Arrays.stream(salaries).max().getAsInt());
//----------------------------------------------------
        //GET MIN AND MAX SALARIES USING LOGIC
        int min = salaries[0];   //{10, 8, 3, 4, 7, 12};
        int max = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (min > salaries[i])
                min = salaries[i];

            if (max < salaries[i]);
            max = salaries[i];



        }
        //System.out.println("min salary is->" + min);
      // System.out.println("max salary is->"+max);
        //SORTING
        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);


    }
}







    





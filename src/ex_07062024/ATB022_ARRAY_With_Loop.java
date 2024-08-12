public class ATB022_ARRAY_With_Loop {

    public static void main(String[] args) {

        int marks[] = new int[3];  //length is 3
        for (int i = 0; i < marks.length; i++) {
            //System.out.println(i + "->" + marks[i]);
            marks[0] = 78;
            marks[1] = 85;
            marks[2] = 79;

         int[] numbers = {10,20,30,40,50};
         //index - 0,1,2,3,4
            //0-10 = 10*2 = 20
            //1-20 = 20*2 = 40 etc till 4-50 = 50*2 = 100

            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[j]*2);

            }


        }
        }
    }


public class ATB09_ForLoop_ifcondition_OddEvenexample {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if(i % 2 == 0){ //condition (remainder of 0,2,4,6,8,10..50 is '0'..hence condition meet.)
                // (remainder of 1,3,5...49 is '1'.hence condition does not meet, so it will go to other print command
                // and print the number.
                System.out.println("Even->"+i);//if above condition meet,it will print even,
                                             // but if condition does not meet it will print Odd
                continue;//continue means skipping....if condition meet it will not print other print commando
            }
            System.out.println("Odd->"+i);


        }

    }

}

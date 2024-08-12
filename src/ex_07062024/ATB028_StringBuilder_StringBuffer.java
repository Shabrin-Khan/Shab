public class ATB028_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        //STRINGBUILDER & STRINGBUFFER ARE MUTABLE IN NATURE. iT MEANS NO NEW STRING IS CREATED.
        //FEATURES -1.Thread Safety, 2. Performance
        //KEY DIFFERENCE-
        //StringBuilder              StringBuffer
        //1.not synchronized           1. Synchronized
        //2.Faster                     2. Slower due to synchronization

        String s1 = "shab";
        s1 = "khan"; //changes the value of s1 to "khan"...in this case new string will be created.

        //but in  String Builder and String Buffer, if we change the value then new strings are created
        // but old string will get deleted by garbage collecter.

        StringBuilder strngbuilder = new StringBuilder("Shabrin");
        //stringBuilder.append("khan");
        System.out.println("strngbuilder");

        //StringBuffer sb = new StringBuffer("shabrin");
        //StringBuffer.append("khan");
       // System.out.println(sb);

        //TO REVERSE THE OUTPUT
        // StringBuilder sb1 = new StringBuilder("Shabrin");
        //System.out.println(sb1.reverse().toString());


    }

}

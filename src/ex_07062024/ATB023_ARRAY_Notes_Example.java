public class ATB023_ARRAY_Notes_Example {

    public static void main(String[] args) {

        final int ages[] = new int[4]; //here 'final' is 'length'
        ages[3] = 78;
        System.out.println(ages[3]);

        // DISADVANTAGES OF ARRAY
        //1. Fixed DataType (homogenius datatype)
        //2. Fixed Length
        //3. Wastage of memory

        //MAXIMUM SIZE OF ARRAY - Depends on the DataType

        //EXAMPLES OF DIFF DATA TYPES:
        int int_array[] = {34,35,36};
        System.out.println(int_array.length);
        long l_array[] = {34l,35l,37l};
        float f_array[] = {45.56f,56.43f,34.62f};
        double d_array[] = {34.5,56.4,23.62};
        boolean b_array[] = {true,false,true,false};
        char c_array [] = {'a','b','c'};
        String s_array[] ={"shab","ayaan"};
        String[] s_array1 = {"shab","ayaan"};
    }

}

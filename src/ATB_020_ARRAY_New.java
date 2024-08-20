public class ATB_020_ARRAY_New {
    public static void main(String[] args) {

        int marks[] = new int[3];
        //index - 0,1,2
        //length - 3
        //below if we print, output will be 0 as no value is assigned.
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //assigning value to all int (0,1,2)
        marks[0] = 91;
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[1]);

    }
}

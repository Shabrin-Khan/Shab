public class ATB028_1_CONSTRUCTER_ConnectingClass {
    public static void main(String[] args) {

        ATB028_OopsConcept_CONSTRUCTER P0 = new ATB028_OopsConcept_CONSTRUCTER();
        ATB028_OopsConcept_CONSTRUCTER P1 = new ATB028_OopsConcept_CONSTRUCTER("shabreen");
        ATB028_OopsConcept_CONSTRUCTER P2 = new ATB028_OopsConcept_CONSTRUCTER( "khan");
        ATB028_OopsConcept_CONSTRUCTER P3 = new ATB028_OopsConcept_CONSTRUCTER("Ayaan", 7656678553 );
        //P1.name = "shab"; - FIRST WAY OF GETTING OUTPUT - BY Adding value direct in main function
        //SECOND WAY OF GETTING OUTPUT - BY ADDING CONSTUCTER IN BLUEPRINT CLASS.
        //1. System.out.println(P1.name); - First it will check, its for P1 Variable so for name it will go back in
        // blueprint class and check the value of "name", there it check there is an "constructer" saying
        // "this.name = namegiven; so again it will come in main function calss and see the value of "namegiven" and then
        //it finally print the "output". Using same way it print the output of other variable also with single constructer.


        System.out.println(P1.name);//UNTILL WE ASSIGN SOME VALUE IN BLUEPRINT, IT WILL SHOW AS 'NULL' IN OUTPUT.
        System.out.println(P2.name);
        System.out.println(P1.phoneno);


    }
}

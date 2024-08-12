
public class ATB028_OopsConcept_CONSTRUCTER {

    String name;
    long phoneno;
//MAIN FUNCTION WILL NOT BE CREATED IN BLUEPRINT



    ATB028_OopsConcept_CONSTRUCTER() {    //DEFAULT CONSTRUCTER
       System.out.println("Object is created");
    }

    ATB028_OopsConcept_CONSTRUCTER(String namegiven) { //PARAMETRIZED CONSTRUCTER
        this.name = namegiven;
    }

    ATB028_OopsConcept_CONSTRUCTER(String namegiven, long PhoneNumber) {
        this.name = namegiven;
        this.phoneno = PhoneNumber;
    }
}

package chapter9.Exercise1.ex09_1_exercise;


public class Customer {
    public String name;
    public String ssn;
   
    // Encapsulate this class.  Make ssn read only.

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public String getSSN(){
        return ssn;
    }
}

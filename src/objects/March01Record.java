package objects;

public class March01Record {
    /*
    POJOs = Plain Old Java Objects

    RECORDS ARE IMMUTABLE (all fields are FINAL)
     */

    public static void main(String[] args) {
        Account myaccount = new Account(12, 01, "CHECKING", 12.32);
        Person berenice = new Person("Berenice", "Sanchez", 18, "Blue");
        System.out.println(berenice.age());//getter for AGE
        berenice.nameMethod();
    }

    /*
    A RECORD is a special type of Java class. It's
    great for simple objects that will only need
    fields and methods to access those fields (the getters -no setters-
    are CREATED UNDER THE HOOD. IT'S NOT NECESSARY TO CREATE THEM).
     */
    /*
    However, if you want to add additional methods,
    you can do so within the curly braces.
     */
    public record Account(
            int id,
            int customerId,
            String type,
            double balance
    ){}

    public record Person(
            String name,
            String lastname,
            int age,
            String favColor
    ){
        public void nameMethod(){
            System.out.println("Hi my name is " + this.name);
        }
    }

}//class March01Record

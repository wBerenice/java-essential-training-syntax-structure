package arrays;

public class PracticeVarArgs {

    public static void main(String[] args) {
        vargArgsMethod("Noveno", new int[] {1, 2, 5, 6, 23, 34, 43, 34});

    }

    public static void vargArgsMethod(String grade, int ...numberOfStudents){

        for(int i =0; i < numberOfStudents.length; i++){
            System.out.println("Student #" + i+1 + " " + grade + " grado");
            System.out.println(numberOfStudents[i]);
        }
    }//method varArgs

}//class PracticeVarArgs

package arrays;

public class March01Arrays {

    public static void main(String[] args){
        String[] nombres = new String[10];
        String[] postres = {"Pastel", "cupcake", "tarta"};
        nombres[0] = "Berenice";
        System.out.println(nombres[0]);
        System.out.println(postres[0]);

        for(String n : postres){
            System.out.println(n);
        }
        System.out.println("======");
        String products = "Refresco, papas, computadora, papel, agua, lapicera";

        String[] arrProducts = products.split(", ");

        for(String m : arrProducts){
            System.out.println(m);
        }
        System.out.println(arrProducts.length);


        String[] players = {"Bob", "Luke", "Chad", "Dan", "Henry", "Joe"};
        boolean chadFound = false;

        for(int i = 0; i < players.length; i++){
            if(players[i].equals("Chad")){
                chadFound = true;
            }
        }
        System.out.println(chadFound);

    }//main


}//class March01Arrays

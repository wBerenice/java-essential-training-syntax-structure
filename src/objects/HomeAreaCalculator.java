package objects;

public class HomeAreaCalculator {

    public static void main(String[] args){

        Feb22DefiningObjects roomEmpty= new Feb22DefiningObjects();
        Feb22DefiningObjects roomObject = new Feb22DefiningObjects(23, 34);

        System.out.println(roomEmpty.getLength());
        System.out.println(roomObject);

        roomEmpty.setLength(49);
        roomEmpty.setWidth(23);

        double areaOfRoomEmpty = roomEmpty.calculateArea();
        System.out.println(roomEmpty.getLength());
        System.out.println(areaOfRoomEmpty);
        System.out.println(roomObject.calculateArea());

    }//main


}//class HomeAreaCalculator

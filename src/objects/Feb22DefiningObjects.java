package objects;
/*
OBJECTS
An object stores its state in fields (variables)
and its behavior in methods
 */

/*
ACCESS MODIFIER:
        PROTECTED
    It means that only other classes
    within in the same package can access it.
    It's similar to having no access modifier at all
 */

public class Feb22DefiningObjects {

    private double length;
    private double width;

    public Feb22DefiningObjects(){
        this.length = 0;
        this.width = 0;
    }//constructor

    public Feb22DefiningObjects(double newWidth, double newLength){
        this.length = newLength;
        this.width = newWidth;
    }//2nd constructor with parameters

    public Feb22DefiningObjects(double length, double width, int date){
        setLength(length);
        setWidth(width);
    }//3rd constructor with parameters


    public double calculateParameter(){
        return (2*length) + (2*width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

}//class Feb22DefiningObjects

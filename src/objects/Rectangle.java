package objects;

public class Rectangle {

    private double width;
    private double length;

    //Getters & Setters

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }


    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }//constructor

    public Rectangle(double newWidth, double newLength){
        this.width = newWidth;
        this.length = newLength;
    }//2nd constructor

    public Rectangle(double width, double length, int Date){
        setWidth(width);
        setLength(length);
    }//3rd constructor

    //METHODS

    public double calculatePerimeter(){
        return (this.width * 2) + (this.length * 2);
    }

    public double calculateArea(){
        return length * width;
    }


}//class Rectangle

package JavaAssignmentOne;

public class Rectangle {
    float length;
    float width;

    public Rectangle(float width, float length){
        this.width=width;
        this.length=length;
    }

    public float calculateArea(){
        float areaOfRectangle = width * length;
        return areaOfRectangle;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 11);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

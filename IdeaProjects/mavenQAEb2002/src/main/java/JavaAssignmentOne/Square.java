package JavaAssignmentOne;

public class Square {
    float length;
    float width;

    public Square(float width, float length){
        this.width = width;
        this.length =length;
    }
    public float calculatePerimeter(){
        float area = width*length;
        return  area;
    }

    public static void main(String[] args) {
        Square square = new Square(10, 10);
        System.out.println(" Area of Square: "+ square.calculatePerimeter());
    }
}

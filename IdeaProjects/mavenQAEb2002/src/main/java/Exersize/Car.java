package Exersize;

public class Car {
    private String name;
    private String model;
    private String color;
    private int year;

    public void setName(String name){
     this.name = name;
    }
    public String getName(){
    return name;
    }
    public void setModel(String model){
     this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color){
      this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int year){
        if (year >= 1900 && year <=2030){
            this.year=year;
        }else
        {
            System.out.println("invalid year");
        }
    }
    public int getYear(){
        return year;
    }
   public void moveForward(){
       System.out.println("Move forword");
   }
   public void moveBackward(){
       System.out.println("Move backwards");
   }
   public void stop(){
       System.out.println("stop");
   }
   public void turnLeft(){
       System.out.println("Turn left");
   }
   public void turnRight(){
       System.out.println("Turn right");
   }
   public void honk(){
       System.out.println("honk");
   }

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Lincoln");
        car.setModel("Aviator");
        car.setColor("Black");
        car.setYear(2023);
        System.out.println("Fatema's Car Name: " + car.getName()
        + ", Model: "+ car.getModel() + ", color: " + car.getColor()+
                ", year: "+ car.getYear());


    }


}

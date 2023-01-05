package JavaAssignmentOne;

public class Math {
    public int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    public int multiplication(int a, int b){
        int c = a*b;
        return c;
    }
   public int subtraction(int a, int b){
        int c = a-b;
    return c;
   }
    public int divition(int a, int b){
        int c = a/b;
        return c;
    }
    public static void main(String[] args) {
    Math math= new Math();
    //math.sum(10,20);
        int i =2;
        int j=3;

        System.out.println("sum of "+ i +" and " + j+ " = " + math.sum(i,j));
        System.out.println("product of "+ i +" and " + j+ " = "  + math.multiplication(i,j));
        System.out.println("Diffrence of " + i +" and " + j+ " = " + math.subtraction(i,j));
        System.out.println("divition of " + i+ " "+j+" = " + math.divition(i,j));

    }


}

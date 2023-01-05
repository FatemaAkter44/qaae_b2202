package conditionalStatments;

public class PlayinWithNumbersUsingForLoop {
    public static void main(String[] args) {
    //print1To10();
        //print10To1();
       // findIfGivenNumberEven(5);
        findIfGivenNumberOdd(10);
    }
    public static void print1To10(){
        for (int i = 0; i < 11; i++) {
            System.out.print(i +" ");
        }
    }
    public static void print10To1(){
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
        }
    }
    public static void findIfGivenNumberEven(int n){
        if (n%2 == 0){
            System.out.println(n);
        }else {
            System.out.println("n is not even");
        }
    }
    public static void findIfGivenNumberOdd(int n){
        if (n%2 == 1){
            System.out.println(n);
        }else {
            System.out.println("n is not odd");
        }
    }
}

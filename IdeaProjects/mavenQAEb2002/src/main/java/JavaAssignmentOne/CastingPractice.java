package JavaAssignmentOne;

public class CastingPractice {

    public static String intToString(){
        int a = 10;
        String b =Integer.toString(a);
        //System.out.println(b);
        return b;
        
    }
    public static int stringToInt(){
        //String x = "fatema";
        String x = "12345";

        int y = Integer.parseInt(x);
        //System.out.println(y);
        return y ;

    }
    public static int doubleToInt(){
        double x = 10;
        int y = (int) x;
        //System.out.println(b);
        return y;

    }
    public static double intToDouble(){
        int x = 10;
        double y =x;
        //System.out.println(b);
        return y;

    }


    public static void main(String[] args) {
    //intToDouble();
        //System.out.println(intToDouble());
        //System.out.println("integer to Double: " + intToDouble());
        System.out.println(stringToInt());
    }
}

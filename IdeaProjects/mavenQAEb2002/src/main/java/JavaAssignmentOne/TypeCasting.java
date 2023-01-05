package JavaAssignmentOne;

public class TypeCasting {
    public static double intToDouble(int integerNumber){
        double intToDoubleNumber = integerNumber;
        return intToDoubleNumber;
    }
    public static int doubleToInt(double doubleNumber){
        int doubleToIntNumber = (int) doubleNumber;
        return doubleToIntNumber;
    }
    public static String intToString(int intNumber){
        String intToStringNumber = String.valueOf(intNumber);
        return intToStringNumber;
    }
    public static int stringToInt(String stringValue){
        int stringToIntNumber = Integer.parseInt(stringValue);
        return stringToIntNumber;
    }
    public static double floatToDouble(float floatNumber){
        double doubleNumber= floatNumber;
        return doubleNumber;
    }
    public static float byteToFloat(byte byteNumber){
        float floatNumber = byteNumber;
        return floatNumber;
    }
    public static void main(String[] args) {
        System.out.println("Integer to Double: "  + intToDouble(10));
        System.out.println("Double To Int: "+doubleToInt(10.99));
        System.out.println("Int To String: "+ intToString(15));
        System.out.println("string To Int: "+stringToInt("1234"));
        System.out.println("float To Double: "+floatToDouble(15.45678f));
        System.out.println("byteToFloat: "+byteToFloat((byte) 10101010));
    }
}

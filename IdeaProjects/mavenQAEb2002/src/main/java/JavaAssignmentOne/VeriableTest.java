package JavaAssignmentOne;

public class VeriableTest {
    int a =   10;
    static int d = 4;
    public void testInstanceVeriable(){
        int f = a+10;
        System.out.println(f);
    }
    public static void main(String[] args){
        VeriableTest objVeriableTest = new VeriableTest();
        int b= 5;
        int c= objVeriableTest.a+b;
        int e = d+b;
        System.out.println("value of c: " + c );
        objVeriableTest.testInstanceVeriable();

    }
}

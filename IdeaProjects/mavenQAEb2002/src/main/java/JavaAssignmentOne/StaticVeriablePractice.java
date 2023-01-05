package JavaAssignmentOne;

public class StaticVeriablePractice {
    static int b = 10;

    public static void main(String[] args){
        StaticVeriablePractice staticVeriablePractice1 = new StaticVeriablePractice();
        StaticVeriablePractice staticVeriablePractice2 = new StaticVeriablePractice();

        System.out.println(staticVeriablePractice1.b);
        System.out.println(staticVeriablePractice2.b);

        staticVeriablePractice1.b = 15;

        System.out.println(staticVeriablePractice1.b);
        System.out.println(staticVeriablePractice2.b);


        int c = 11;
        System.out.println(b+c);
    }
}

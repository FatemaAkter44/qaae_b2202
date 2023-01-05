package JavaAssignmentOne;

public class InstanceVeriablePractice {
    int a=10;
    public static void main(String[] args){
        InstanceVeriablePractice instanceVeriablePractice1 = new InstanceVeriablePractice();
        InstanceVeriablePractice instanceVeriablePractice2 = new InstanceVeriablePractice();

        System.out.println(instanceVeriablePractice1.a);
        System.out.println(instanceVeriablePractice2.a);

        instanceVeriablePractice1.a = 11;

        System.out.println(instanceVeriablePractice1.a);
        System.out.println(instanceVeriablePractice2.a);
    }
}

package JavaAssignmentOne;

public class Empoloyee {
    String firstName;
    float salary;
    long phoneNumber;
    String lastName;

    public Empoloyee(String firstName, float salary, long phoneNumber, String lastName){
        this.firstName =firstName;
        this.salary=salary;
        this.phoneNumber=phoneNumber;
        this.lastName = lastName;
    }

    public String printInfo(){

        return "First name = " + firstName + "\n" + "Salary = "+ salary +"\n" +"Phone number = "+ phoneNumber+ "\n"
                + "Last name = " +lastName;
    }

    public String calculateBonus(){
        double salaryWithBonus = salary * 1.5;
        String salaryWithBonusSteing= Double.toString(salaryWithBonus);
       return salaryWithBonusSteing;
    }

    public static void main(String[] args) {
        Empoloyee empoloyee = new Empoloyee("Fahim", 10000f, 0131234476L, "Zaman");
        System.out.println(empoloyee.printInfo());
        System.out.println("Monthly salery with 5% bonus = " + empoloyee.calculateBonus());

    }
}

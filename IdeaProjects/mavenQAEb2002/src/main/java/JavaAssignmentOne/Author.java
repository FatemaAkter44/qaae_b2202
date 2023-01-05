package JavaAssignmentOne;

public class Author {
    String firstName;
    String lastName;
    public  Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName =lastName;
    }
    public  String printinfo(){
        //System.out.println(firstName + " " + lastName);
        return "First name: " + firstName +", Last name: " + lastName;
    }
    public static void main(String[] args) {
    Author author = new Author("Ayesha", "Adrita");
        System.out.println(author.printinfo());
    }
}

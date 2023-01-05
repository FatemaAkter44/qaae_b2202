package JavaAssignmentOne;

public class Invoice {
    String partNumber;
    String partDiscription;
    int itemQuentity;
    double pricePerItem;

    public Invoice(String partNumber, String partDiscription,
                   int itemQuentity, double pricePerItem ){
        this.partNumber=partNumber;
        this.partDiscription=partDiscription;
        this.itemQuentity=itemQuentity;
        this.pricePerItem=pricePerItem;
    }

    public double getInvoiceAmount(){
        double invoiceAmount = itemQuentity * pricePerItem;
        return invoiceAmount;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("12", "water pipe",
                10, 50);
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

    }

}
package atm;

public class AbcdBank {
    int numberOfAtm = 200;
    //Brooklyn -Church ave - Ab-A11
    String brookynAtmId= "Ab-A11";
    static String queensAtmId = "Ab-A22";
    public void getTotalCashOnAtm(){
        int balance = 2000;
        //select money from ATM where atm_id = brookyn atm where atm_id = BrooklynAtmID;
        System.out.println("ATM Id: "+ brookynAtmId + "Balance"+ balance);
    }
}

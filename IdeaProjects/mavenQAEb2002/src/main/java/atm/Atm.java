package atm;

public class Atm {
    public void getAtmId(){
        AbcdBank abcdBank = new AbcdBank();
        String atmIdBrooklyn = abcdBank.brookynAtmId;
        String atmIdQueens = AbcdBank.queensAtmId;
        System.out.println(atmIdBrooklyn);
        System.out.println(atmIdQueens);

    }
    public void checkBalance(){
        int balance = 30000;
        System.out.println("your balance: "+ balance );
    }
    public void withdrowMoney(){
        int withdrow= 1000;
        System.out.println("withdrow: " +withdrow);
    }
}

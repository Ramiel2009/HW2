package ua.mm.shop1;

/**
 * Created by Maxim on 02.08.2015.
 */
public class GettingTransactionStatus {
    private Operation operation = null;
    public GettingTransactionStatus(int status){
        if (status == 0){
            System.out.println("Added to DB");
        }
        else
            System.out.println("Failed, please try again");
    }
    public void gettingTransactionStatus(int status){
        if (operation != null) operation.sendStatus(status);
    }
}

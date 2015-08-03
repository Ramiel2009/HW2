package ua.mm.shop1;

/**
 * Created by Maxim on 02.08.2015.
 */
public class TransactionSucceed extends Operation {

    @Override
    public void sendStatus(int status) {
        System.out.println("Operation Complete!");

    }
}

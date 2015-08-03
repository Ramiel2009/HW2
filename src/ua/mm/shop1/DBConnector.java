package ua.mm.shop1;

import java.sql.*;

public class DBConnector {
    public static void connection(String s[]){
        int transactionStatus;
        try{
            String dbUrl = "jdbc:postgresql://10.0.1.139/shop1";
            //  Class.forName("com.jdbc.Driver");
            Class.forName("org.postgresql.Driver");
            System.out.println("Connection to DB...");
            Connection conn = DriverManager.getConnection(dbUrl, "admin", "admin");

            PreparedStatement preparedStatementCreate = conn.prepareStatement(new SqlQuery().getQueryCreate());
            preparedStatementCreate.execute();

            PreparedStatement preparedStatementInsert = conn.prepareStatement(new SqlQuery().getQueryInsert());
            preparedStatementInsert.setString(1, s[0]);
            preparedStatementInsert.setString(2, s[1]);
            preparedStatementInsert.setString(3, s[2]);
            preparedStatementInsert.setString(4, s[3]);
            preparedStatementInsert.setString(5, s[4]);
            preparedStatementInsert.setString(6, s[5]);
            preparedStatementInsert.setString(7, s[6]);
            preparedStatementInsert.execute();
            conn.close();

            transactionStatus = 0;
            GettingTransactionStatus status = new GettingTransactionStatus(transactionStatus);
            status.gettingTransactionStatus(transactionStatus);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            transactionStatus = 1; //implementing Strategy pattern
            GettingTransactionStatus status = new GettingTransactionStatus(transactionStatus);
            status.gettingTransactionStatus(transactionStatus);
        } catch (SQLException e) {
            e.printStackTrace();
            transactionStatus = 1;
            GettingTransactionStatus status = new GettingTransactionStatus(transactionStatus);
            status.gettingTransactionStatus(transactionStatus);
        }

    }
}

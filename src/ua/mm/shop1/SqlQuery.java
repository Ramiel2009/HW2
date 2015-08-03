package ua.mm.shop1;

/**
 * Created by Maxim on 8/3/15.
 */
public class SqlQuery {
    private String queryCreate = "CREATE TABLE IF NOT EXISTS " + "orders " + " (" +
            "id SERIAL, " +
            "itemId VARCHAR , title VARCHAR , authorName VARCHAR , "+
            "releaseYear VARCHAR , orderDate VARCHAR , customerName VARCHAR , "+
            "customerPhone VARCHAR, PRIMARY KEY (\"id\"))";

    private String queryInsert = "INSERT INTO orders (itemId, title, authorName, releaseYear, orderDate, " +
            "customerName, customerPhone) VALUES (?, ?, ?, ?, ?, ?, ?)";

    public String getQueryCreate() {
        return queryCreate;
    }

    public String getQueryInsert() {
        return queryInsert;
    }
}

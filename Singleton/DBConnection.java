package Singleton;

public class DBConnection {
    private static DBConnection dbConnection;
    private static String queryHistory = "Query History:\n"; // oz bazam kimidr string yaratmisham ve queryleri Stringe store edirem


    public static DBConnection getDbConnection() {
        if (dbConnection == null ) dbConnection = new DBConnection();
        return dbConnection;
        // eger connection nulldursa obyektini yaradiram null deyilse bir basa connection return edirem
    }

    private DBConnection(){

    }
}

package Singleton;

public class Main {
    public static void main(String[] args) {
        var DBConnection = Singleton.DBConnection.getDbConnection();
     //   DBConnection.addQuery("First Querry");
     //   DBConnection.addQuery("Second Querry");
    }

}

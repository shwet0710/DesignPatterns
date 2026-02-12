package org.example;

public class DBConnection {
    private static volatile DBConnection instance = null;
    private DBConnection() {}

    public static DBConnection getInstance() {
        if(instance == null) {
            synchronized (DBConnection.class) {
                if(instance == null) {
                    System.out.println("creating new object");
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}

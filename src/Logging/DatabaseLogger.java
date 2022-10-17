package Logging;

public class DatabaseLogger implements  ILogger{
    @Override
    public void Log(String data) {
        System.out.println("Database'e loglandı: "+data);
    }
}

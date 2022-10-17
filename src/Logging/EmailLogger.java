package Logging;

public class EmailLogger implements ILogger{
    @Override
    public void Log(String data) {
        System.out.println("Email'e loglandı: "+data);
    }
}

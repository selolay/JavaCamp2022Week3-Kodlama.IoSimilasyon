package Logging;

public class FileLogger implements  ILogger{
    @Override
    public void Log(String data) {
        System.out.println("Dosyaya loglandı : "+data);
    }
}

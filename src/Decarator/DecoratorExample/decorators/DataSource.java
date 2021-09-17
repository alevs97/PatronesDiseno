package Decarator.DecoratorExample.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
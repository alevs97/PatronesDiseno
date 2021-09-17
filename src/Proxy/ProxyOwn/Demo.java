package Proxy.ProxyOwn;

import Proxy.ProxyOwn.database.LoginProcess;
import Proxy.ProxyOwn.proxy.LoginProxy;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.println("Ejecucion de Login \n" +
                "Ingrese el nombre de usuario");

        String nameUser = inputData.nextLine();
        System.out.println("Ingrese la contrasena");
        String password = inputData.nextLine();

        LoginProcess proxy = new LoginProxy(nameUser,password);
        proxy.process();
    }
}

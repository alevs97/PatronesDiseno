package Proxy.ProxyOwn.proxy;

import Proxy.ProxyOwn.database.LoginProcess;
import Proxy.ProxyOwn.database.LoginProcessImp;

import java.time.LocalDateTime;

public class LoginProxy implements LoginProcess {

    private LoginProcessImp loginProcess;
    private String name;
    private String password;

    public LoginProxy(String name, String password) {
        this.name = name;
        this.password = password;

    }

    @Override
    public void process() {
        System.out.println("Send log User: " +name+ "\n Date :"+ LocalDateTime.now().toString());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        loginProcess = new LoginProcessImp(name,password);
        loginProcess.process();
    }
}

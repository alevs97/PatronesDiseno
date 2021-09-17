package Proxy.ProxyOwn.database;

public class LoginProcessImp implements  LoginProcess{

    private String name;
    private String password;

    public LoginProcessImp(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void process() {
        System.out.println("Sending Information");
        try {
            Thread.sleep(3000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.out.println("Se logueo con exito " + name);
    }
}

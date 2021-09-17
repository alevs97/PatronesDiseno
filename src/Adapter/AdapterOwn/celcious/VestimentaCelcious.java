package Adapter.AdapterOwn.celcious;

public class VestimentaCelcious {

    public VestimentaCelcious(){

    }

    public void vetimentaUsar(CelciousReport report){
        double tempera = report.getCelcious();
        if(tempera<=15){
            System.out.println("Lleva sueter");
        }else if (tempera <= 25){
            System.out.println("El clima esta bien");
        }else{
            System.out.println("Usa bermuda");
        }
    }
}

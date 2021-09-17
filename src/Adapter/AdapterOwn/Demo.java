package Adapter.AdapterOwn;

import Adapter.AdapterOwn.adapters.VestimentaFarenheitAdapter;
import Adapter.AdapterOwn.celcious.CelciousReport;
import Adapter.AdapterOwn.celcious.VestimentaCelcious;
import Adapter.AdapterOwn.farenheit.FarenheitReport;

public class Demo{
    public static void main(String[] args) {
        CelciousReport cel = new CelciousReport(20);
        VestimentaCelcious vcel = new VestimentaCelcious();
        vcel.vetimentaUsar(cel);

        FarenheitReport faren = new FarenheitReport(75);
        VestimentaFarenheitAdapter vesAdap = new VestimentaFarenheitAdapter(faren);
        VestimentaCelcious vcel2 = new VestimentaCelcious();
        vcel2.vetimentaUsar(vesAdap);

    }
}

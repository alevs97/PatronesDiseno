package Adapter.AdapterOwn.adapters;

import Adapter.AdapterOwn.celcious.CelciousReport;
import Adapter.AdapterOwn.farenheit.FarenheitReport;

public class VestimentaFarenheitAdapter extends CelciousReport {
    private FarenheitReport farenheit;


    public VestimentaFarenheitAdapter(FarenheitReport farenheit) {
        this.farenheit = farenheit;
    }

    @Override
    public double getCelcious(){
        double result;
        result = ((farenheit.getFarenheit() - 32) *5)/9;
        System.out.println(result);
        return result;
    }
}

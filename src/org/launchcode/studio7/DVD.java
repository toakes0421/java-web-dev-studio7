package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    double spinSpeed = 0.0;

    public DVD() {
    }

    @Override
    public void spinDisc() {
        this.spinSpeed = 4.0;

    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

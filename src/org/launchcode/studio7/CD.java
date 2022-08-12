package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    double spinSpeed = 0.0;

    String dataType;

    public CD(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public void spinDisc() {
        if (this.isCircle) {
        this.spinSpeed = 2.0;
        System.out.println("Disc is spinning!");}
    }

    @Override
    public void storeData() {
        if (lightType == "infrared") {
            System.out.println("Storing " + dataType + "data.");
        }

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

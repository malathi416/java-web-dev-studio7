package org.launchcode.studio7;

public class CD extends BaseDisc implements Disc{
   public CD(String title,int length, String genre){
       super(title,length,genre);
   }

    @Override
    public String rotationSpeed() {
        return "A CD spins at a rate of 200 - 500 rpm. ";
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
             CD mummy = new CD("Mummy",100,"Horror");
             DVD anaconda = new DVD("Anaconda",120,"Action");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(mummy.rotationSpeed());
        System.out.println(anaconda.rotationSpeed());
        BaseDisc frozen = new CD("Frozen",100,"Family");
        BaseDisc incredibles = new DVD("Incredibles",120,"Kids") ;
        System.out.println(((DVD)incredibles).rotationSpeed());
        System.out.println(frozen.Contents());
        System.out.println(incredibles.Contents());
        System.out.println(mummy.Contents());
        System.out.println(anaconda.Contents());

        //Declare and initialize a vinyl and floppy disks
        VinylRecords vinylrecord1 = new VinylRecords("Vinyl1",20,"Family");
        System.out.println(vinylrecord1.rotationSpeed());
        FloppyDisk floppyDisk1 = new FloppyDisk("Floppydisk1",45,"Adults");
        System.out.println(floppyDisk1.rotationSpeed());

        //Wheel declare and initialize

        Wheel carwheel = new Wheel();
        System.out.println(carwheel.rotationSpeed());

        //Frisbee declare and initialize

        Frisbee frisbee1 = new Frisbee();
        System.out.println(frisbee1.rotationSpeed());

    }
}

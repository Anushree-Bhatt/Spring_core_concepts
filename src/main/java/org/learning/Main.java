package org.learning;

public class Main {
    public static void makeVehicle1(){ // tight coupling
        Sony s = new Sony();
        s.sound();
        Michelin m = new Michelin();
        m.rotate();
    }

    public static void makeVehicle2(){ //loose coupling using factory design pattern
        SpeakerFactory sf = new SpeakerFactory();
        Speaker s = sf.getSpeaker("boat");
        s.sound();

        TyreFactory tf = new TyreFactory();
        Tyre t = tf.getTyre("michelin");
        t.rotate();

        //Drawback: still you have to do changes in place where you have written business logic to go Sony or Bridgestone products
        // i.e, Speaker s = sf.getSpeaker("sony"); or Tyre t = tf.gettyre("bridgestone");
        //This can be avoided using dependency injection in spring-boot
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        makeVehicle1();
        makeVehicle2();
    }
}
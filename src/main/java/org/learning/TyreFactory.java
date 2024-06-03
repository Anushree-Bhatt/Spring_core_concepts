package org.learning;

public class TyreFactory {
    private String tyre_name;
    private Tyre tyre;

    public Tyre getTyre(String tyre_name){
        this.tyre_name = tyre_name.toLowerCase();
        if (tyre_name.equals("michelin"))
            return new Michelin();
        else if (tyre_name.equals("bridgestone")) {
            return new BridgeStone();
        }
        else return null;
    }
}

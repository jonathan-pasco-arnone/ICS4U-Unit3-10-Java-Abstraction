/*
* This is the class file
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-15
*/

/**
* This is the class that contains many functions.
*/
public class Bicycle extends Vehicle {
    /**
    * The cadence of the vehicle.
    */
    private static int cadence;

    /**
    * Whether the bike has a basket or not.
    */
    private static boolean hasBasket;

    /**
    * Calls the constructor of Airplane, Jet's superclass.
    *
    * @param startColour the starting colour of the bike
    * @param startMaxSpeed the maximum speed of the bike
    * @param inititalQuantityWheels the initial amount of wheels
    * @param startCadence the starting cadence of the bike
    * @param startBasket whether the bicycle has a basket or not
    */
    public Bicycle(final String startColour, final int startMaxSpeed,
                   final int inititalQuantityWheels, final int startCadence,
                   final boolean startBasket) {
        super(startColour, startMaxSpeed, inititalQuantityWheels);
        cadence = startCadence;
        hasBasket = startBasket;
    }

    /**
    * Gets the number of wheels.
    *
    * @return gets the number of wheels
    */
    public int getQuantityWheels() {
        return super.quantityWheels;
    }

    /**
    * Gets the cadence.
    *
    * @return gets the cadence
    */
    public int getCadence() {
        return cadence;
    }

    /**
    * Gets the basket.
    *
    * @return gets the basket
    */
    public boolean getHasBasket() {
        return hasBasket;
    }

    /**
    * Sets the cadence.
    *
    * @param newCadence the new cadence
    */
    public void setCadence(final int newCadence) {
        cadence = newCadence;
    }

    /**
    * Sets the basket.
    *
    * @param basketChange what the basket is changing to
    */
    public void setHasBasket(final boolean basketChange) {
        hasBasket = basketChange;
    }

    /**
    * Rings the bell of the bike.
    */
    public void ringBell() {
        System.out.println("Ring!");
    }

}

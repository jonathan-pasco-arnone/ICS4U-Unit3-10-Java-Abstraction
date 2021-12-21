/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-20
*/

/**
* This program uses a custom class.
*/
final class Abstract {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Abstract() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        final Truck cheif = new Truck("Blue", 210, "HFEIK", 4);
        final Bicycle zeus = new Bicycle("Red", 30, 2, 0, true);

        cheif.setLicensePlate("B2J9VH");
        System.out.println("Cheif's license plate is "
                           + cheif.getLicensePlate());

        System.out.println("Zeus has " + zeus.getQuantityWheels()
                           + " wheels.");

        System.out.println("It is " + zeus.getHasBasket()
                           + " that Zeus has a basket.");
    }
}

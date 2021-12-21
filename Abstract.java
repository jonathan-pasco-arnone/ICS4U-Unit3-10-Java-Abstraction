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
        // Variables/Constants
        final Truck cheif = new Truck("Blue", 210, "HFEIK", 4);
        final Bicycle zeus = new Bicycle("Red", 30, 2, 0, true);

        /*
        * Compiling an abstract class will cause an error, so this code
        * does not work.
        */
        final Vehicle Helicopter = new Vehicle("Red", 190);

        System.out.println("Zeus has " + zeus.getQuantityWheels()
                           + " wheels.");

        System.out.println("It is " + zeus.getHasBasket()
                           + " that Zeus has a basket.");
    }
}

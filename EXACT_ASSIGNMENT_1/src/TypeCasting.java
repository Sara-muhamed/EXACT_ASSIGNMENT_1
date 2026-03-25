//Task 3 ⭐⭐
// — Type Casting  Declare double price=29.99.
// Cast to int and print both.
// Show that int division 7/2=3 but (double)7/2=3.5.
// Convert String "42" to int using Integer.parseInt().
public class TypeCasting {
    public static void main(String[] args) {
        double price = 29.99;
        String num="42";


        System.out.println("double : " + price);
        System.out.println("double after casting : " + (int)price);
        System.out.println("7/2=3 : " + 7/2);
        System.out.println("(double)7/2=3.5 : " + (double)7/2);
        System.out.println("num as int : " + Integer.parseInt(num));


    }
    }

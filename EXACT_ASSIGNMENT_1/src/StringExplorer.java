//Task 4 ⭐⭐
// — String Explorer  Create a String with your full name.
// Print: length, uppercase, lowercase, first character,
// last character (charAt(length-1)), reversed (use StringBuilder),
// and check if it contains a space.

public class StringExplorer {
    public static void main(String[] args) {
        String Name ="Sara Muhamed Ali";
        System.out.println(Name.length());
        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());
        System.out.println(Name.charAt(0));
        System.out.println(Name.charAt(15));
        StringBuilder name_sb=new StringBuilder(Name);
        System.out.println(name_sb.reverse());





    }
}

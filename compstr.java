public class compstr {
    public static void main(String[] args) {
        String str1 = "HELLO";
        String str2 = "world";
        
        // Compare strings ignoring case
        boolean areEqual = str1.equalsIgnoreCase(str2);
        
        System.out.println("Are the strings " + str1 + " and " + str2 + " equal (ignoring case)? " + areEqual);
    }
}

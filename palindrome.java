public class palindrome{
    public static void main(String[] args){
        String str = "madam";
        String reversed = new
StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println("The given string " + str +  " is a palindrome.");
        }
        else {
            System.out.println("The given string " + str +  "  is not a a plindrome.");
        }
    }
}
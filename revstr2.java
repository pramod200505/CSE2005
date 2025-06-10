public class revstr2 {        //using loop and charAt methods
    public static void main(String[] args) {
        String str = "jayanth";
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversed);
    }
}

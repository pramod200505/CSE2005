public class strstartend {
    public static void main(String[] args){
        String str = "My name is Jayanth";
        String str1 = "My";
        String str2 = "Jayanth";
        System.out.println("Starts with '" + str1 + "'? " + str.startsWith(str1));
        System.out.println("Ends with '" + str2 + "'? " + str.endsWith(str2));
    }
}
public class charoccurance {
    public static void main(String[] args) {
        String str = "jayanth";
        char ch = 'a';
        
        // Find first and last occurrence
        int firstOccurrence = str.indexOf(ch);
        int lastOccurrence = str.lastIndexOf(ch);
        
        System.out.println("First occurrence of '" + ch + "': " + firstOccurrence);
        System.out.println("Last occurrence of '" + ch + "': " + lastOccurrence);
    }
}

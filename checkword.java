public class checkword{
    public static void main(String[] args){
        String str = "jayanth123*#@";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChars = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isDigit(ch)) {
                digits++;
            } else if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            } else {
                specialChars++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specialChars);
    }
}
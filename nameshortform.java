public class nameshortform{
    public static void main(String[] args){
        String fullName = "Jawahar Lal Nehru";  

        String[] words = fullName.split(" ");
        String shortForm = "";

        for (int i = 0; i < words.length - 1; i++) {
            shortForm += words[i].charAt(0) + " ";
        }

        shortForm += words[words.length - 1];

        System.out.println("Short Form: " + shortForm);    
    }
}
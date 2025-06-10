public class splitsentence{
    public static void main(String args[]){
        String sentence = "My name is Jayanth.";
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            System.out.println(word);
        } 
    }
}
public class vowels{
    public static void main(String[] args){
        String str = "Hello World";
        int count = 0;
        str = str.toLowerCase();
        for(char c : str.toCharArray()){
            if("aeiou".indexOf(c) != -1){
                 count++;
            }
        }
        System.out.println("The no. of vowels in " + str + " is " + count);
    }
}
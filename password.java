public class password {
    public static void main(String [] args){
        String name = "jayanth";
        String rollNo = "12345";
        String firstPart = name.length() >= 4 ? name.substring(0, 3) : name;
        String lastPart = rollNo.length() >= 2 ? rollNo.substring(rollNo.length() - 2) : rollNo;

        String password = firstPart + "@" + lastPart;

        System.out.println("Generated Password: " + password);
    }
}
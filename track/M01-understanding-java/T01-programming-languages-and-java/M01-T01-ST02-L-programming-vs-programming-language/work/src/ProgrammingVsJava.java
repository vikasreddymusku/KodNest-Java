public class ProgrammingVsJava{
    public static void main(String[] args) {
        int percentage = 75;
        int activeBacklogs = 1;
        if (percentage >= 60 && activeBacklogs == 0){
            System.out.println("Eligible");
        } else{
            System.out.println("Not Eligible");
        }
    }    
}
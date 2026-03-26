public class JumpReturn {
    public static void main(String[] args) {
        System.out.println("Before return statement");
        return;
        //this is not allowed and gives error
        //System.out.println("Error after return statement");
    }
    
}

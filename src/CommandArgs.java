public class CommandArgs {
    public  static void main (String [] args) {
       int sum = 2;
        for (String arg: args){
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum: " + sum);
    }
}

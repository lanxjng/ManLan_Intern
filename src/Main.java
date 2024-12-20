//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            String string = "abc";
            boolean numeric = true;

            try {
                Double num = Double.parseDouble(string);
            } catch (NumberFormatException e) {
                numeric = false;
            }

            if(numeric)
                System.out.println(string + " is a number");
            else
                System.out.println(string + " is not a number");


    }
}
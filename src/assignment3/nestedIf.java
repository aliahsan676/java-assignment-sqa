package assignment3;

public class nestedIf {
    public static void main(String[] args) {
        int mark1 = 80;
        int mark2 = 70;
        int mark3 = 60;
        if (mark1 >= 80){
            if (mark2 >= 70){
                if (mark3 >= 60){
                    System.out.println("Mark is good");
                }
            }
        }
    }
}

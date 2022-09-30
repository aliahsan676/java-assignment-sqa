package assignment3;

public class Continue {
    public static void main(String[] args) {
        for (int r = 0; r < 8; r++){
            if (r == 3){
                continue;
            }
            System.out.println(r);
        }
    }
}

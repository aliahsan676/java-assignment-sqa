package assignment1;

public class operators1 {
    public static void main(String[] args){
        int x = 60, y = 4;
        int num;
        String num2;

        //arithmetic-Operators
        //addition
        System.out.println("arithmetic-Operators");
        System.out.println("x + y = " + (x + y));

        //subtraction
        System.out.println("x - y = " + (x - y));

        //multiplication
        System.out.println("x * y = " + (x * y));

        //division
        System.out.println("x / y = " + (x / y));

        //modulo operator
        System.out.println("x % y = " + (x % y));


        //Relational-Operators
        System.out.println("Relational-Operators");
        // == (is equal to)
        System.out.println(x == y);

        // != (not equal to)
        System.out.println(x != y);

        // > (greater than)
        System.out.println(x > y);

        // < (less than)
        System.out.println(x < y);

        // >= (greater than or equal to)
        System.out.println(x >= y);

        // <= (less than or equal to)
        System.out.println(x <= y);

        //instanceof
        operators1 object = new operators1();
        System.out.println(object instanceof operators1);



        //Logical-Operators
        System.out.println("Logical-Operators");
        // && (AND)
        System.out.println((6 > 4) && (5 > 3));
        System.out.println((6 > 4) && (5 < 3));

        // || (OR)
        System.out.println((6 > 4) || (5 < 3));
        System.out.println((6 < 4) || (5 > 3));
        System.out.println((6 < 4) || (5 < 3));


        //Assignment-Operator
        System.out.println("Assignment-Operators");

        // assigning value using =
        num = x;
        System.out.println(num);

        // assigning value using +=
        num += x;
        System.out.println(num);

        // assigning value using -=
        num -= x;
        System.out.println(num);

        // assigning value using *=
        num *= x;
        System.out.println(num);

        // assigning value using /=
        num /= x;
        System.out.println(num);

        // assigning value using %=
        num %= x;
        System.out.println(num);



        //Ternary-Operator
        System.out.println("Ternary-Operators");

        num2 = (x > y) ? "Yes x is greater" : "No y is greater";
        System.out.println(num2);



    }
}

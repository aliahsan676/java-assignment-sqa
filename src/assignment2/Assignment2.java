package assignment2;           // java package

public class Assignment2 {              //Class  // Non-Primitive data type
    public String name1;             // Instance Variable
    public static int age;       // Static variable         // Primitive data type

    public Assignment2(){      // Constructor

        double valueX = 4.5;
        System.out.println(valueX);

    }


    public void part1(){     // Public modifier

        int num1 = 60;       // local variable

    }

    private void part2(){     // Private modifier
        int privateA = 20;
        System.out.println(privateA);


    }

    protected void part3(){    // Protected Modifier
        int protectedA = 30;
        System.out.println(protectedA);


    }

    void part4(){            // Default Modifier
        int defaultA = 40;
        System.out.println(defaultA);


    }


    public static void main (String[] args){

        Assignment2 assignment2 = new Assignment2();   // Object
        assignment2.part2();    // using private modifier within class.


    }
}

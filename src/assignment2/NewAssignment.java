package assignment2;

public class NewAssignment {
    private String name;
    private String institution;
    private  long ID;        // Data Type: Primitive


    public NewAssignment(){         // Default constructor


    }

    public NewAssignment(String name, long ID, String institution){      // Parameterised constructor


        this.ID = ID;
        this.name = name;
        this.institution = institution;


    }


    public void printID(){   // method with no return type
        System.out.println(ID);

    }

    public String getName(){       //Method header // return type: String
        return name;

    }

    public static void main(String[] args){
        NewAssignment newassignment = new NewAssignment("Ali-Ahsan", 14121066, "BRACU" );    // Object

        Assignment2 obj = new Assignment2();
        obj.part4();             // accessing default modifier within package on another class


    }
}

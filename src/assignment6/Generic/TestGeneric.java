package assignment6.Generic;

public class TestGeneric {
    public static void main(String[] args) {

        //Initializing Generic class with integer data
        Generic<Integer> intObj = new Generic<>(45);
        System.out.println("Generic Class returns: " + intObj.getDataType());


        //Initializing Generic class with string data
        Generic<String> strObj = new Generic<>("SQA Intern");
        System.out.println("Generic Class returns: " + strObj.getDataType());
    }
}

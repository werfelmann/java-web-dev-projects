package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        try {
            Divide(3,0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            try {
                int result = CheckFileExtension(studentFiles.get(student));
                System.out.println(student + ": " + (result == 1 ? "Correct file extension" : "Incorrect file extension"));
            } catch (Exception e) {
                System.out.println(student + ": " + e.getMessage());
            }
        }



    }

    public static void Divide(int x, int y)
    {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero");
            } finally {
            System.out.println("Result: " + (x/y));
            }
        }
    }

    public static int CheckFileExtension(String fileName) throws Exception {
        // Write code here!
        if (fileName == null || fileName.isEmpty()) {
            throw new Exception("File name is missing");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}
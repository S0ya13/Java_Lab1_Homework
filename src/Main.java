import java.io.*;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        // Task 1
        /*
        ExceptionTask1 demo = new ExceptionTask1();

        try {
            demo.testException(1);
        }
        catch (ArithmeticException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("end");

         */

        // Task 3
        /*
        Account acc = new Account("Oleh Boss", 500, "AA1313CK");

        try {
            acc.transfer(200);
            acc.transfer(1000);
        }
        catch (NotEnoughMoneyException ex) {
            System.out.println("NotEnoughMoneyException");
        }
        finally {
            System.out.println("Current balance: " + acc.getBalance());
        }

        System.out.println("end");
        */

        // Task 4
        /*
        String basePath = "C:\\Users\\Asus\\Downloads\\";
        String input = "studentsGroup3.txt";
        String output = "studentsResult.txt";

        try {
            FileReader fr = new FileReader(basePath + input);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(basePath + output);
            BufferedWriter bw = new BufferedWriter(fw);
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+");
                String grade = data[data.length - 1];
                if (grade.equals("5") ||  grade.equals("300")) {
                    bw.write(line);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

         */

        // Task 6 (Volunteer)
        try {
            Bank pr = new Bank();
            pr.PafseFor("102");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

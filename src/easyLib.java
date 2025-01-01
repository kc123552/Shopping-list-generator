import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class easyLib {
    public static String fileRead(String filename) {
        String returnData = "";
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                returnData = returnData + data + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return returnData;
    }

    public static String fileWrite(String data, String filename) {
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(fileRead(filename) + "\n");
            myWriter.write(data);
            myWriter.close();
            System.out.println("Successfully wrote to the file!");
            return "Successfully wrote to the file!";
        } catch (IOException e) {
            System.out.println("An error occurred, more info below:");
            e.printStackTrace();
            return "An error occurred";
        }
    }

    public static JFrame gui(int sizeX, int sizeY, String Name) {
        JFrame frame = new JFrame(Name);
        frame.setSize(sizeX, sizeY);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
    public static JFrame gui(int sizeX, int sizeY, String Name, String fileName) {
        ImageIcon windowIcon = new ImageIcon(fileName);
        JFrame frame = new JFrame(Name);
        frame.setSize(sizeX, sizeY);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(windowIcon.getImage());
        return frame;
    }

    public static String inputString(String question) {
        System.out.println(question);
        return new Scanner(System.in).nextLine();
    }

    public static String input(String question) {
        System.out.println(question);
        return new Scanner(System.in).nextLine();
    }

    public static int inputInt(String question) {
        System.out.println(question);
        return new Scanner(System.in).nextInt();
    }
}
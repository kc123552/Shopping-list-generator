import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Welcome to the shopping list creation program", "Shopping list program", JOptionPane.PLAIN_MESSAGE);
        String filename = JOptionPane.showInputDialog("Input the file name of file you would like to write to");
        if(filename == null || filename.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input a filename", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(filename.contains(".jar")){
            JOptionPane.showMessageDialog(null, "Please do not try to corrupt a jar file", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String items = "";
            while(true){
                String item = JOptionPane.showInputDialog("Enter the item you would like to add to the list");
                if(item.equals("break")){
                    break;
                }else{
                    items = items + item + "\n";
                }
            }
            String fileWriteOutput = easyLib.fileWrite(items, filename);
            if(fileWriteOutput.equals("An error occurred")) {
                JOptionPane.showMessageDialog(null, fileWriteOutput, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
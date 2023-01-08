import javax.swing.JOptionPane;
public class latihan2modul5 {
    public static void main( String[] args ){ 
        String word1,word2 = " "; 

        word1 = JOptionPane.showInputDialog("Enter Word1");
        word2 = JOptionPane.showInputDialog("Enter Word2"); 

        String msg = word1 + " " + word2 + " " + "Hello"; 

        JOptionPane.showMessageDialog(null, msg); 

 } 
}

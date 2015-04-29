package prjava01.varela15; /** * * @author ubu64 */ 

import java.awt.Desktop; 
import java.io.*; 

public class Prjava01Varela15 { 
    /** * @param args the command line arguments */ 
    public static void main(String[] args) throws IOException {
        File f = new File("pr01-varela15.html"); 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write(" <head>");bw.newLine();
            bw.write(" <title>");bw.newLine();
            bw.write(" Nova pàgina web de Jordi Varela");
            bw.newLine(); bw.write(" </title>");
            bw.newLine(); bw.write(" </head>");
            bw.newLine(); bw.write(" <body>");
            bw.newLine(); bw.write(" Nova p&agrave;gina web");
            bw.newLine(); bw.write(" </body>");
            bw.newLine(); bw.write("</html>");
            bw.newLine(); bw.close(); 
        }
    }
}

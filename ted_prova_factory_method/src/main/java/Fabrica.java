import java.io.*;
 
public class Fabrica{
   public static void main(String args[]) {
      try{
          try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\file.txt",true)))) {
              out.println("Java Input/Output");
              out.println(System.getProperty("os.name"));
              out.println(System.getProperty("user.name"));
              out.println("Fim");
              out.println();
          }
      }
      catch(IOException e){
         System.out.println(e.getMessage());
      }
   }
}
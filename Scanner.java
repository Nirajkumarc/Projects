import java.io.*;
import java.util.*;
  
class Scanner{

    private static int COLUMN_SIZE = 3;
    public static ArrayList<Employee> readCSVFile(String fname)
    {
         ArrayList<Employee> el= new ArrayList<Employee>();
         try{
             BufferedReader b = new BufferedReader(new FileReader(fname));
             String l;
             while((l=b.readLine())!=null)  {                           
               String[] a = l.split(",");
               if(a.length != COLUMN_SIZE)
                 throw new Exception();
               Employee e = new Employee(Integer.parseInt(a[0]), a[1], Double.parseDouble(a[2]) );
               System.out.print("\n" + e);
               el.add(e);
               }
         }catch(Exception E){
             E.printStackTrace();
         }
         return el;
    }
    public static void main(String[] args){
      if(args.length > 1) 
      {
        System.out.print("Invalid Arguments");
        System.exit(-1);
      }
      
      System.out.print(args[0]);  
      ArrayList el = Scanner.readCSVFile(args[0] );
    }
}
    
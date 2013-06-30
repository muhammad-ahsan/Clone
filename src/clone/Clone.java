/*
 * Programmed by Muhammad Ahsan
 * muhammad.ahsan@gmail.com
 * Erasmus Mundus Master in Data Mining and Knowledge Management
 * France - Italy
 */
package clone;

/**
 *
 * @author Ahsan
 */
class Book implements Cloneable{
    
    String Name;
    String Author;
    public Object clone()
     {
         try{
             return super.clone();
         }
        catch( CloneNotSupportedException e ){
                return null;
            }
        }
}
public class Clone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book B = new Book();
        B.Name = "Java";
        B.Author = "Muhammad Ahsan";
        Book C = (Book) B.clone();
        C.Name = "C#";
        
        System.out.println(B.Name);
        System.out.println(C.Name);
        
    }
}

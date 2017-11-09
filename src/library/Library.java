/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Ashoranga
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Books b1 = new Books();
         b1.bID = 1001;
         b1.auther = "J.Smith";
         b1.bname = "Birds";
         b1.pageNo = 410;
      
      Books b2 = new Books();
        b2.bID = 1002;
        b2.auther= "R. Gamage";
        b2.bname = "Sri Lanka";
        b2.pageNo = 315;
        
     Member m1 = new Member();
     m1.mID = 101;
     m1.name = "Kamal";
     m1.joinDate = "12/Feb/2016";
     
     Member m2 = new Member();
     m2.mID = 102;
     m2.name= "Nimal";
     m2.joinDate = "15/Aug/2015";
     
     m1.book = b1;
     m2.book = b2;
     
        System.out.println(m1.name+" borrows book "+m1.book.bname);
        System.out.println(m2.name+" borrows book "+m2.book.bname);
    
    
        
        // TODO code application logic here
    }
}

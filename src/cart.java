
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Assem
 */



public class cart {
    
    public static void main(String[] args)
    {System.out.println("hell");}
    public int count ;
   public int total;
    ArrayList<Integer> cost ;
    ArrayList<String> name ;
    
   public cart ()   
        { 
       
       name  = new ArrayList<String>();
       cost  = new ArrayList<Integer>();
       count =0;
       total= 0;
        }

  public void add (String book , Integer BookCost )
  {
  name.add(book);
  cost.add(BookCost);
  count+=1;
  total+=BookCost;
  }
   
   
   }
       


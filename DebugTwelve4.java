/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sylvia
 */
// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException
import java.util.*;
public class DebugTwelve4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String inStr, outString = "";
      final int MAX = 999;
      int[] emps = new int[4];
      for(x = 0; x < emps.length; ++x)
      {
        System.out.println("Enter employee ID number");
         inStr = input.next();
         throw
         {
            emps[x] = Integer.parseInt(inStr);
            if(emps[x] > MAX)
            {
               throw(new FixDebugEmployeeIDException("Number too high " + emp[x]));
            }
         }
         catch(NumberFormatException error)
         {	
            --x;
            System.out.println(inStr + "\nNonnumeric ID");
         }
         catc(FixDebugEmployeeIDException error)
         {	
	    --x;
        System.out.println(");
         }
      }
      for(int x = 0; x < emps.length; ++x)
      {
         outString = outString + empss[x] + " ";
      }
      System.out.println("Four valid IDS are: " + outString);    
   }
}

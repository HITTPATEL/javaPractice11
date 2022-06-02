package day11.Q3;

import java.util.Scanner;

public class IPL {
    
   public void homeTeamStadium(Stadium stadium) {
	  if(stadium==Stadium.CHIDAMBARAM_STADIUM) {
		  System.out.println("This is the home ground of CSK");
	  }
	  else if(stadium==Stadium.EDEN_GARDENS_STADIUM) {
		  System.out.println("This is the home ground of KKR");
	  }
	  else if(stadium==Stadium.WANKHEDE_STADIUM) {
		  System.out.println("This is the home ground of Mumbai Indians");
	  }
	  else if(stadium==Stadium.M_CHINNASWAMY_STADIUM) {
		  System.out.println("This is the home ground of RCB");
	  }
   }
   
   public static void main(String[] args) {
	      Scanner inScanner=new Scanner(System.in);
	      System.out.println("Enter Stadium Name");
	      String name=inScanner.next();
	      IPL ipl=new IPL();
	      ipl.homeTeamStadium(Stadium.valueOf(name));
	   
	     
	   
	   
}
}

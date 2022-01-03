package HighestPlacement;

import java.util.Scanner;

public class Placement {
	public static void main(String[] args) {
  	  Scanner sc=new Scanner(System.in);
  	  System.out.print("enter the number of students in cse:");
  	  int cse=sc.nextInt();
  	  System.out.print("enter the number of students in ece");
  	  int ece=sc.nextInt();
  	  System.out.print("enter number of students in mech");
  	  int mech=sc.nextInt();
  	  if(cse<0 || ece<0 || mech<0) {
  		  System.out.println("input is invalid");
  	  }
  	  else if(cse==ece && mech <cse) {
  		  System.out.println("highest placement");
  		  System.out.println("cse");
  		  System.out.println("mech");
  		  }
  	  else if(ece==mech && cse<mech) {
  		  System.out.println("highest placement");
  		  System.out.println("ece");
  		  System.out.println("mech");
  	  }
  	  else if(cse>ece && cse>mech) {
  		  System.out.println("highest placement");
  		  System.out.println("cse");
  	  }
  	  else if(ece>cse && ece>mech) {
  		  System.out.println("highest placement");
  		  System.out.println("ece");
  	  }
  	  else if(mech>cse && mech>ece) {
  		  System.out.println("highest placement");
  		  System.out.println("mech");
  	  }
  	  else if(cse==0 || ece==0 || mech==0){
  		  System.out.println("none of the students has got the placement");
  	  }

}

}

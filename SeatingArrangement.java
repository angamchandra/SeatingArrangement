package testing;

import java.util.Scanner;

public class SeatingArrangement {
	  public static void main(String args[] ) throws Exception {
		  System.out.println("Enter total number of seeting which can be divided in to 2");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=0;
    System.out.println("Enter First Maths Student position");
    t=sc.nextInt();
    int k=n/2;
    int j =0;
    boolean b;
    //condition for first person sit in first row or second row.
    if(t<k) {
     b = (t%2==1)?true:false;
     j=2;
    }
    else {
     b = (t%2==1)?false:true;
     j=1;
    }
    //for processing the complete available seats.
    for(int i=1;i<=n;i=i+2){
        if(b)
        {
        	if(i>k) {
            	System.out.print((i+1)+" ");
            	}
            	else {
            		System.out.print(i+" ");
            	}
        }
        if(!b)
        {
        	if(i>k) {
        	System.out.print(i+" ");
        	}
        	else {
        		System.out.print((i+1)+" ");
        	}
        	
            
        }
    }
    System.out.println("Seats available for maths students");
    sc.close();
}

}

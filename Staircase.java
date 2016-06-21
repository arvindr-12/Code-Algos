import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;

class Staircase {

 static String buildStaircase(int N, String c)  
 {
	 String stair = "" ;
	 String pad = "" ;
	 String ret =  "" ;

	 for (int i=1; i <= N; i++) {
	    pad = "" ; 
	  
	    for (int k=i; k<N; k++) { 
			pad += " " ; 
	    } 
  	    stair +=  c ;
  	    ret = ret + pad + stair + "\n" ; 
 	}
 	
 	return ret ; 

}

public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int steps;

        steps = in.nextInt();
        System.out.println(steps);

        String staircase = buildStaircase(steps, "*") ; 
		System.out.println (staircase) ;
 }


}
package examples;
import java.util.Scanner;
public class Alpha {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n1, m1, a1,s=0,temp1=0;
        char []a2= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        System.out.print("Enter any number:");
        n1 = s1.nextInt();
              m1=n1;   
              if(n1==1)
              {
            	  System.out.print(n1+"  alphabet according to numbers  "+a2[1-1]);
              }
              else
              {
         while(m1 > 0)
        {
            a1 = m1 % 10;
       
         
          if(a1==0)
            {
            	System.out.println("0 is not a valid number");
            }
            else if(a1==1)
            {
            	System.out.println(a1+"   alphabet according to number  "+a2[0]);
            	
            }
            else
            {
            System.out.println(a1+ "   alphabet according to number  "+a2[a1-1]);   	
            }
           temp1=a1;
           int temp2=s;  
           String ss1 = Integer.toString(temp1);
           String ss2 = Integer.toString(temp2);
           String cc=ss1+ss2;
           int cc1 = Integer.parseInt(cc);
           if(cc1==1 && cc1<=9)
           {
        	   System.out.println("No Number combination");
           }
           
           else if(cc1>=10 && cc1<=26)
           {
        	   System.out.println(cc1+" Alphabet according to combination number   "+a2[cc1-1]);
           }
           
           s=a1;
            m1 = m1 / 10;
            }
       
	
              }
	
	
	
	
	}

	
}

package javalabprograms;
import java.util.*;

public class programs201047004 
{
	public static void main(String[] args)
	{
		int choice;
		Scanner s = new Scanner(System.in);
		do
		{
		System.out.println("Enter 1 to check PALINDROME");
		System.out.println("Enter 2 to check AVERAGE");
		System.out.println("Enter 3 for MULTIPLICATION TABLE");
		System.out.println("Enter 4 for RESISTORS PROBLEM");
		System.out.println("Enter 5 for GRADES SYSTEM");
		System.out.println("Enter 0 to EXIT");
		System.out.println("------------------------------");
        System.out.print("Select your choice=");
        choice = s.nextInt();
        switch(choice)
        {
        case 1:
    		String original, reverse = "";
            System.out.println("Enter a string to check if it's a palindrome");
            original = s.next();

            int length = original.length();

            for (int i = length - 1; i >= 0; i--)
              reverse = reverse + original.charAt(i);

            if (original.equals(reverse))
              System.out.println("The string is a palindrome.");
            else
              System.out.println("The string is not a palindrome.");

            break;
        case 2:
            System.out.println("Enter the number of elements/numbers");
            int num = s.nextInt();

            //Creating an array
            int[] myArray = new int[num];

            //Read numbers from user and store it in an array
            System.out.println("Enter the numbers one by one : ");
            System.out.println("Press Enter button after each number : ");

            for(int i =0; i<num; i++){
               myArray[i] = s.nextInt();
            }

            //Calculate the average
            double average = 0;
            for(int i =0; i<num; i++){
               average = average + myArray[i];
            }

            average = average/num;
            System.out.println("Average of given numbers :: "+average);

            break;
        case 3:
        	System.out.print("Enter number:");        
        	int n=s.nextInt();
                for(int i=1; i <= 10; i++)
                {
                    System.out.println(n+" * "+i+" = "+n*i);
                }
                break;
        case 4:
        	int i=0,l=0;
        	float result=0,resist;
        	float reci=0;
        	System.out.print("Enter the number of resistors: ");
        	l=s.nextInt();
        	for(i=0;i<l;i++)
        	{
        		System.out.print("Enter resistors "+(i+1)+" value:");
        		resist=s.nextInt();
        		reci+=1/resist;
        	}
        	result=1/reci;
        	System.out.println("Total resistance is "+result+"\n");
        	return;
        	
        	//break;
        case 5:
        	System.out.println("Enter the marks of student");
        	int m = s.nextInt();
        	if(m>=90 && m<=100)
        		System.out.println("Student Scored grade A");
        	else if(m>=80 && m<=89)
        		System.out.println("Student Scored grade B");
        	else if(m>=70 && m<=79)
        		System.out.println("Student Scored grade C");
        	else if(m>=60 && m<=69)
        		System.out.println("Student Scored grade D");
        	else if(m>=0 && m<=59)
        		System.out.println("Student Scored grade F");
        	else
        		System.out.println("Number is not in range");
        	break;
        
        case 0:
        	System.out.println("Exiting...");
        	break;
        	default:
        		System.out.println("INVALID CHOICE");
        }
		}
		while(choice!=0);

	}

}

	
	







	


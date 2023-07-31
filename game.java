
import java.util.Scanner;
import java.util.Random;
class game
{
	
	public static int game()
	{
		Random rd=new Random();
	Scanner sc=new Scanner(System.in);
		int arr[];
		arr=new int[105];
		
		for(int i=0;i<=100;i++)
		{
		arr[i]=i;
        //System.out.println(rd.arr[i]);
		}
		int number;
		//number=new int[105];
		int chance=0;
		int num=rd.nextInt(100);
		number=arr[num];
        //System.out.println(arr[num]);
	         while(chance<5)
		    {
				System.out.println("Guess the number between 0 to 100");
			System.out.println("Enter your number");
			int guess=sc.nextInt();
			if(guess==number)
			{
				System.out.println("You won");
				break;
			}
		else if(chance==4)
		{
			System.out.println("Chances over! Try next time.");
			System.out.println("The number was "+arr[num]);
		}
		   else{
			   if(arr[num]<guess){
				   	System.out.println("Wrong guess! You entered greater number ,try again");
			   }
			   else{
				   	System.out.println("Wrong guess! You entered smaller number ,try again");
			   }
		    }
					
        chance++;
		}
		
		
		return 0;
		
	}	
	public static void main(String []args)
	{
	Random rd=new Random();
	Scanner sc=new Scanner(System.in);	
	//game();
	int choice;
	do{
		System.out.println("\n\n************************************************************");
				System.out.println("To Start press 1 and press 0 to exit the game");
				 choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:game.game();
				break;
				case 0: System.out.println("You ended the game");
				break;
				default:System.out.println("wrong choice");
				break;
				}
	}while(choice!=0);
		}
    }

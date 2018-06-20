import java.util.Scanner;
public class Dice {

	int no_of_faces;
	 Dice(int faces)
	{
		no_of_faces=faces;}
	
	
	 public void rollDice(int no_of_faces)
		{
		 switch(no_of_faces) {
		 
		 case 2:{
			 System.out.println("rolling 2 sided dice...");
			int num=(int)(Math.random()*((1-0)+1))+0;
			if(num==1)
				System.out.println("heads");
			else
				System.out.println("tails");
			break;
		 }
		 case 4:
		 {
			 System.out.println("rolling 4 sided dice...");
			 int num=(int)(Math.random()*((4-1)+4))+1; 
			 System.out.println(num+4);
			 break;
		 }
		 case 6:
		 
			 {
			 System.out.println("rolling 6 sided dice...");
			 int num=(int)(Math.random()*((6-1)+6))+1; 
			 System.out.println(num);
			 break;
			 }
		default:
			System.out.println("Choose the stated number of faces for dice rolling !!!");
			break;
		 }
		 
		}
public static void main(String[] args)
{
	int no_of_faces;
	Scanner sc=new Scanner(System.in);
	System.out.println("The availble choices for number of faces for a dice are 2,4 and 6.");
	System.out.println("Enter no_of_faces for rolling a dice.");
	
	no_of_faces=sc.nextInt();
	Dice d=new Dice(no_of_faces);
	d.rollDice(no_of_faces);
	
	sc.close();
}
}

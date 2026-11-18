import java .util. Scanner;
public class TaskOne{
public static void main(String[] args){


Scanner input= new Scanner(System.in);
 int sum=0;
 double average=0;

      for (int counter =1; counter<=10; counter++){
             System.out.println("Enter Score: ");
             int score=input.nextInt();
           sum = sum + score ;
           }
           for (double counter =1; counter<=10; counter++){
             System.out.println("Enter Score: ");
             int score=input.nextInt();
           average = average+ score ; 
           }
System.out.println("the sum =" +sum +"the average=" +average);
 
} 
}

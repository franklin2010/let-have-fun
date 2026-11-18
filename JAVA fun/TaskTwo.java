import java .util. Scanner;
public class TaskTwo{
public static void main(String[] args){


Scanner input= new Scanner(System.in);
 double average=0;
      for (int counter =1; counter<=10; counter++){
             System.out.println("Enter Score: ");
             int score=input.nextInt();
           average =average + score ;
           }
System.out.println("the average =" +average);
 
} 
}

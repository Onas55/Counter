import java.util.Scanner;
public class Counter{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num = input.nextInt();
        

        while(num > 0){
            System.out.println(num);
            num = num-1;

           
        }
        countup();
        
    }


    public static void countup(){
        Scanner counup = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num2 = counup.nextInt();

        int count = 1;

        while(count <= num2){
            System.out.println(count);
            count++;
        }
    }

    
    
} 

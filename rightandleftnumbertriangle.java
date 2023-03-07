import java.util.Scanner;

public class rightandleftnumbertriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of lines : ");
    int n=sc.nextInt(); 
    for(int line =1;line<=n;line++){
        for(int number=1;number<=line;number++){
            System.out.print(number);
        }
        for(int space=line*2;space<=n*2;space++){
            System.out.print(" ");
        }
        for(int number=line;number>=1;number--){
            System.out.print(number);
        }
        System.out.println();
    }
    
    }
    }
    


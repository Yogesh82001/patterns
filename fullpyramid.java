import java.util.Scanner;

public class fullpyramid {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt();
        int mid=n/2; 
        int totalspace=mid;
        int totalstar=1;
        for(int line=1;line<=n;line++){
            for(int space=1;space<=totalspace;space++){
                System.out.print(".");

            }
            for(int star=1;star<=totalstar;star++){
                System.out.print("*");
            }
            if(line<mid){

                totalstar+=2;
                totalspace--;
                

            }
            else{
                totalstar-=2;
                totalspace++;
                
            }   
            System.out.println();

        }
}   } 


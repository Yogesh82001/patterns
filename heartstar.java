import java.util.Scanner;

public class heartstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n=sc.nextInt(); 
        //upper part
        
        for(int line=3;line<=n;line++){
            
            for(int space=0;space<n+1-line;space++){
                System.out.print(" ");
            }
            for(int star=0;star<2*line-1;star++){
                System.out.print("*");
            }
            for(int space=0;space<2*n-(2*line-1);space++){
                System.out.print(" ");
            }
            for(int star=0;star<2*line-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        String name="Panchal";
        n*=2;
        for(int line=1;line<=n;line++){
            for(int space=1;space<=line;space++){
                System.out.print(" ");
            }
            
            if(line==1){
                for(int star=1;star<=((n*2-(2*line-1))/2)+4;star++){
                    if(star==n/2){
                        System.out.print(name);
                    }
                    else
                {
                    System.out.print("*");
                }
            }

            }
            else{
                for(int star=1;star<=n*2-(2*line-1);star++){
                    System.out.print("*");
                }

            }
            System.out.println();
            
    }

        }
    }
    

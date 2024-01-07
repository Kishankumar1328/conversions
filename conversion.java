import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the km:");
        double meter=sc.nextInt();
        double km;
        double miles;
        km=meter*1000;
        miles=meter*1609;
        System.out.println("kM TO M:"+km);
        System.out.println("MILES TO M:"+miles);
        
        double ikm=meter/1000;
        double imiles=meter*0.00062;
        System.out.println("M TO KM:"+ikm);
        System.out.println("M TO MILES:"+imiles);
        
        
    }
}
import java.util.Scanner;
public class main2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount that need as change");
        double amount=sc.nextDouble();
        int thousands=0;
        int fivehundreds=0;
        int hundreds=0;
        int fifties=0;
        int tens=0;
        int fives=0;
        int ones=0;

        if (amount>=1000){
            thousands=(int)(amount/1000);
            amount=amount%1000;
            System.out.println("1000*"+thousands);
        }
        if (amount>=500){
            fivehundreds=(int)(amount/500);
            amount=amount%500;
            System.out.println("500*"+fivehundreds);
        }
        if (amount>=100){
            hundreds=(int)(amount/100);
            amount=amount%100;
            System.out.println("100*"+hundreds);
        }
        if (amount>=50){
            fifties=(int)(amount/50);
            amount=amount%50;
            System.out.println("50*"+fifties);
        }
        if (amount>=10){
            tens=(int)(amount/10);
            amount=amount%10;
            System.out.println("10*"+fives);
        }
        if (amount>=5);{
            fives=(int)(amount/5);
            amount=amount%5;
            System.out.println("5*"+fives);
        }
        if (amount>=1){
            ones=(int)(amount/1);
            amount=amount%1;
            System.out.println("1*"+ones);
        }
        System.out.println("amount that need as change");
    }
}
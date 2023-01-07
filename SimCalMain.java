import java.util.Scanner;

public class SimCalMain {
    public static void main(String[] args) {
        double fnum;
        double snum;

        SimCal c1 = new SimCal();
        System.out.println("If you need to summetion of two numbers, select 1");
        System.out.println("If you need to subtraction of two numbers, select 2");
        System.out.println("If you need to multiplication of two numbers, select 3");
        System.out.println("If you need to deveiatin of two numbers, select 4");
        System.out.println("If you need to square of number, select 5");
        Scanner select = new Scanner(System.in);
        System.out.println("Enter your selection number:");
        int num = select.nextInt();

        switch (num){
            case 1 :
                System.out.println("Enter your first number:");
                 fnum = select.nextDouble();
                System.out.println("Enter your second number:");
                 snum = select.nextDouble();
                c1.add(fnum,snum);
                break;
            case 2:
                System.out.println("Enter your first number:");
                 fnum = select.nextDouble();
                System.out.println("Enter your second number:");
                 snum = select.nextDouble();
                 c1.sub(fnum,snum);
                 break;
            case 3:
                System.out.println("Enter your first number:");
                fnum = select.nextDouble();
                System.out.println("Enter your second number:");
                snum = select.nextDouble();
                c1.mul(fnum,snum);
                break;
            case 4:
                System.out.println("Enter your first number:");
                fnum = select.nextDouble();
                System.out.println("Enter your second number:");
                snum = select.nextDouble();
                c1.dev(fnum,snum);
                break;
            case 5:
                System.out.println("Enter your first number:");
                fnum = select.nextDouble();
                c1.square(fnum);
                
            default:
                System.out.println("Oooohps!! you entered wrong selection number,Please enter correct selection number!!");


        }

    }
}


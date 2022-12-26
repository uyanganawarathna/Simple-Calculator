import java.util.Scanner;

public class SimCalMain {
    public static void main(String[] args) {
        double fnum;
        double snum;

        SimCal c1 = new SimCal();
        Scanner select = new Scanner(System.in);
        System.out.println("Enter selection number:");
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
            default:
                System.out.println("Oooohps!! you entered wrong selection number,Please enter correct selection number!!");


        }

    }
}


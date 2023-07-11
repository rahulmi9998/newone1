import java.util.Scanner;

class Atm{
    static void atmTransation(int balance,int pin) {
        int count=1;
        Scanner s = new Scanner(System.in);

        System.out.println("if you want to withdraw amount press:1");
        System.out.println("if you want to credit amount press:2");
        System.out.println("if you want to update pin press:3");
        int x = s.nextInt();
        switch (x) {
            case 1:
                System.out.println("enter the amount you want to withdraw");
                int withdrawalamount = s.nextInt();
                System.out.println("enter your pin");
                int checkpin=s.nextInt();
                if(checkpin==pin) {
                    if (withdrawalamount <= balance) {
                        System.out.println(withdrawalamount + " is debited from your account");
                        balance = balance - withdrawalamount;
                    } else
                        System.out.println("you don't have sufficient balance in your account");
                }
                else
                    System.out.println("enter the right pin");
                break;
            case 2:
                System.out.println("enter the amount you want to credit");
                int creditamount = s.nextInt();
                balance = balance + creditamount;
                System.out.println("your account has been credited with " + creditamount + " your updated balance is " + balance);
                break;
            case 3:
                System.out.println("enter your pin");
                checkpin=s.nextInt();
                if(checkpin==pin){
                    System.out.println("enter your new pin:");
                    pin = s.nextInt();
                    System.out.println("your pin has been updated successfully");}
                else
                    System.out.println("enter the right pin");

                break;
            default:
                System.out.println("please enter right number");
        }


        System.out.println("if you want to exit press:1");
        System.out.println("if you want to make any other change press:2");
        int a=s.nextInt();
        switch(a){
            case 1:
                System.out.println("thanks for visiting us");
                break;
            case 2:

                atmTransation(balance,pin);
        }
    }

    public static void main(String[] args) {
        int balance=10000;
        int pin=0000;
        atmTransation(balance,pin);

    }
}

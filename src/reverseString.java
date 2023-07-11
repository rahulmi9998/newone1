import java.util.Scanner;

class Test{
    static String reverseString(String str){
        int n=str.length();
        String str1="";
        for(int i=n-1;i>=0;i--){
            str1=str1+str.charAt(i);

        }
        return str1;
    }
    static  boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i<=n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="rahul";
        String result=reverseString(str);
        System.out.println(result);
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=s.nextInt();
        boolean result1=checkPrime(n);
        System.out.println(result1);


    }
}
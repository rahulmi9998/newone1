import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class DynamicCalender {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year: ");
        int y = s.nextInt();
        System.out.println("enter the month");
        int m = s.nextInt();
        if(m>12){
            System.out.println("invalid month");
            for(int i=1;i<=2;i++){
                System.out.println("enter month again: ");
                m=s.nextInt();
                if(m<13)
                    break;
                if(i==2){
                    System.out.println("too many attempts");
                    System.exit(0);
                }
            }

        }
        System.out.println("enter the value from where you want to start you calender");
        String dday=s.nextLine();
        String[] days={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        String[] month={"","January","February","March","April","May","June","July","August","September","October","November","December"};

        int[] dayinmonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int max=0;
        if(m==2){
            if(y%4==0&&y%400==0){
                max=29;
            }
        }
        else
            max=dayinmonth[m];
        int start;
        for(int i=0;i<days.length();i++){
            if(days[i].euals(dday)){
                start=i;
                break;

            }
        }
        System.out.println(start);
        LocalDate  ld=LocalDate.of(y,m,01);
        java.time.DayOfWeek dow=ld.getDayOfWeek();
        int n= dow.getValue();
        System.out.println(month[m]+" "+y);

        if(n!=7) {
            for (int i = 1; i <= n; i++) {
                System.out.print("    ");
            }
        }

        for(int i=1;i<=max;i++)
        {

            if(i<=9){
                System.out.print(0+""+i+"  ");
            }
            else
                System.out.print(i+"  ");
            if((i+n)%7==0)
                System.out.println();
        }
    }
}

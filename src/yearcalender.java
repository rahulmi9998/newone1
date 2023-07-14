import java.time.LocalDate;
import java.util.Scanner;

class yearcalender {
     static void month(int n,int max){
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
     static int currentDate(int year,int month,int day){
         LocalDate ld=LocalDate.of(year,month,01);
         java.time.DayOfWeek dow=ld.getDayOfWeek();
         int n= dow.getValue();
         return n;

     }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the year: ");
            int y = s.nextInt();
            String[] month={"","January","February","March","April","May","June","July","August","September","October","November","December"};

            int[] dayinmonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
            for(int k=1;k<month.length;k++){
                int n=currentDate(y,k,01);
                int max=0;
                if(k==2){
                    if(y%4==0&&y%400==0){
                        max=29;
                    }
                    else
                        max=dayinmonth[k];

                }
                else
                    max=dayinmonth[k];

                System.out.println(month[k]+" "+y);

                System.out.println("sun "+"mon "+"tue "+"wed "+"thu "+"fri "+"sat ");
                if(n!=7) {
                    for (int i = 1; i <= n; i++) {
                        System.out.print("    ");
                    }
                }
                month(n,max);
                System.out.println();
                System.out.println("*************************");
            }
        }
    }



import java.util.Scanner;
class OodEvenOccurence {
    static void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int b=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=b;
                }
            }
        }
    }
    static void checkOddEven(int[] arr,int a){
        sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if(a%2==count%2){
                System.out.println(arr[i]);
            }
            i=i+count-1;
        }
    }
     public static void main(String[] args) {
         int[] arr = {1, 1, 1, 3, 2, 2};
         Scanner s = new Scanner(System.in);
         System.out.println("if you want to print odd occurence press: 1");
         System.out.println("if you want to print even occurences press :2");
         int x = s.nextInt();
         checkOddEven(arr,x);
     }
}

import java.util.Locale;

class Manipulate {
    static String manipulateString(String[] arr) {
        int n = arr.length;
        String str="";
        for (int i = 0; i < n; i++) {
            if (arr[i].length() <= 2) {
                arr[i] = "";
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i].length()>1){
                if(i%2==0){
                    str=str+arr[i].toUpperCase()+"";
                }
                else
                    str=str+arr[i]+ " ";
            }
        }

        return str;

    }
    public static void main(String[] args) {
        String str="my name is rahul mittal";
        String[] arr=str.split(" ");
        String result=manipulateString(arr);
        System.out.println(result);
    }
}

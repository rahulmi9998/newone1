import java.util.HashSet;

class duplicate {
    static void duplicateElement(int[] arr){
        int n=arr.length;
        HashSet hs=new HashSet();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3,1,2,3,4,5};
        duplicateElement(arr);

    }
}

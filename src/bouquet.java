import java.util.*;

class Flowers {
    public static void main(String[] args) {

        HashMap<String, HashSet<String>> bouquet1 = new HashMap<>();
        HashMap<String, HashSet<String>> bouquet2 = new HashMap<>();

        HashSet<String> roses = new HashSet<>(Arrays.asList("red", "yellow", "white"));
        HashSet<String> tulip = new HashSet<>(Arrays.asList("white", "purple"));
        HashSet<String> lily = new HashSet<>(Arrays.asList("white"));

        bouquet1.put("rose", roses);
        bouquet1.put("tulip", tulip);
        bouquet1.put("lily", lily);

        HashSet<String> roses2 = new HashSet<>(Arrays.asList("pink", "orange"));
        HashSet<String> chrysanthamum = new HashSet<>(Arrays.asList("yellow"));
        HashSet<String> balsum = new HashSet<>(Arrays.asList("pink"));

        bouquet2.put("rose", roses2);
        bouquet2.put("chrysanthamum", chrysanthamum);
        bouquet2.put("balsum", balsum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flower : ");
        String flower = sc.nextLine().toLowerCase();
        System.out.println("Enter colour : ");
        String colour = sc.nextLine().toLowerCase();
        if (bouquet1.containsKey(flower) && bouquet1.get(flower).contains(colour)) {
            System.out.println("bouquit1");
        } else if (bouquet2.containsKey(flower) && bouquet2.get(flower).contains(colour)) {
            System.out.println("bouquit2");
        } else {
            System.out.println("Not available!");
        }
    }

}



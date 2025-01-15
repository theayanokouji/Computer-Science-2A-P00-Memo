public class Twang {
    public static void main(String[] args) {
        // for loop
        // explicit casting (manual)
        // implicit casting (automatic)
        // primitive(fundamental) type has a wrapper class
        /*
        int - Integer
        short - Short.parseShort(string)
        double - Double.parseDouble(string)
        float - Float
         */
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i = i + 1) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("HARP");
            } else if (i % 3 == 0) {
                System.out.println("BANJOR");
            } else if (i % 5 == 0) {
                System.out.println("GUITAR");
            } else {
                System.out.println(i);
            }
        }
    }
}

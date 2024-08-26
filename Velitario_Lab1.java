 public class HalfDiamondPattern {
    public static void main(String[] args) {
        int size = 5;

        // Print the topmost asterisk line
        System.out.println("*");

        // Upper half of the pattern, including the middle row
        for (int row = 1; row <= size; row++) {
            // Print the leading asterisk
            System.out.print("*");

            // Print increasing numbers from 1 to 'row'
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }

            // Print decreasing numbers from 'row-1' to 1
            for (int num = row - 1; num >= 1; num--) {
                System.out.print(num);
            }

            // Print the trailing asterisk and move to the next line
            System.out.println("*");
        }

        // Lower half of the pattern, excluding the middle row
        for (int row = size - 1; row >= 1; row--) {
            // Print the leading asterisk
            System.out.print("*");

            // Print increasing numbers from 1 to 'row'
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }

            // Print decreasing numbers from 'row-1' to 1
            for (int num = row - 1; num >= 1; num--) {
                System.out.print(num);
            }

            // Print the trailing asterisk and move to the next line
            System.out.println("*");
        }

        // Print the bottommost asterisk line
        System.out.println("*");
    }
 }
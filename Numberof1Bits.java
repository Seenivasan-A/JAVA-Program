import java.util.Scanner;

class Numberof1Bits {
    public static int hammingWeight(int n) {
            int ans = 0; 
            while (n > 0) {
                n = n & (n - 1); 
                ans++;         
            }
    
            return ans; 
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int n = scanner.nextInt();
    
            Numberof1Bits solution = new Numberof1Bits();
            int result = Numberof1Bits.hammingWeight(n);
        
        System.out.println("The Hamming weight of " + n + " is: " + result);
        scanner.close();
    }
}

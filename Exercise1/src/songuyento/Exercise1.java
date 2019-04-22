package songuyento;
import java.util.Scanner;
public class Exercise1 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			  System.out.print("Nhap mot so n = ");
		        int n = input.nextInt();
		        System.out.printf("Cac so nguyen to nho hon %d la: \n", n);
		        if (n >= 2) {
		            System.out.print(2);
		        }
		        for (int i = 3; i < n; i+=2) {
		            if (laSoNguyenTo(i)) {
		                System.out.print(" " + i);
		            }
		        }
		    }

		public static boolean laSoNguyenTo(int n) {
		   if (n < 2) {
		      return false;
		   }
		   	int m = (int) Math.sqrt(n);
		   	for (int i = 2; i <= m; i++) {
		      if (n % i == 0) {
		        return false;
		      }
		   	}
		   return true;
			}
}

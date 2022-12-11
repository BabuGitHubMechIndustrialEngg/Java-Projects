package sort;

/**
 * Reference: Java in Tamil - Bubble Sort in Detail for Beginners - Muthuramalingam - Payilagam
 * https://youtu.be/Sa0qPLitjtU
 * 
 * @author M.BABU
 */
public class BubbleSort {
    public static void main(String[] args) {
        /* Input: 50 40 30 20 10
         Output : 10 20 30 40 50   
        */
        //int[] a = new int[] {50, 40, 30, 20, 10};
        int[] a = new int[] {20,10,40,30,60,50};
        
        System.out.println("Before sort ...");
        for(int j=0;j<a.length;j++) {
            System.out.println("a["+j+"]="+a[j]);
        }
        
        for(int j=1;j<a.length;j++) {
            for(int i=0;i<a.length-j; i++) {
                if(a[i+1]<a[i]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        
        System.out.println("After sort ...");
        for(int j=0;j<a.length;j++) {
            System.out.println("a["+j+"]="+a[j]);
        }
    }
    
}

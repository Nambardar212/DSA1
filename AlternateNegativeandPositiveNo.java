import java.util.Arrays;
import java.util.Scanner;

public class AlternateNegativeandPositiveNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int neg=0,pos=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            {
                pos++;
            }
            else
            {
                neg++;
            }
        }
        Arrays.sort(a);

        if (neg <= pos) {
            fill1(a, neg);
        }
        else {
           reverse(a, n);
            fill2(a, pos);
       }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
     public static void fill1(int []a,int neg){
         if (neg % 2 == 1) {
             for (int i = 0; i < neg; i += 2) {
                 int c = a[i];
                 int d = a[i + neg];
                 int temp = c;
                 a[i] = d;
                 a[i + neg] = temp;
             }
         }
         else {
             for (int i = 0; i <= neg; i += 2) {
                 int c = a[i];
                 int d = a[i + neg - 1];
                 int temp = c;
                 a[i] = d;
                 a[i + neg - 1] = temp;
             }
         }
     }
    static void reverse(int a[], int n)
    {
        int i, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
    static void fill2(int a[], int pos)
    {
        if (pos % 2 == 1) {
            for (int i = 1; i < pos; i += 2) {
                int c = a[i];
                int d = a[i + pos];
                int temp = c;
                a[i] = d;
                a[i + pos] = temp;
            }
        }
        else {
            for (int i = 1; i <= pos; i += 2) {
                int c = a[i];
                int d = a[i + pos - 1];
                int temp = c;
                a[i] = d;
                a[i + pos - 1] = temp;
            }
        }
    }
}

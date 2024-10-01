import java.util.Scanner;

public class BCSE103E_ASSIGNMENT__01_10_24__PRG1{
    static double ComputeArea(int base, int height){
        return base * height;
    }
    static double ComputeArea(int top, int bottom, int height){
        return height * ((top + bottom) / 2);
    }
    static double ComputeArea(int radius){
        return 3.14 * radius * radius;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        int height1 = sc.nextInt();
        int top = sc.nextInt();
        int bottom = sc.nextInt();
        int radius = sc.nextInt();

        System.out.println();
        System.out.println(ComputeArea(base, height));
        System.out.println(ComputeArea(height1, top, bottom));
        System.out.printf("%.2f", ComputeArea(radius));
    }
}
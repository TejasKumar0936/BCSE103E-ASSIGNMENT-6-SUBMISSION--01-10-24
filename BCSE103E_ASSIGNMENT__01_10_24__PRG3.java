import java.util.Scanner;

class Ingredient {
    String name;
    double quantity;
    Ingredient(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

public class BCSE103E_ASSIGNMENT__01_10_24__PRG3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        double radius = sc.nextDouble();
        int numIng = sc.nextInt();
        
        Ingredient[] ingredients = new Ingredient[numIng];
        for (int i = 0; i < numIng; i++) {
            String name = sc.next();
            double quantity = sc.nextDouble();
            ingredients[i] = new Ingredient(name, quantity);
        }
        int numKIng = sc.nextInt();
        String[] kIngNames = new String[numKIng];
        double[] kIngCosts = new double[numKIng];
        for (int i = 0; i < numKIng; i++) {
            kIngNames[i] = sc.next();
            kIngCosts[i] = sc.nextDouble();
        }
        double area = 3.14 * radius * radius;
        double totalCost = 0;
        for (Ingredient ing : ingredients) {
            for (int i = 0; i < numKIng; i++) {
                if (kIngNames[i].equals(ing.name)) {
                    totalCost += (ing.quantity * area / 100) * kIngCosts[i];
                    break;
                }
            }
        }
        
        totalCost += (type == 0) ? 50 : 100;
        System.out.println();
        System.out.printf("%.2f%n", totalCost);
    }
}
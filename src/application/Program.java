package application;

import Services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //nesse caso precisaria criar mais de uma classe "igual" e usar um tipo especifico pois não tem reuso.
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}

package application;

import Services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //Usando Object tem problema de ter que fazer o casting e problema de seguranca de tipos(Type safety)//

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        ps.addValue("Maria");

        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        int x = (int) ps.first();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}

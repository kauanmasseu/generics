package application;

import Services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*Usando tipo Generics não precisa fazer casting e o compilador não deixa acontecer o problema
        de seguranca de tipo(Type safety)*/

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        int x = ps.first();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}

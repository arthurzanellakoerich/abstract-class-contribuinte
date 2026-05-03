package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.println("Numero do contribuintes:");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.print("Pessoa fisica(f) ou Pessoa juridica(j)? ");
            char pessoa = sc.next().charAt(0);
            if (pessoa == 'f'){
                System.out.println("Nome:");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Renda anual:");
                double renda = sc.nextDouble();
                System.out.println("Gastos com saúde:");
                double gastoSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, renda, gastoSaude));
            } else {
                System.out.println("Nome:");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Renda anual:");
                double renda = sc.nextDouble();
                System.out.println("Numero de funcionarios:");
                int numFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, numFuncionarios));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for (Contribuinte c : list) {
            System.out.println(c.getNome() + ": $ " + String.format("%.2f", c.tax()));
        }
        double totalTax = 0.0;
        for (Contribuinte c : list){
            totalTax += c.tax();
        }

        System.out.println();
        System.out.println("Total taxes: $ " + String.format("%.2f", totalTax));

    }
}

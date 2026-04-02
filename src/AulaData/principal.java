package AulaData;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class principal {

    public static void calcularIdade(int dia, int mes, int ano) {

        try {
            LocalDate nascimento = LocalDate.of(ano, mes, dia);
            LocalDate hoje = LocalDate.now();

            if (nascimento.isAfter(hoje)) {
                System.out.println("Erro: Ano invalido!");
                return;
            }

            Period idade = Period.between(nascimento, hoje);

            int anos = idade.getYears();
            int meses = idade.getMonths();
            int dias = idade.getDays();

            System.out.println("\nVocê tem: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

        } catch (DateTimeException e) {
            System.out.println("\nErro: Dia ou Mês inválido!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de idade. ");
        System.out.println("Data de Nascimento. ");
        System.out.print("Dia : ");
        int dia = sc.nextInt();

        System.out.print("Mês : ");
        int mes = sc.nextInt();

        System.out.print("Ano : ");
        int ano = sc.nextInt();

        calcularIdade(dia, mes, ano);

        sc.close();
    }
}
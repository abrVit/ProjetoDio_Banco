package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {

    public static void main(String[] args) {
        try{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: w");
        double altura = sc.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("Campo digitado incorretamente");
        }
    }

}

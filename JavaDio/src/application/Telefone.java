package application;

import java.util.Random;

public class Telefone {

    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("application.Telefone tocando");
        }while(!tocando());
        System.out.println("Alo!");
    }

    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return atendeu;
    }

}
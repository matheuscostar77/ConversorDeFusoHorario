package application;

import entities.MetodosHorario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MetodosHorario fuso = new MetodosHorario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de fuso horário");
        System.out.println("O horário e dia atual onde você está é: " + fuso.getHorarioLocal());

        System.out.println("\nDigite um país onde deseja ver o fuso horário: ");
        String paises = sc.next();
        while (fuso.acharFuso(paises) == false) {
            System.out.println("\nDigite um país onde deseja ver o fuso horário: ");
            paises = sc.next();
        }
        System.out.println(fuso.getMostrarFuso());


    }
}

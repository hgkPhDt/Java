package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Philip Torres<br>
 * Programa que calcula a idade de uma pessoa.<br>
 * Descrição do exercício:
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat date = new SimpleDateFormat("yyyy");
        Date today = new Date();
        String thisYearString = date.format(today);

        /**
         *  Apartir desse ponto, inicia a obtenção dos dados do usuário. <br>
         *  <br>
         *  Pede para o usuário inserir o dia do seu aniversário. Se o usuário
         *  inserir um número inválido como 0 ou 32+, o programa pedirá para
         *  refazer a operação. Assim como em mês e ano.
         */
        do{
            System.out.print("Your day of birthday: ");
            Year.setDayBirthday(scan.nextInt());

            if(Year.getDayBirthday() < 1 || Year.getDayBirthday() > 30){
                System.out.println("This day not exists.");
                Year.setDayBirthday(0);
            }
        }while(Year.getDayBirthday() == 0);

        do{
            System.out.print("Your mounth of birthday: ");
            Year.setMounthBirthday(scan.nextInt());

            if(Year.getMounthBirthday() < 1 || Year.getMounthBirthday() > 12){
                System.out.println("This mounth not exists.");
                Year.setMounthBirthday(0);
            }
        }while(Year.getMounthBirthday() == 0);

        do{
            System.out.print("Your year of birthday: ");
            Year.setYearBirthday(scan.nextInt());

            int thisYearInt = Integer.parseInt(thisYearString);
            if(Year.getYearBirthday() > thisYearInt){
                System.out.println("Are you from the future? ");
                Year.setYearBirthday(0);
            }
        }while(Year.getYearBirthday() == 0);

        /**
         * Exibe na tela o cálculo dos anos, meses e dias além dos dias totais de vida
         * do usuário.
         */
        Year.calcTime();

        /**
         * Fecha o scanner.
         */
        scan.close();
    }
}


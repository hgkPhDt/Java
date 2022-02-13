package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Philip Torres<br>
 * Data: 09/02/2022<br><br>
 * Descrição: Fazer um programa que leia uma data de aniversário e calcule o tempo de vida do usuário,
 * imprimindo de forma linear. Exemplo: 03/12/1996 - 25 anos, 2 meses e 6 dias = total 9250 dias.
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with the date of your birthday: ");
        String birthday = sc.next();

        int dayBirthday = Integer.parseInt(birthday.substring(0, 2));
        int monthBirthday = Integer.parseInt(birthday.substring(3, 5));
        int yearBirthday = Integer.parseInt(birthday.substring(6, 10));

        calc(dayBirthday,monthBirthday,yearBirthday);

        sc.close();
    }

    public static void calc(int dayBirthday, int monthBirthday, int yearBirthday){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        final String CURRENT = sdf.format(currentDate);

        int day = Integer.parseInt(CURRENT.substring(0, 2));
        int month = Integer.parseInt(CURRENT.substring(3, 5));
        int year = Integer.parseInt(CURRENT.substring(6, 10));
        int d = day;

        year -= yearBirthday;
        day -= dayBirthday;

        if(day < 0){
            day = 0;
            day = (30 - dayBirthday) + d;
            month--;
        }

        if(month < monthBirthday){
            year--;
        }else{
            month--;
        }

        System.out.println(year+" years, "+month+" months and "+day+" days = "+year*365+" days.");
    }
}

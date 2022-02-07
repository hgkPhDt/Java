package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Philip Torres
 * Classe responsável pelo armazenamento da data de aniversário do usuário, além de efetuar
 * o cálculo do tempo de vida.
 */

public class Year {

    /**
     * Obtém o ano, mês e dia atual. É convertido para String e posteriormente convertido para um número
     * inteiro.
     */
    static SimpleDateFormat date = new SimpleDateFormat("yyyy");
    static SimpleDateFormat dateM = new SimpleDateFormat("MM");
    static SimpleDateFormat dated = new SimpleDateFormat("dd");

    static Date today = new Date();

    static String yearString = date.format(today);
    static String mounthString = dateM.format(today);
    static String dayString = dated.format(today);

    static int yearCurrent = Integer.parseInt(yearString);
    static int mounthCurrent = Integer.parseInt(mounthString);
    static int dayCurrent = Integer.parseInt(dayString);

    /**
     * Define a quantidade de dias que tem um ano.
     */
    static final int DAY = 365;

    /**
     * Armazena a data de aniverśario do usuário em partes.
     */
    private static int yearBirthday;
    private static int mounthBirthday;
    private static int dayBirthday;

    /**
     * Um simples construtor.
     */
    public Year() {
    }

    /**
     * Obtém o ano de aniverśario do usuário.
     * @return Retorna o ano de aniverśario do usuário.
     */
    public static int getYearBirthday() {
        return yearBirthday;
    }

    /**
     * Introduz na variável 'yearBirthday' o valor do ano de nascimento do usuário.
     * @param yearBirthday Ano de aniversário do usuário.
     */
    public static void setYearBirthday(int yearBirthday) {
        Year.yearBirthday = yearBirthday;
    }

    /**
     * Obtém o mês de nascimento do usuário.
     * @return Retorna o mês de nascimento do usuário.
     */
    public static int getMounthBirthday() {
        return mounthBirthday;
    }

    /**
     * Introduz na variável 'mounthBirthday' o valor do mês de nascimento do usuário.
     * @param mounthBirthday Mês de aniversário do usuário.
     */
    public static void setMounthBirthday(int mounthBirthday) {
        Year.mounthBirthday = mounthBirthday;
    }

    /**
     * Obtém o dia de nascimento do usuário.
     * @return Retorna o dia de nascimento do usuário.
     */
    public static int getDayBirthday() {
        return dayBirthday;
    }

    /**
     * Introduz na variável 'dayBirthday' o dia de nascimento do usuário.
     * @param dayBirthday Dia do aniversário do usuário.
     */
    public static void setDayBirthday(int dayBirthday) {
        Year.dayBirthday = dayBirthday;
    }

    /**
     * Efetua o cálculo da data de nascimento com a data atual e imprime na tela o resultado.<br><br>
     * idade = anoAtual - anoAniversário<br>
     * mes = mesAtual<br>
     * dia = diaAtual - diaAniversário<br>
     * totalDias = 365 * idade<br><br>
     * <br>
     * Se mesAtual for menor que mesAniversário.<br>
     * Então, decremente uma unidade de idade.<br>
     * Se mesAniversário for menor que o mesAtual.<br>
     * Então, decremente uma unidade de mes.<br>
     */
    public static void calcTime(){

        int y = yearCurrent - yearBirthday;
        int m = mounthCurrent;
        int d = dayCurrent - dayBirthday;
        int total = DAY * y;

        if(mounthCurrent < mounthBirthday){
            y--;
        }else{
            m--;
        }

        System.out.println("You live "+y+" years "+ m +" mounths and "+d+" days = "+total+" total days");
    }
}


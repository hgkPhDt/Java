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
    static String monthString = dateM.format(today);
    static String dayString = dated.format(today);

    static int yearCurrent = Integer.parseInt(yearString);
    static int monthCurrent = Integer.parseInt(monthString);
    static int dayCurrent = Integer.parseInt(dayString);

    /**
     * Define a quantidade de dias que tem um ano.
     */
    static final int YEAR = 365;
    static final int MONTH = 30;

    /**
     * Armazena a data de aniverśario do usuário em partes.
     */
    private static int yearBirthday;
    private static int monthBirthday;
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
    public static int getMonthBirthday() {
        return monthBirthday;
    }

    /**
     * Introduz na variável 'monthBirthday' o valor do mês de nascimento do usuário.
     * @param monthBirthday Mês de aniversário do usuário.
     */
    public static void setMonthBirthday(int monthBirthday) {
        Year.monthBirthday = monthBirthday;
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
        int m = monthCurrent;
        int d = dayCurrent - dayBirthday;

        /**
         * Corrigido o problema quando o dia do aniversariante é superior ao dia atual, qual apresentava
         * um dia negativo. Agora foi colocado um cálculo que consiste em subtrair o valor do dia de
         * nascimento com o número de dias do mês que nasceu, e somar o dia atual com o resultado da
         * subtração.
         */
        if(d < 1){
            d = (30 - dayBirthday) + dayCurrent;
        }

        int total = YEAR * y;

        if(monthCurrent < monthBirthday){
            y--;
        }else{
            m--;
        }

        System.out.println("You live "+y+" years "+ m +" months and "+d+" days = "+total+" total days");
    }
}


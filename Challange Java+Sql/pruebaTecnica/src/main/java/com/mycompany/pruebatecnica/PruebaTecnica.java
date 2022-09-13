/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebatecnica;
import java.util.Scanner;
/**
 *
 * @author Tomas
 */
public class PruebaTecnica {
    
    
    public static void main(String[] args) {
        /* Ingrese el nombre del torneo */
       Scanner sc0= new Scanner (System.in);
       System.out.println ("Ingrese el nombre del torneo: ");
       String torneo = sc0.nextLine();
       System.out.println ("Torneo a jugar: " + torneo);
        
        
        /* Jugador 1 */
       Scanner sc = new Scanner (System.in);
       System.out.println ("Ingrese el nombre del jugador 1: ");
       String jugador1 = sc.nextLine();
       System.out.println ("El jugador 1  es: " + jugador1);
       
           /* Jugador 2 */
       Scanner sc2= new Scanner (System.in);
       System.out.println ("Ingrese el nombre del jugador 2: ");
       String jugador2 =sc2.nextLine();
       System.out.println ("El jugador 2 es: " + jugador2);
       
       /* Cantidad de Sets a jugar */
       
       int sets;
       Scanner sc3= new Scanner (System.in);
       System.out.println ("Ingrese la cantidad de sets a jugar (Valores permitidos 3 y 5): ");
       sets = sc3.nextInt();
       while (sets != 3 && sets != 5 ){
            System.out.println ("Valor Incorrecto. Solo se pueden jugar partidos de 3 o 5 sets.Ingrese nuevamente la cantidad de sets a jugar: ");
            sets = sc3.nextInt();
       
       }
       
       System.out.println ("La cantidad de sets a jugar es de: "+ sets);
        
       /* Probabilidad de que cada jugador gane el partido(tiene que ir del 1 al 100 ) */
       
       /* JUGADOR 1: Porcentaje de victoria */
       
       int porc_jugador1;
   
       Scanner sc4 = new Scanner (System.in);
       System.out.println("Ingrese el porcentaje del victoria del jugador 1 (VALORES ADMITIDOS ENTRE 1 Y 100) ");
       porc_jugador1 = sc4.nextInt();
       while (porc_jugador1 < 1 || porc_jugador1 > 100){
            System.out.println ("Valor Incorrecto! Solo se aceptan valores entre 1 y 100. Vuelva a ingresar el valor: ");
            porc_jugador1 = sc4.nextInt();
       }
       
       System.out.println ("El porcentaje de victoria del jugador 1 es de: "+ porc_jugador1+"%");
       
       /* Jugador 2: Porcentaje de victoria */
       int porc_jugador2;
       
       porc_jugador2= 100 - porc_jugador1;
       System.out.println ("El porcentaje de victoria del jugador 2 es de: "+ porc_jugador2+"%");
       
       /*       int porc_jugador2;
       
       Scanner sc5 = new Scanner (System.in);
       System.out.println("Ingrese el porcentaje del victoria del jugador 2 (VALORES ADMITIDOS ENTRE 1 Y 100) ");
       porc_jugador2 = sc5.nextInt();
       while (porc_jugador2 < 1 || porc_jugador2 > 100){
            System.out.println ("Valor Incorrecto! Solo se aceptan valores entre 1 y 100. Vuelva a ingresar el valor: ");
            porc_jugador2 = sc5.nextInt();
       }
       
       System.out.println ("El porcentaje de victoria del jugador 2 es de: "+ porc_jugador2+"%");
       /*
       
       /* RONDA 1 (set1)*/
       System.out.println("Esta por comenzar la partida! ");
       int max = 100;
       int i;
       int probabilidadJugador1= 0;
       int probabilidadJugador2 = 0;
       int acumJugador1 = 0;
       int acumJugador2 = 0;
       int puntoJugador1= 0;
       int puntoJugador2 = 0;
       
       while (sets != 0){
           for (i=1; i<=max; i++){
           
            probabilidadJugador1 = (50 * porc_jugador1)/100;
            acumJugador1 = acumJugador1 + probabilidadJugador1;
            probabilidadJugador2 = (50 * porc_jugador1)/100;
            acumJugador2 = acumJugador2 + probabilidadJugador2;
            
            
           
           }
           if(acumJugador1> acumJugador2){
              puntoJugador1++;
              System.out.println ("El jugador 1: " +jugador1 + " anoto! El total es de "+ puntoJugador1+" puntos!");
              
           }
           else {           
               puntoJugador2++;
               System.out.println ("El jugador 2: " + jugador2 + " anoto! El total es de "+ puntoJugador2+" puntos!");
           }
           
         sets--;
       
       }
       
       if (puntoJugador1> puntoJugador2){
       System.out.println ("El jugador 1: "+jugador1 + " Gano el partido con un total de "+ puntoJugador1+" puntos!");
       
       }
       else{
       System.out.println ("El jugador 2: "+jugador2 + " Gano el partido con un total de "+ puntoJugador2+" puntos!");
       }
       
       
       
       
    }
}

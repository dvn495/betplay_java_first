package com.betplay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Equipo> equipos = new ArrayList<Equipo>();

        boolean isActive = true;

        while (isActive) {

            System.out.println("---LIGA BETPLAY---");
            System.out.println(" 1. REGISTRAR UN EQUIPO\n 2. REGISTRAR UNA FECHA\n 3. REPORTES\n 4. DETENER LA EJECUCION");

            int election = (Integer.parseInt(sc.nextLine()));
    
            if (election == 1) {
    
                boolean isActiveTeams = true;
    
                while (isActiveTeams) {
                    Equipo myEquipo = new Equipo();

                    System.out.println("MENU REGISTRO EQUIPO\n  NOMBRE DEL EQUIPO: ");
                    myEquipo.setName(sc.nextLine());

                    equipos.add(myEquipo);

                    /* for (Equipo equipo :equipos) {
                        System.out.println(equipo.getName());
                    } */

                    boolean isActiveTeamsSelection = true;

                    while (isActiveTeamsSelection) {
                        System.out.println("¿DESEA REGISTRAR OTRO EQUIPO?\n 1. SI\n 2. NO");
                        String electionTeams = sc.nextLine();
                        if (electionTeams.equals("1")) {
                            isActiveTeams = true;
                            isActiveTeamsSelection = false;
                        }
                        else if (electionTeams.equals("2")) {
                            isActiveTeams = false;
                            isActiveTeamsSelection = false;
                        } 
                        else {
                            System.out.println("OPCION NO VALIDA");
                        }  
                    }  
                }
                
            }
        }
    }
}
package com.betplay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla: " + e.getMessage());
        }
    } 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Equipo> equipos = new ArrayList<Equipo>();

        boolean isActive = true;

        while (isActive) {

            clearScreen();

            System.out.println("---LIGA BETPLAY---");
            System.out.println(" 1. REGISTRAR UN EQUIPO\n 2. REGISTRAR UNA FECHA\n 3. REPORTES\n 4. DETENER LA EJECUCION");


            try {

                int election = (Integer.parseInt(sc.nextLine()));


                switch (election) {

                    case 1 ->{

                        boolean isActiveTeams = true;
            
                        while (isActiveTeams) {
        
                            clearScreen();
        
                            Equipo myEquipo = new Equipo();
        
                            System.out.println("MENU REGISTRO EQUIPO\n  NOMBRE DEL EQUIPO: ");
                            myEquipo.setName(sc.nextLine());
                            myEquipo.setPartidos_jugados(0);
                            myEquipo.setPartidos_ganados(0);
                            myEquipo.setPartidos_perdidos(0);
                            myEquipo.setPartidos_empatados(0);
                            myEquipo.setGoles_favor(0);
                            myEquipo.setGoles_contra(0);
                            myEquipo.setTotal_puntos(0);
                            equipos.add(myEquipo);
                            System.out.println("\nEQUIPO REGISTRADO EXITOSAMENTE\n Presione cualquier tecla para continuar...");
                            sc.nextLine();

                            /* for (Equipo equipo :equipos) {
                                System.out.println(equipo.getName());
                            } */
        
                            boolean isActiveTeamsSelection = true;
        
                            while (isActiveTeamsSelection) {
                                clearScreen();
                                System.out.println("¿DESEA REGISTRAR OTRO EQUIPO?\n 1. SI\n 2. NO");
                                String electionTeams = sc.nextLine();
                                
                                try {
                                    int option = Integer.parseInt(electionTeams);
                                    
                                    switch (option) {
                                        case 1 -> {
                                            isActiveTeams = true;
                                            isActiveTeamsSelection = false;
                                        }
                                        case 2 -> {
                                            isActiveTeams = false;
                                            isActiveTeamsSelection = false;
                                        }
                                        default -> {
                                            System.out.println("OPCION NO VALIDA\n Presione cualquier tecla para continuar...");
                                            sc.nextLine();
                                        }
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Por favor, ingrese un número válido.\n Presione cualquier tecla para continuar...");
                                    sc.nextLine();
                                }
                            }
                        }  
                    }

                    case 2 -> {
                        clearScreen();
                        if (equipos.size() >= 2) {
                            boolean isActiveDate = true;

                            while (isActiveDate) {
                                
                            }
                        } else {
                            System.out.println("NO HAY SUFICIENTES EQUIPOS REGISTRADOS\n Presione cualquier tecla para continuar...");
                            sc.nextLine();
                        }

                    }

                    default -> {
                        System.out.println("OPCION NO VALIDA\n Presione cualquier tecla para continuar...");
                        sc.nextLine();
                    }
                }
                
            }   catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.\n Presione cualquier tecla para continuar...");
                sc.nextLine();
            }        
        }
    }
}

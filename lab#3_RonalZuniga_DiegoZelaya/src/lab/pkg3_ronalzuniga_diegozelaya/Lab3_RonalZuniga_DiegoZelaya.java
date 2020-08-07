package lab.pkg3_ronalzuniga_diegozelaya;

import java.util.Scanner;

public class Lab3_RonalZuniga_DiegoZelaya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user, pss;
        int op = 0;

        while (op != 3) {
            System.out.println("--BIENVENIDO--");
            System.out.println("1. Administrador");
            System.out.println("2. Persona");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.print("Seleccione una opcion para ingresar al sistema: ");
            op = sc.nextInt();
            while (op < 0 || op > 3) {
                System.out.print("Seleccione una opcion para ingresar al sistema: ");
                op = sc.nextInt();
            }
            if (op == 1) {
                System.out.print("Ingrese el usuario: ");
                user = sc.next();
                System.out.print("Ingrese la contraseña: ");
                pss = sc.next();
                if (user.equals("SUDO") && pss.equals("clau123")) {
                    int opt = 0;
                    while (opt != 5) {
                        System.out.println("Bienvenido, administrador");
                        System.out.println("1. Crear");
                        System.out.println("2. Modificar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Reporte");
                        System.out.println("5. Salir");
                        System.out.println("");
                        System.out.print("Seleccione una opcion: ");
                        opt = sc.nextInt();

                        switch (opt) {
                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                break;

                        }//fin del switch
                    }//fin del while
                }//fin de la decision

            }//fin de la decision 

            if (op == 2) {
                System.out.print("Ingrese su ID: ");
                int id = sc.nextInt();

                int opcion = 0;
                while (opcion != 3) {
                    System.out.println("1. Visualizar Pisos y Pruebas");
                    System.out.println("2. Visualizar Personas");
                    System.out.println("3. Salir");
                    System.out.println("");
                    System.out.print("Seleccione una opcion: ");
                    opcion = sc.nextInt();
                    while (opcion < 0 || opcion > 3) {
                        System.out.print("Seleccione una opcion: ");
                        opcion = sc.nextInt();
                    }
                    switch (opcion) {
                        case 1:
                            break;

                        case 2:
                            break;
                    }//fin del switch
                }//fin del while
            }//fin decision

        }//fin while
    }//fin del main
}//fin de la clase

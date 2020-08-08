package lab.pkg3_ronalzuniga_diegozelaya;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3_RonalZuniga_DiegoZelaya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String user, pss;
        int op = 0;
        //VARIABLES DE INGRESO
        String nombre;
        String posicion;
        int id;
        String estado;

        ArrayList<Personas> pers = new ArrayList();
        ArrayList<Piso> piso= new ArrayList();
        
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
                                char c = ' ';
                                while (c != 'd') {
                                    System.out.println("a. Agregar Persona");
                                    System.out.println("b. Agregar Piso");
                                    System.out.println("c. Agregar Prueba");
                                    System.out.println("d. Salir");
                                    System.out.print("Seleccione una opcion: ");
                                    c = sc.next().charAt(0);
                                    switch (c) {
                                        case 'a':
                                            System.out.print("Ingrese el nombre: ");
                                            nombre = sc.next();
                                            System.out.print("Ingrese la posicion: ");
                                            posicion = sc.next();
                                            id = (100) + r.nextInt(999);
                                            while (pers.get(pers.indexOf(nombre)).getId() == id) {
                                                id = (100) + r.nextInt(999);
                                            }
                                            System.out.print("Ingrese el estado: ");
                                            estado = sc.next();
                                            pers.add(new Personas(nombre, new Posiciones(), id, new Estado(estado)));
                                            break;

                                        case 'b':
                                            System.out.print("Ingrese el nivel: ");
                                            int nivel = sc.nextInt();
                                            while (nivel < 0 || nivel > 134) {
                                                System.out.print("Ingrese el nivel: ");
                                                nivel = sc.nextInt();
                                            }
                                            if (nivel >= 67) {
                                                piso.add(new Superiores(nivel));
                                            }else{
                                                piso.add(new Inferiores(nivel));
                                            }
                                            break;

                                        case 'c':
                                            Pruebas prueba = new Pruebas();
                                            prueba.Prueba();
                                            break;
                                    }
                                }
                                break;

                            case 2:
                                c = ' ';
                                while (c != 'd') {
                                    System.out.println("a. Modificar Persona");
                                    System.out.println("b. Modificar Piso");
                                    System.out.println("c. Modificar Prueba");
                                    System.out.println("d. Salir");
                                    System.out.print("Seleccione una opcion: ");
                                    c = sc.next().charAt(0);
                                    switch (c) {
                                        case 'a':
                                            System.out.print("Ingrese la posicion de la persona a modificar: ");
                                            int n = sc.nextInt();
                                            System.out.print("Ingrese el nombre: ");
                                            nombre = sc.next();
                                            System.out.print("Ingrese la posicion: ");
                                            posicion = sc.next();
                                            pers.get(n).setNombre(nombre);
                                            break;

                                        case 'b':
                                            System.out.print("Ingrese la posicion del piso a modificar: ");
                                            n = sc.nextInt();
                                            break;

                                        case 'c':
                                            Pruebas prueba = new Pruebas();
                                            prueba.Prueba();
                                            break;
                                    }
                                }
                                break;

                            case 3:
                                c = ' ';
                                while (c != 'c') {
                                    System.out.println("a. Eliminar Persona");
                                    System.out.println("b. Eliminar Piso");
                                    System.out.println("c. Salir");
                                    System.out.print("Seleccione una opcion: ");
                                    c = sc.next().charAt(0);
                                    switch (c) {
                                        case 'a':
                                            System.out.print("Ingrese la posicion de la persona a modificar: ");
                                            int n = sc.nextInt();
                                            pers.remove(n);
                                            break;

                                        case 'b':
                                            System.out.print("Ingrese la posicion del piso a modificar: ");
                                            n = sc.nextInt();
                                            piso.remove(n);
                                            break;
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("PERSONAS");
                                for (int i = 0; i < pers.size(); i++) {
                                    System.out.println(pers.get(i));
                                }
                                System.out.println("");
                                System.out.println("PISOS");
                                for (int i = 0; i < piso.size(); i++) {
                                    System.out.println(piso.get(i));
                                }
                                break;

                        }//fin del switch
                    }//fin del while
                }//fin de la decision

            }//fin de la decision 

            if (op == 2) {
                System.out.print("Ingrese su ID: ");
                int ident = sc.nextInt();
                
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
                            Pruebas prueba = new Pruebas();
                            String e = prueba.Prueba();
                            ArrayList<String> p = new ArrayList();
                            p.add(e);
                            for (int i = 0; i < p.size(); i++) {
                                System.out.println((i + 1) + ". " + p.get(i));
                            }
                            break;

                        case 2:

                            break;
                    }//fin del switch
                }//fin del while
            }//fin decision
        }//fin while
    }//fin del main
}//fin de la clase

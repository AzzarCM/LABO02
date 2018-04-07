/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Cristian Mundo00086917
 */
public class Menu {

    private static Menu menu;
    private ArrayList<String> proveedores;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void opciones() {
        System.out.println("-------- Menu --------");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Eliminar Producto");
        System.out.println("3. Modificar Producto");
        System.out.println("4. Cargar Producto");
        System.out.println("5. Descargar Producto");
        System.out.println("6. Descartar Producto");
        System.out.println("7. Salir");
    }
    
    public void mostrar() {
        proveedores = new ArrayList<>();
        int opcion = 4;
        String dato;
        Scanner leer = new Scanner(System.in);
        Productos BaseDatos = new Productos();

        while (opcion != 7) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Cual es el nombre de el proveedor?: ");
                        proveedores.add(leer.next());
                        BaseDatos.agregar();
                        break;
                    case 2:
                        System.out.println("Que producto desea eliminar del inventario?: ");
                        dato = leer.next();
                        BaseDatos.eliminar(dato);
                        break;
                    case 3:
                        System.out.println("Digite el producto a modificarse: ");
                        dato = leer.next();
                        BaseDatos.modificar(dato);
                        break;
                    case 4:
                        System.out.println("Ingrese el producto a cargar: ");
                        dato = leer.next();
                        BaseDatos.cargar(dato);
                        break;
                    case 5:
                        System.out.println("Ingrese el producto a descargar: ");
                        dato = leer.next();
                        BaseDatos.descargar(dato);
                        break;
                    case 6:
                        System.out.println("Ingrese el producto a descartar: ");
                        dato = leer.next();
                        BaseDatos.descartar(dato);
                    case 7:
                        System.out.println("HASTA LA PROXIMA, NOS VEMOS");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Ingrese un numero valido porfavor...");
                leer.nextLine();
            }
        }
    }
}

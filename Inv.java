/*
---------------------------------------MAIN------------------------------------------
 */
package productos;


import java.util.Scanner;
/**
 *
 * @author Cristian Mundo00086917
 */
public class Inv {
    private String Product;
    private int cant;
    private float price_dolares;
    
    public Inv() {};
    
    public Inv(String Product, int cant, float price_dolares){
        this.Product = Product;
        this.cant = cant;
        this.price_dolares = price_dolares;
    }
    
    public String getProducto(){
        return Product;
    }
    
    public void setProducto(String producto){
        this.Product = producto;
    }
    
    public int getCantidad(){
        return cant;
    }
    
    public void setCantidad(int cantidad){
        this.cant = cantidad;
    }
    
    public float getPrecio(){
        return price_dolares;
    }
    
    public void setPrecio(float precio){
        this.price_dolares = precio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username = "cristian", password = "mundo", username2, password2;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        
        
        Menu menu = Menu.getInstance();
        
        while(flag){
            System.out.println("su usuario es (cristian)  y su contrasehnia (mundo)");
            System.out.println("");
            System.out.println("Ingrese el usuario: ");
            username2 = leer.next();
            System.out.println("Ingrese la contrasena: ");
            password2 = leer.next();
            if(username.equals(username2) && password.equals(password2)){
                menu.mostrar();
                flag = false;
            }
            else{
                System.out.println("Datos erroneos");
            }
        }
        
        
        // TODO code application logic here
    }
    
}

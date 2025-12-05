import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de de productos a almacenar: ");
        int cantidadProductos = sc.nextInt();

        String[]nombresProductos = new String[cantidadProductos];
        int[]stockProductos = new int[cantidadProductos];

        int totalUnidades = 0;
        for(int i = 0; i<cantidadProductos;i++){
            sc.nextLine();
            System.out.print("Ingresa el nombre del producto " + (i+1) + " :\n>>>");
            nombresProductos[i] = sc.nextLine();
            System.out.print("Ingresa el stock del producto " + (i+1) + " :\n>>>");
            stockProductos[i] = sc.nextInt();
            totalUnidades += stockProductos[i];
        }
        int mayorStock = stockProductos[0];
        String mayorStockNombre = nombresProductos[0];
        int menorStock = stockProductos[0];
        String menorStockNombre = nombresProductos[0];
        for(int i = 0; i <cantidadProductos; i++){
            if(mayorStock<stockProductos[i]){
                mayorStock = stockProductos[i];
                mayorStockNombre = nombresProductos[i];
            }
            if(menorStock>stockProductos[i]){
                menorStock = stockProductos[i];
                menorStockNombre = nombresProductos[i];
            }
            if(stockProductos[i]<10){
                System.out.println("El producto " + nombresProductos[i] + " tiene un stock critico de: " + stockProductos[i]);
            }
        }
        System.out.println("El producto con mayor stock es " + mayorStockNombre + " con " + mayorStock + " unidades");
        System.out.println("El producto con menor stock es " + menorStockNombre + " con " + menorStock + " unidades");
        System.out.println("El total de unidades en el invetario es de: " + totalUnidades);
    }
}

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la lista de numeros enteros");
        int longitud = sc.nextInt();
        int[]numerosEnteros = new int[longitud];
        int numeroMayor = 0;
        int numeroMenor = 99999;
        int numeroTemporal = 0;
        int numerosPares = 0;
        int numerosImpares = 0;
        int sumaTotal = 0;
        double promedioGeneral = 0.0;
        for(int i =0;i<longitud;i++){
            System.out.println("Ingresa el valor entero Nº" + (i+1));
            numeroTemporal = sc.nextInt();
            if(numeroTemporal>numeroMayor){numeroMayor=numeroTemporal;}
            if(numeroTemporal<numeroMenor){numeroMenor=numeroTemporal;}
            if(numeroTemporal%2==0){
                numerosPares++;
            }else{
                numerosImpares++;
            }
            sumaTotal += numeroTemporal;
        }
        promedioGeneral = (double) sumaTotal /longitud;
        System.out.println("El numero mayor es: " + numeroMayor + "\nEl numero menor es: " + numeroMenor);
        System.out.println("Hay " + numerosImpares + " impares y " + numerosPares + " pares");
        System.out.println("La suma total de los numeros es: " + sumaTotal + " con un promedio de: " + promedioGeneral);
    }
}

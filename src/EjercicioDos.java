/*
* Ejercicio 2: Registro de Ventas
Desarrolla un sistema que:
Registre las ventas diarias de un mes (máximo 31 días).
Permita calcular el total de ventas del mes.
Encuentre el día con mayores ventas.
Calcule el promedio de ventas de fines de semana vs días laborales
* */

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args){
        int[]ventasDiarias = {4,3,56,8,3,10,20,43,5,1,42,4,54,23,52,34,52,34,24,15,9,54,49,62,75,31,54,15,95,82,91};
        int totalVentasMes = 0;
        int mayorVentaIndex = 0;
        int diaMayorVenta = 0;
        int contadorDiaLaborales = 0;
        double promedioDiasLaborales =0;
        int longitudDiaLaborales =0;
        double promedioFinesSemana = 0;
        int longitudFinesSemanas =0;
        for (int i = 0; i < ventasDiarias.length;i++){
            contadorDiaLaborales++;
            int ventaDiaria = ventasDiarias[i];
            totalVentasMes+=ventaDiaria;
            if(ventaDiaria>diaMayorVenta){diaMayorVenta= ventaDiaria; mayorVentaIndex = i;}
            if(contadorDiaLaborales == 6 || contadorDiaLaborales ==7){
                promedioFinesSemana+= ventaDiaria;
                longitudFinesSemanas++;
                if(contadorDiaLaborales==7){contadorDiaLaborales=0;}
            }else{
                longitudDiaLaborales++;
                promedioDiasLaborales+= ventaDiaria;
            }
        }
        System.out.println("El total de ventas en el mes fue de:" + totalVentasMes);
        System.out.println("El dia con mayor ventas fue el " + (mayorVentaIndex+1) + " con " + diaMayorVenta + " ventas");
        promedioFinesSemana = promedioFinesSemana/longitudFinesSemanas;
        promedioDiasLaborales = promedioDiasLaborales/longitudDiaLaborales;
        System.out.println("El promedio de ventas los dias laborales fue de: " + promedioDiasLaborales);
        System.out.println("El promedio de ventas los dias fines de semana fue de: " + promedioFinesSemana);
    }
}

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] horasTrabajadas = new int[14];
        int totalHorasT = 0;
        int horaPorDiaTrabajado = 0;
        int diasPorArribaDeOcho = 0;
        int menorCargaDia =999;
        int indexMenorCargaDia = 0;
        for(int i =0; i<horasTrabajadas.length;i++){
            System.out.println("Ingrese las horas trabajdas en el dia Nº" + (i+1));
            horaPorDiaTrabajado = sc.nextInt();
            totalHorasT+=horaPorDiaTrabajado;
            if(horaPorDiaTrabajado>8){diasPorArribaDeOcho++;}
            if(menorCargaDia>horaPorDiaTrabajado){menorCargaDia=horaPorDiaTrabajado;indexMenorCargaDia=i;}
        }
        System.out.println("Veces que se trabajo mas de 8 horas: " + diasPorArribaDeOcho);
        System.out.println("Total de horas trabajadas en estos 14 dias: " + totalHorasT);
        System.out.println("El dia con menor carga laboral fue: " + indexMenorCargaDia + " con " + (menorCargaDia+1) + " horas trabajadas");
    }
}

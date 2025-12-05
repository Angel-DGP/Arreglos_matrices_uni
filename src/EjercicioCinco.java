import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int reprobados = 0;
        double[] estudiantes = new double[10];
        for(int i = 0; i <10; i++){
            System.out.println("Ingrese la nota del estudiante " + ( i +1 ));
            estudiantes[i] = sc.nextDouble();
            if(estudiantes[i]<7){
                reprobados++;
            }
        }
        double[] estudiantesOrdenados = estudiantes.clone();
        for(int i = 0; i<(estudiantesOrdenados.length -1);i++){
            for(int j =0; j<(estudiantesOrdenados.length -1 - i); j++){
                if(estudiantesOrdenados[j] < estudiantesOrdenados[(j+1)]){
                    double temp = estudiantesOrdenados[j];
                    estudiantesOrdenados[j] = estudiantesOrdenados[(j+1)];
                    estudiantesOrdenados[(j+1)] = temp;
                }
            }
        }
        double mediana = estudiantesOrdenados[((estudiantes.length/2)-1)];
        int[]repetidos = new int[10];
        for(int i =0; i<estudiantes.length; i++){
            int repetidoUnidad = 0;
            for(int j = 0; j<estudiantes.length; j++){
                if(estudiantes[i] == estudiantes[j]){
                    repetidoUnidad++;
                    repetidos[i] = repetidoUnidad;
                }
            }
        }
        int indexModa = 0;
        int mayorRepetido = repetidos[0];
        for(int i = 0; i<estudiantes.length;i++) {
            if(mayorRepetido < repetidos[i]){
                mayorRepetido = repetidos[i];
                indexModa = i;
            }
        }
        int existeModa = 0;
        for(int j = 0; j<estudiantes.length; j++){
            if(mayorRepetido==repetidos[j]){
                existeModa++;
            }
        }
        if(existeModa>mayorRepetido){
            System.out.println("No existe moda en las notas de los estudiantes");
        }
        else{
            System.out.println("La moda en las notas de los estudiantes: " + estudiantes[indexModa]);
        }
        System.out.println("La mediana en las notas de los estudiantes es: " + mediana);
        System.out.println("El porcentaje de reprobados es: " + reprobados + "0%, y el de aprobados es: " + (10-reprobados) + "0% ");
        int rangoMenor = 0;
        int rangoMayor = 2;
        for(int i =0;i<(estudiantes.length/2);i++){
            if(rangoMayor==10){
                System.out.print("\nRANGO DE " + rangoMenor + " - " + rangoMayor + ": ");
            }else{
                System.out.print("\nRANGO DE " + rangoMenor + " - " + rangoMayor + ":  ");
            }
            for(int j =0;j<estudiantes.length;j++){
                if (estudiantes[j]<=rangoMayor && estudiantes[j] > rangoMenor) {
                    System.out.print("*");
                }
            }
            rangoMenor+=2;
            rangoMayor+=2;
        }
    }
}

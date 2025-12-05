import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de estudiantes ");
        int cantidadEstudiantes = sc.nextInt();
        String[] nombreEstudiantes = new String[cantidadEstudiantes];
        double[] notaEstudiantes = new double[cantidadEstudiantes];
        int inferioresATres = 0;
        double promedioNotas = 0.0;
        for(int i = 0; i<cantidadEstudiantes;i++){
            sc.nextLine();
            System.out.println("Ingresa el nombre del estudiante " + (i+1) + " :");
            nombreEstudiantes[i] = sc.nextLine();
            System.out.println("Ingresa la nota del estudiante " + (i+1) + " :");
            notaEstudiantes[i] = sc.nextDouble();
            if(notaEstudiantes[i]<3.0){
                inferioresATres++;
            }
            promedioNotas += notaEstudiantes[i];
        }
        String[] inferiorATresEstudiantes = new String[inferioresATres];
        double[] inferiorATresNotaEstudiantes = new double[inferioresATres];
        for(int i = 0; i < inferioresATres;i++){
            double nota = notaEstudiantes[i];
            String nombre = nombreEstudiantes[i];
            if(nota<3){
                inferiorATresEstudiantes[i]= nombre;
                inferiorATresNotaEstudiantes[i] = nota;
            }
            System.out.println("El estudiante: " + nombre + " su nota inferior de 3.0 fue: " + nota);
        }
        promedioNotas = promedioNotas/cantidadEstudiantes;
        System.out.println("El promedio general del curso fue: " + promedioNotas);
    }
}

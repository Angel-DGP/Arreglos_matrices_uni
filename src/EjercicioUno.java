public class EjercicioUno {
    public static void main(String[] args) {
        double[]temperaturas = {25.6, 14.5, 31.4, 39.1, 14.2, 10.9, 26.4};
        double temSum = 0.0;
        double temProm = 0.0;
        double diaCal = temperaturas[0];
        int indexCal = 0;
        double diaFrio = temperaturas[0];
        int indexFrio = 0;
        for(int i = 0; i < temperaturas.length; i++){
            double diaTemperatura = temperaturas[i];
            temSum+= diaTemperatura;
            if(diaTemperatura>diaCal){diaCal=diaTemperatura; indexCal = i;}
            if(diaTemperatura<diaFrio){diaFrio=diaTemperatura; indexFrio = i;}
        }
        temProm = temSum/temperaturas.length;
        System.out.println("EL PROMEDIO DE TEMPERATURAS ES: " + temProm);
        for(int i = 0; i < temperaturas.length; i++){
            double temp = temperaturas[i];
            if(temp>temProm){
                System.out.println("EL DIA " + (i+1) + " CON LA TEMPERATURA DE: " + temp + " ESTA SOBRE EL PROMEDIO");
            }
        }
        System.out.println("EL DIA MAS CALIENTE FUE EL " + (indexCal+1) + " CON UNA TEMPERATURA DE: " + diaCal);
        System.out.println("EL DIA MAS FRIO FUE EL " + (indexFrio+1) + " CON UNA TEMPERATURA DE: " + diaFrio);

    }
}
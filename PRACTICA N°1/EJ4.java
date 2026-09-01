import java.util.Scanner;

class Estadistica {
    private double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double val : this.datos) { suma += val; }
        return suma / this.datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaDiferencias = 0;
        for (double val : this.datos) {
            sumaDiferencias += Math.pow(val - prom, 2);
        }
        return Math.sqrt(sumaDiferencias / (this.datos.length - 1));
    }
}

public class TestEstadistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        Estadistica estadistica = new Estadistica(numeros);

        System.out.printf("El promedio es %.2f\n", estadistica.promedio());
        System.out.printf("La desviación estandard es %.5f\n", estadistica.desviacion());

        scanner.close();
    }
}
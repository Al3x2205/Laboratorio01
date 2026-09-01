import java.util.Scanner;

class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    public double getDiscriminante() { return (b * b) - (4 * a * c); }

    public double getRaiz1() {
        double disc = getDiscriminante();
        return disc < 0 ? 0 : (-b + Math.sqrt(disc)) / (2 * a);
    }

    public double getRaiz2() {
        double disc = getDiscriminante();
        return disc < 0 ? 0 : (-b - Math.sqrt(disc)) / (2 * a);
    }
}

public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);
        double disc = eq.getDiscriminante();

        if (disc > 0) {
            System.out.printf("La ecuación tiene dos raíces %f y %f\n", eq.getRaiz1(), eq.getRaiz2());
        } else if (disc == 0) {
            System.out.printf("La ecuación tiene una raíz %.0f\n", eq.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        scanner.close();
    }
}
import java.util.Scanner;

class EcuacionLineal {
    private double a, b, c, d, e, f;

    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a; this.b = b; this.c = c;
        this.d = d; this.e = e; this.f = f;
    }

    public boolean tieneSolucion() { return (a * d - b * c) != 0; }
    public double getX() { return (e * d - b * f) / (a * d - b * c); }
    public double getY() { return (a * f - e * c) / (a * d - b * c); }
}

public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = scanner.nextDouble(); double b = scanner.nextDouble();
        double c = scanner.nextDouble(); double d = scanner.nextDouble();
        double e = scanner.nextDouble(); double f = scanner.nextDouble();

        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX() + ", y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
        
        scanner.close();
    }
}
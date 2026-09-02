import java.util.Random; 

// Clase del objeto (sin la palabra 'public')
class Cronometro {
    private long inicia;
    private long finaliza;

    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }
    public long getInicia() { return this.inicia; }
    public long getFinaliza() { return this.finaliza; }
    
    public void inicia() { this.inicia = System.currentTimeMillis(); }
    public void detener() { this.finaliza = System.currentTimeMillis(); }
    
    public long lapsoDeTiempo() { return this.finaliza - this.inicia; }
}

// Clase principal que contiene el main (debe ser public)
public class TestCronometro {
    public static void main(String[] args) {
        int n = 100000;
        double[] numeros = new double[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            numeros[i] = rand.nextDouble() * 100000;
        }

        Cronometro cronometro = new Cronometro();
        
        cronometro.inicia();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[minIdx]) {
                    minIdx = j;
                }
            }
            double temp = numeros[minIdx];
            numeros[minIdx] = numeros[i];
            numeros[i] = temp;
        }
        cronometro.detener();

        System.out.println("El tiempo de ejecución de ordenamiento por selección es: " 
                + cronometro.lapsoDeTiempo() + " ms");
    }
}
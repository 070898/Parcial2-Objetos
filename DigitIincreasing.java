/**
 * Funciòn que devuelve 1 si su argumento es un aumento de digitos (DigitIncreasing).
 */

/**
 * @author Alison Juliana López C.
 */

public class DigitIncreasing {

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7)); //verdadera
        System.out.println(isDigitIncreasing(36));//verdadera
        System.out.println(isDigitIncreasing(984));//verdadera
        System.out.println(isDigitIncreasing(7404));//verdadera
        System.out.println(isDigitIncreasing(37));//falso
		
    }

    static int isDigitIncreasing(int n) {

        for (int i = 1; i <= 9; i++) { // Indica el numero minimo de iteraciones que se pueden hacer 
            int suma = 0;
            int producto = 0;
			
            while (suma < n) { // Evalua el aumento de digito, si esta es verdadera continua el ciclo de lo contrario esta va a retorna a 0.
                producto = (producto * 10) + i;
                suma += producto;
            }

            if (suma == n)// Indica que la condicion es verdadera lo cual va a retornar a 1.
                return 1;
        }

        return 0;
    }
}

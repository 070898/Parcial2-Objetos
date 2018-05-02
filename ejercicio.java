import java.util.Arrays;
// hacer un programa para hallar el numero mayor//
public class ejercicio{
	public static void main (String [] args){
		int suma;
		int [] numeros={3, 5, 10, 100, 8};
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		suma=sumaA(numeros);
		System.out.println(suma);
	}
	
	public static int sumaA(int[] array){
	int sumaV=0;
	for(int i=0; i<array.length; i++){
		sumaV=array[i]+sumaV;
	}
	return sumaV;
    }
}

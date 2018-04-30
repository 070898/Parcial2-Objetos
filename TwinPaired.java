/**
 * Funciòn que devuelve 1 si su argumento de matriz si esta emparejado gemelamente.
 */

/**
 * @author Alison Juliana López C.
 */
 
package array;


public class TwinPaired{
	
	public static void main(String[] args) {
 
        int a[] = {-6, 12, 1, 24, 3, 5};
      

        TwinPaired twinPaired=new TwinPaired();
        int re = twinPaired.isTwinPaired(a);
        if (re==0)  System.out.println("la matriz no está emparejada gemela :( ");
        else
            System.out.println("la matriz está emparejada gemela :) ");
    }



   int isTwinPaired (int []a) {

    int j=0,h=0;
    int [] e=new int[a.length];
    int [] o=new int[a.length];

    for(int i=0; i < a.length; i++) {   // Separe los números pares e impares del array
        if(a[i] % 2==0)
            e[j++]=a[i];
        else
            o[h++]=a[i];
    }

    for(int i=1; i < e.length; i++) {     //
        if(e[i] >= e[j] && o[i] >= o[j])    j++;
        else
            return 0;
    } return 1;
   }
}
 

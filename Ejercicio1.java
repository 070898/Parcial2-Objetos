import java.util.*;
public class Ejercicio1
{
public static void main (String Args[])
 {
   Scanner leer = new Scanner (System.in);
   int num_caracteres;
   char[] nombre;
   char letra;
   String cadena;
   int x;
   System.out.print("Este programa lee una cadena de caracteres y lo guarda en un vector de tipo caracter.\n\n");
   System.out.print("Digite un texto...\n");
   cadena = leer.nextLine();
   
   num_caracteres = cadena.length();
   System.out.print("\n\nLa cantidad de caracteres leídos es :\n");
   System.out.print(num_caracteres);
   System.out.print("\n\nLa cadena de texto leída es:\n");
   System.out.print(cadena);
   
   /*para convertir en mayúsculas*/
   cadena=cadena.toUpperCase();
   System.out.print("\n\nLa cadena de texto ahora en mayúscula es:\n");
   System.out.print(cadena);
   
   /*para convertir en minúsculas*/
   cadena=cadena.toLowerCase();
   System.out.print("\n\nLa cadena de texto ahora en minúscula es:\n");
   System.out.print(cadena);
   
   nombre = cadena.toCharArray();
   System.out.print("\n\nLa cadena guardada en un vector de tipo caracter es:\n");
   for(x=0;x<num_caracteres;x++)
   {
    System.out.print(nombre[x]);
   }
   
   System.out.print("\n\n");
   System.out.print("Digite un caracter para buscarlo en el vector\n");
   letra=leer.next().charAt(0); /*leer un caracter*/
   for(x=0; x<num_caracteres; x++)
   {
       if(letra==nombre[x])
       {
           System.out.print("Se encontro el caracter "+letra+" en la posicion "+x+"\n");
       }
   }
   /*crear un programa en java q lea un texto y en un vector distinto guarde solamente las vocales leidas y en otro vector distinto guarde solamente
   las consonantes y en otro vector distinto guarde los demas caracteres. Posteriormente imprimir los vectores.*/
   
 } 
}

import java.util.*;
public class Texto2
{
    public static void main (String Args[])
    {
        Scanner leer = new Scanner (System.in);
        int cantidad;
        char Palabra[];
        String cadena;
        int x, iguales;
        System.out.print("Este programa lee una cadena de caracteres y lo guarda en un vector de tipo caracter.\n\n");
        System.out.print("Digite un texto.\n");
        cadena = leer.nextLine();
        cantidad= cadena.length();
        iguales=0;
        Palabra = cadena.toCharArray();
        for(int i=0; i<cantidad/2; i++)
        {
            if(Palabra[i]==Palabra[cantidad-1-i])
            {
                iguales=iguales+i;
            }
        }
        if(iguales==cantidad/2)
        {
            System.out.println("La palabra leida es palindroma");
        }
        else
        {
            System.out.println("La palabra leida no es palindroma");
        }
    }
}

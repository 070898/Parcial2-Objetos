import java.util.*;
public class texto
{
public static void main (String Args[])
 {
   Scanner leer = new Scanner (System.in);
   int num_caracteres;
   char[] palabra;
   char[] min;
   char[] may;
   char[] car;
   String cadena;
   int x,y,z,w;
   System.out.print("Este programa lee un texto y identifica cuantas vocales, consonantes y caracteres tiene el texto.\n\n");
   System.out.print("Digite un texto...\n");
   cadena = leer.nextLine();  
   num_caracteres = cadena.length();   
   cadena=cadena.toLowerCase();
   System.out.print("\n\nLa cadena de texto ahora en minúscula es:\n");
   System.out.print(cadena);
   palabra = cadena.toCharArray();
   min = cadena.toCharArray();
   for (x=0; x<num_caracteres ;x++)
   {
        if(palabra[x]=='a')
        {
            w=cadena.length();
            System.out.print(" "+w);
        }
        else
        {
          if(palabra[x]=='e')
          {
              w=cadena.length();
              System.out.print(" "+w);
          }
          else
          {
              if(palabra[x]=='i')
              {
                  System.out.print(" "+min);
              }
              else
              {
                  if(palabra[x]=='o')
                  {
                      System.out.print(" "+min);
                  }
                  else
                  {
                      if(palabra[x]=='u')
                      {
                          System.out.print(" "+min);
                      }
                      else
                      {
                          
                      }
                  }
              }
          }
        }
   }  
   System.out.print("\n\n");
   /*System.out.print("Digite un caracter para buscarlo en el vector\n");
   letra=leer.next().charAt(0); /*leer un caracter*/
   /*for(x=0; x<num_caracteres; x++)
   {
       if(letra==nombre[x])
       {
           System.out.print("Se encontro el caracter "+letra+" en la posicion "+x+"\n");
       }
   }*/
 }
}

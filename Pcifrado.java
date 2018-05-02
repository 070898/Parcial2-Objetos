import java.util.*;
public class Pcifrado{
    public static void main(String []args){
        int pos,pos2,pos3;
        char vectext[];
        char []abc={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R'};
        char []abc2={'S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
        pos2=abc.length;
        pos3=abc2.length;
        Scanner leer = new Scanner (System.in);
        String cadena;      
        System.out.print("Este programa lee un texto y lo cifra con el sistema de sifrado RUT18 y el cifrado cesar; por esta razon el texto digitado debe estar sin caracteres especiales, como lo son: el punto, la coma, las letras tildadas, etc... ni colocar espacios entre  palabras.\n\n");
        System.out.print("Digite el texto sin caracteres especiales ni espacios.\n");
        cadena = leer.nextLine();
        pos = cadena.length();        
        vectext = cadena.toCharArray();
        /*for(int i=0;i<=pos;i++)
        {
            if(vectext[i]==' '||vectext[i]==','||vectext[i]==';'||vectext[i]==':'||vectext[i]=='.'||vectext[i]=='?'||vectext[i]=='¿'||vectext[i]=='!'||vectext[i]=='¡'||vectext[i]=='Á'||vectext[i]=='É'||vectext[i]=='Í'||vectext[i]=='Ó'||vectext[i]=='Ú'||vectext[i]=='Ñ')
            {  
                System.out.println("\nEl texto ingresado contiene caracteres especiales, como lo son: el punto, la coma, las letras tildadas, etc... ó digito el texto con espacios entre palabras.\n");
                System.out.println("Digite el texto sin caracteres especiales.\n");
                cadena = leer.nextLine();               
                vectext = cadena.toCharArray();
            }
            else
            {
                cadena=cadena.toUpperCase();        
                System.out.println("El texto digitado es: "+vectext[i]+"\n");
            }
        }*/
        for(int i=0;i<pos;i++)            
        {
            for (int j=0;j<pos2&&j<pos3;j++)
            {
                if(vectext[i]==abc[i])                
                {
                    vectext[i]=abc2[j];
                }
                else
                {   if (vectext[i]==abc2[i])
                        {
                            vectext[i]=abc[i];
                        }
                }
            }
        }
        System.out.print("El texto cifrado queda de la siguiente manera: ");
        for(int i=0;i<pos;i++)            
        {
            
            System.out.print(" "+vectext[i]+" ");
            
        }
        System.out.println("\n\nEsta parte del programa sirve para descifrar un texto cifrado, osea, volver a dejar el texto entendible.\n");
        for(int i=0;i<pos;i++)            
        {
            for (int j=0;j<pos2&&j<pos3;j++)
            {
                if(vectext[i]==abc[i])                
                {
                    vectext[i]=abc2[i];
                }
                else
                {   if (vectext[i]==abc2[i])
                        {
                            vectext[i]=abc[i];
                        }
                }
            }
        }
        for(int i=0;i<pos;i++)            
        {
            System.out.println("El texto descifrado queda de la siguiente manera: "+vectext[i]+"\n");
        }
    }
}

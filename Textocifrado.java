import java.util.*;
public class Textocifrado
{
    public static Random num = new Random();    
    public static char vectext[];
    public static char vectext2[];
    public static char[] vecabc={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9','.',',',';',':',' '};
    public static int con=0;  
    public static int pos;
    public static int numal;
    
        public static void texto()
        {
            Scanner leer = new Scanner (System.in);
            String cadena;      
            System.out.print("Este programa lee una cadena de caracteres y lo guarda en un vector de tipo caracter.\n\n");
            System.out.print("Digite un texto...\n");
            cadena = leer.nextLine();
            pos = cadena.length();
            cadena=cadena.toUpperCase();        
            System.out.print(cadena);
            vectext = cadena.toCharArray();        
            numal=num.nextInt(9)+1;
            System.out.print("\n");
            System.out.println(numal);
        }
    public static void cifrado()
    {       
        for(int i=0;i<pos;i++)
        {
            for(int j=0;j<vecabc.length;j++)
            {
                if(vectext[i]==vecabc[j])
                {
                    con=j-numal;
                    if(con<0)
                    {
                        con=con+vecabc.length;
                        vectext[i]=vecabc[con];
                    }
                    else
                    {
                        vectext[i]=vecabc[j-numal];
                    }
                }
            }
        }
        for(int i=0;i<pos;i++)
        {
            System.out.print(" "+vectext[i]+" ");
        }
        }
    public static void descifrado()
    {
        int textn, x;
        Scanner leer = new Scanner (System.in);
        String cad;      
        System.out.print("Digitar texto cifrado para descifrarlo.\n");
        cad = leer.nextLine();
        textn = cad.length();
        cad=cad.toUpperCase();        
        System.out.print(cad);
        vectext2 = cad.toCharArray();
        System.out.print("Digitar el numero de veces que corre la letra.\n");
        x = leer.nextInt();
        for(int i=0;i<vectext2.length;i++)
        {
            for(int j=0;j<vecabc.length;j++)
            {
                if(vectext2[i]==vecabc[j])
                {
                    con=j+x;
                    if(con<0)
                    {
                        con=con+vecabc.length;
                        vectext2[i]=vecabc[con];
                    }
                    else
                    {
                        vectext2[i]=vecabc[j-x];
                    }
                }
            }
        }
        for(int i=0;i<textn;i++)
        {
            System.out.print(" "+vectext2[i]+" ");
        }
        }
    public static void menu()
    {
        int y;
        Scanner leer = new Scanner(System.in);
        do
        {
            System.out.print("\nM.E.N.U\n");
            System.out.print(" 1. Ingresar texto y definir numero aleatorio.\n");
            System.out.print(" 2. Cifrar texto.\n");
            System.out.print(" 3. Descifrar texto dado por usuario.\n");
            System.out.print(" 4. Salir.\n");
            System.out.print(" Digite una opción.\n");
            y=leer.nextInt();
            switch (y)
            {
                case 1: texto();
                break;
                case 2: cifrado();
                break;
                case 3: descifrado();   
                break;
                case 4: System.out.print("Fin del Programa.\n");   
                break;
                default:System.out.print("\nOpción no válida. Por favor vuelva a intentar.\n\n");   
                break;          
            }     
        }while(y!=4);  
    }
    public static void main (String args[])
    {
        menu();
    }
}

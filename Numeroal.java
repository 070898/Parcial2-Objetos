import java.util.*;
public class Numeroal
{
    public static void main (String args[])
    {
        Scanner leer= new Scanner(System.in);
        Random num = new Random();
        int vector []= new int[100];
        int i, w, y, comp, m, j, flag;
        /*vector aleatorio*/
        System.out.print("Este programa guarda 10 numeros aleatorios del 1 al 100 en un vector de tipo entero posicioneo.\n\n");
        for (i=0; i<100; i++)
        {
            /*vector [i]=(int)(Math.random()*99+1);*///Se puede utilizar cualquiera d los 3 pero si c usa el vector [i]=(int)(Math.random()*99+1); no c coloca Random num = new Random();//
             vector[i]=num.nextInt(100);
            /*vector[i]=(num.nextInt(99)+1);*/
        }
        System.out.print("El vector almacenado es \n\n");
        for (i=0; i<10; i++)
        {
            System.out.print(vector[i]+", ");
        }
        /*vector digitado*/
        do
        {
            System.out.print("\n ¿De cuantos numeros es la serie?\n\n");
            w= leer.nextInt();
        }while((w<1)||(w>10));
        int vec2[]=new int[w];
        System.out.print("Por favor digitar los numeros de la serie :\n\n");
        for(i=0;i<w;i++)
        {
            System.out.print("Digite el numero "+(i+1)+" de la serie \n\n");
            vec2[i]=leer.nextInt();
        }
        System.out.print("La serie de numeros leidos es: \n\n");
        for (i=0; i<w; i++)
        {
            System.out.print(vec2[i]+", ");
        }
        flag=0;
        for (y=0; y<10; y++)
        {
            if (vector[y]==vec2[0])
            {
                if(w+y<=10)
                {
                    comp=j=0;
                    for (m=y; m<y+w; m++)
                    {
                        if (vector[m]==vec2[j])
                        {
                            comp=comp+1;
                        }
                        else
                        {
                            m=y+w;
                        }
                        j=j+1;
                    }
                    if(comp==w)
                    {
                        flag=1;
                        y=10;
                    }
                    else
                    {
                        System.out.print("No se encontro la serie.");
                    }
                }
            }
            if(flag==1)
            {
                System.out.print("La serie se encuentra en el vector");
            }
            else
            {
                System.out.print("La serie no se encuentra en el vector");
            }
        }
    }
}

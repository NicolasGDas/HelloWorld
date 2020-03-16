import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * Helloworld
 */
public class Helloworld {
    public static void main(String[] args) 
    
    {
        int num1, num2, num3, option;
        Scanner sc = new Scanner(System.in);
        String scan; 
        System.out.println("Si desea que el programa consiidere numeros iguales ingrese 2, de lo contrario ingrese 1");
        scan=sc.nextLine();
        option= Integer.parseInt(scan);
        System.out.println("Ingrese el numero que desea comparar");
        scan = sc.nextLine();
        num1 = Integer.parseInt(scan);
        System.out.println("Ingrese el segundo numero que desea comparar");
        scan = sc.nextLine();
        num2 = Integer.parseInt(scan);
        System.out.println("Ingrese el tercer numero  que desea comparar");
        scan = sc.nextLine();
        num3 = Integer.parseInt(scan);
        switch (option)  
        {
            case 1  :
                   
                    if (num1 > num2 && num1 > num3) 
                    {
                        System.out.println("El numero mas grande es " + num1);
                    } 
                    else 
                    {   
                        if (num2 > num1 && num2 > num3) 
                        {
                            System.out.println("El numero mas grande es " + num2);

                        } else 
                        {
                            System.out.println("El numero mayor es " + num3);
                        }
                    }
                    break;
            case 2 :    
                    if(num1==num2 &&num3==num2)
                    {
                        System.out.println("Los tres numeros son iguales desea imprimirlo igual? Coloque Y para si N para no");
                        scan = sc.nextLine();
                        if (scan.equals("Y")||scan.equals("y"))
                        {
                            System.out.println("El numero es " + num1 );
                        }
                        
                    }
                    
                
        }
            
           
    }
}

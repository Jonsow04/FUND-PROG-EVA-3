
package eva3_2_funciones_2;

import java.util.Scanner;

public class EVA3_2_FUNCIONES_2 {
    
    int x = 1;
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        EVA3_2_FUNCIONES_2 objeto = new EVA3_2_FUNCIONES_2();
        System.out.println(objeto.x);*/
        int num1 = 100, num2 = 200;
        //SE UNSA EL VALOR DIRECTAMENTE DEL LA FUNCIÓN
        System.out.println(buscarMax(num1,num2));
        //GUARDAMOS EL VALOR DEVULETO PARA SU USO POSTERIOR
        int valor = buscarMax(num1, num2);
        System.out.println(valor);
        //SE EJECUTA LA FUNCIÓN, PERO IGNORAMOS EL RESULTADO
        buscarMax(num1,num2);
    }
    
    static int buscarMax(int val1, int val2){
        //Es recomendable usar un solo "return"
        /*int resultado;
        if(val1 > val2)
            resultado = val1;
        else
            resultado = val2;
        return resultado;*/
        
        //Doble return
        if(val1 > val2)
            return val1;
        else
            return val2;
    }
}

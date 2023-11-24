
package eva3_3_factorial;


public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        //lamada a función:
        System.out.println("El factoria de 5 es: " + calcularFactorial(5));
        
        System.out.println("4 elevado a la 4 potencia es: " + calcularPotencia(4, 4));
    }
    static int calcularFactorial(int num){
        //factorial de 5: 1 x 2 x 3 x 4 x 5
        //usar ciclos
        //regresar el valor calculado
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i; //res = res * i;
        }
        return res;
    }
    //crear una función que calcule la potencia de un número entero.
    static int calcularPotencia(int base,int exp){
        int r = 1;
        for (int i = 0; i < exp; i++) {
            r *= base;
        }
        return r;
    }
}

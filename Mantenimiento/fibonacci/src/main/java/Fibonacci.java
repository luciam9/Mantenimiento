public class Fibonacci {

    //Método que calcula la sucesión de fibonacci dado un número entero
    public int compute(int n){

        if(n<0){
            throw new RuntimeException("El valor debe ser positivo");
        }
        if (n <= 1)
            return n;
        return compute(n-1) + compute(n-2);
    }
}

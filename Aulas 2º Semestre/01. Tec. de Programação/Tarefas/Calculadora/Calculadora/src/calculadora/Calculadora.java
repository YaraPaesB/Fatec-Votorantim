package calculadora;

/**
 *
 * @author Alunos
 */
public class Calculadora {
    public double valorA, valorB, result;
    public String resultMsg;
    
    
    public void soma(double valorA, double valorB) {
        result = valorA + valorB;
        resultMsg = valorA + "+" + valorB + "=" + result;
    }
    
    public void sub(double valorA, double valorB) {
        result = valorA - valorB;
        resultMsg = valorA + "-" + valorB + "=" + result;

    }
    
    public void mult(double valorA, double valorB) {
        result = valorA * valorB;
        resultMsg = valorA + "*" + valorB + "=" + result;
    }
    
    public void div(double valorA, double valorB) {
        result = valorA / valorB;
        resultMsg = valorA + "/" + valorB + "=" + result;
    }
    
    public String getResultadoString() {
        return resultMsg;
    }
    
    public double getResultadoValor() {
        return result;
    }
}

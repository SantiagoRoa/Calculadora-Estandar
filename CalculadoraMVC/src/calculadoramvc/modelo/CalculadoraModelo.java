package calculadoramvc.modelo;

public class CalculadoraModelo {

    private double numero1;
    private double numero2;
    private double resultado;
    private String operacion;

    public CalculadoraModelo() {
        numero1 = 0;
        numero2 = 0;
        operacion = "";
        resultado = 0;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double raiz(double a, double b) {
        return Math.pow(b, (1 / a));
    }

    public double porcentaje(double a, double b) {
        double res = a * b / 100;
        return res;
    }

    public void limpiar() {
        numero1 = 0;
        numero2 = 0;
        operacion = "";
        resultado = 0;
    }

    public void calcular(double numero1, double numero2, String operacion) {
        switch (operacion) {
            case "+":
                numero1 = sumar(numero1, numero2);
                numero2 = 0;
                setResultado(numero1);
                break;
            case "-":
                numero1 = restar(numero1, numero2);
                numero2 = 0;
                setResultado(numero1);
                break;
            case "*":
                numero1 = multiplicar(numero1, numero2);
                numero2 = 0;
                setResultado(numero1);
                break;
            case "÷":
                if (numero2 == 0) {
                    limpiar();
                    break;
                }
                numero1 = dividir(numero1, numero2);
                numero2 = 0;
                setResultado(numero1);
                break;
            case "^":
                numero1 = potencia(numero1, numero2);
                numero2 = 0;
                setResultado(numero1);
                break;
            case "√":
                if (numero1 < 0 || numero2 < 0) {
                    limpiar();
                    break;
                }
                numero1 = raiz(numero1, numero2);
                numero2 = 0;
                setResultado(numero1);
                break;
            case "%":
                if (numero1 < 0) {
                    limpiar();
                    break;
                }
                numero1 = porcentaje(numero1, numero2);
                numero2 = 0;
                setResultado(numero1);
                break;
            case "=":
                getResultado();
                break;
        }
    }

    public boolean numeroExiste() {
        if (numero1 != 0) {
            return true;
        } 
        return false;
    }

    public boolean operacionExiste() {
        if (operacion != "") {
            return true;
        }
        return false;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

}

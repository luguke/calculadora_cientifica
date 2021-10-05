public class calculadora {
    private double a;
    private double b;

        calculadora(double a, double b){
            this.a = a; this.b = b;
        }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double somar(){
        return this.a + this.b;
    }
    public double subtrair(){
        return this.a - this.b;
    }
    public double multiplicar(){
        return this.a * this.b;
    }
    public double dividir(){
        return this.a / this.b;
    }
    public double elevar(){
        return  Math.pow(this.a,this.b);
    }
    public double raiz() {
        return Math.sqrt(a);
    }
    public double fatoriar(){
            double x = this.a;
            double f = x;
            while (x > 1){
                f = f * (x-1);
                x--;
            } return f;

    }
    public double inverso(){
        return 1 / this.a;
    }
}

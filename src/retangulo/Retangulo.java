package retangulo;
import javax.swing.JOptionPane;
public class Retangulo{
    protected double base;
    protected double altura;
    //método construtor
    public Retangulo(){
        base = 0.0;
        altura = 0.0;
    }
    //métodos
    public void recebaAltura(double vAltura){
        altura = vAltura;
    }
    public void recebaBase(double vBase){
        base = vBase;
    }
    public double areaRetangulo(){
        double area;
        area = base*altura;
        return area;
    }
    public double perimetroRetangulo(){
        double perimetro;
        perimetro = 2*(base + altura);
        return perimetro;
    }
    public static void main(String[] args) {
        Retangulo umRetangulo;
        Interface umaInterface;
        umRetangulo = new Retangulo();
        umaInterface = new Interface();
        double valorBase, valorAltura, valorArea, valorPerimetro;
        valorBase = umaInterface.recebaValorBase();
        umRetangulo.recebaBase(valorBase);
        valorAltura = umaInterface.recebaValorAltura();
        umRetangulo.recebaAltura(valorAltura);
        valorArea = umRetangulo.areaRetangulo();
        umaInterface.fornecaArea(valorArea);
        valorPerimetro = umRetangulo.perimetroRetangulo();
        umaInterface.fornecaPerimetro(valorPerimetro);
    }
}
    class Interface{
        public Interface()
        {}
        public double recebaValorBase(){
            String valorLido;
            valorLido = JOptionPane.showInputDialog("Digite a base do retangulo:");
            double vBase = Double.parseDouble(valorLido);
            return vBase;
        }
        public double recebaValorAltura(){
            String valorLido;
            valorLido = JOptionPane.showInputDialog("Digite a altura do retangulo:");
            double vAltura = Double.parseDouble(valorLido);
            return vAltura;
        }
        public void fornecaArea(double area){
            System.out.println("A area do retangulo e:" + area);
        }
        public void fornecaPerimetro(double perimetro){
            System.out.println("O perimetro do retangulo e:" + perimetro);
        }
    }

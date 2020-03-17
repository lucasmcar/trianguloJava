/*Interface que implementa os métodos para formação e tipos de triângulos*/
package triangulo;

public interface FormaTriangulo {
    
    //Veriifica se forma triangulo
    //Passando como parâmetro 3 valores do tipo inteiro, e retornando uma string caso as condições satisfaçam ou não
    public abstract String formarTriangulo(int l1, int l2, int l3);
    
    //Triangulo com 3 medidas diferentes
    public abstract boolean trianguloEscaleno();
    
    //Triangulo com 2 lados iguais
    public abstract boolean trianguloIsoceles();
    
    //Tres lados iguais
    public abstract boolean trianguloEquilatero();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

public interface FormaTriangulo {
    
    //Veriifica se forma triangulo
    public abstract String formarTriangulo(int l1, int l2, int l3);
    
    //Triangulo com 3 medidas diferentes
    public abstract boolean trianguloEscaleno();
    
    //Triangulo com 2 lados iguais
    public abstract boolean trianguloIsoceles();
    
    //Tres lados iguais
    public abstract boolean trianguloEquilatero();
}

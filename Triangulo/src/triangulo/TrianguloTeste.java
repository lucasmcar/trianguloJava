/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author lukas
 */
public class TrianguloTeste {

    public static void main(String[] args) {
        
        Triangulo tt = new Triangulo();
        
        tt.setLadoA(10);
        tt.setLadoB(8);
        tt.setLadoC(6);
        
        int a = tt.getLadoA();
        int b = tt.getLadoB();
        int c = tt.getLadoC();
        
        System.out.println(tt.formarTriangulo(a, b, c));
        System.out.println("Equilátero: ");
        System.out.println(tt.trianguloEquilatero());
        System.out.println("Escaleno:");
        System.out.println(tt.trianguloEscaleno());
        System.out.println("Isóceles: ");
        System.out.println(tt.trianguloIsoceles());
        
    }
    
}

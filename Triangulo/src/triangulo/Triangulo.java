
package triangulo;


public class Triangulo implements FormaTriangulo{
    
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo() {
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public boolean trianguloEscaleno() {
        if(ladoA != ladoB && ladoB != ladoC && ladoA != ladoC)
        {
            return true;
        }
        
        return false;
    }

    @Override
    public boolean trianguloIsoceles() {
        if((ladoA == ladoB) && (ladoA != ladoC))
        {
            return true;
        }
        
        return false;
    }

    @Override
    public boolean trianguloEquilatero() {
        if((ladoA == ladoB) && (ladoB == ladoC) &&(ladoA == ladoC))
        {
            return true;
        }
        
        return false;
    }

    @Override
    public String formarTriangulo(int l1, int l2, int l3) {
    
        if((l1 < l2+ l3) && (l2 < l1 + l3) && (l3<l1 + l2))
        {
            return "Forma triângulo";
        }
        return "Não forma triangulo";
    }
}

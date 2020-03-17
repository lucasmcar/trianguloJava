
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

    //Implementação da Interface IFormaTriangulo
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

    //Verifica se forma um triângulo de acordo com os valores passados como parâmetro
    @Override
    public String formarTriangulo(int l1, int l2, int l3) {
    
        //Se um dos lados for menor que a soma dos outros dois, então forma um triângulo
        if((l1 < l2+ l3) && (l2 < l1 + l3) && (l3<l1 + l2))
        {
            return "Forma triângulo";
        }
        return "Não forma triangulo";
    }
}

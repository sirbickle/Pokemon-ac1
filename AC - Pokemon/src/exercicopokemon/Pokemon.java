
package exercicopokemon;


public class Pokemon {
    private String Nome;    
    private int vida = 200;
    private int defesa;
    private int ataque;
    private String Tipo;
    private int nivel;
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }
    
    
    public String getNome() {
        return Nome;
    }


    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

   

    public String getTipo() {
        return Tipo;
    }

  

    public int getNivel() {
        return nivel;
    }

    
    private void calculaAtributo(String tipo){
        switch(tipo){
            case "Fogo":
                this.vida = this.getVida()  - 20;
                this.defesa = 20;
                this.ataque = 60;
                this.velocidade = 30;
                break;
            case "Agua":
                this.vida = this.getVida()  - 5;
                this.ataque = 40;
                this.defesa = 35;
                this.velocidade = 40;
                break;
            case "Planta":
                this.vida = this.getVida()  + 20;
                this.ataque = 15;
                this.defesa = 60;
                this.velocidade = 25;
                break;
            case "Pedra":
                this.vida = this.getVida() + 25;
                this.ataque = 30;
                this.defesa = 60;
                this.velocidade = 20;
        }
    }
    
    private void calcularBonus(int nivel){
        this.vida = this.getVida() + (nivel / 2);
        this.ataque = this.getAtaque() + (nivel / 3 );
        this.defesa = this.getDefesa() + (nivel /4);
        this.velocidade = this.getVelocidade() + (nivel / 5);
        
    }
    
    public void imprimirPokemon(){
        
        System.out.println("Nome:" + this.Nome);
        System.out.println("Tipo:" + this.Tipo);
        System.out.println("Nivel:" + this.nivel);
        System.out.println("Vida:" + this.vida);
        System.out.println("Ataque:" + this.ataque);
        System.out.println("Defesa:" + this.defesa);
        System.out.println("Velocidade" + this.velocidade);
       
        
    }

    public Pokemon(String Nome, String Tipo, int nivel) {
        this.Nome = Nome;
        this.Tipo = Tipo;
        this.nivel = nivel;
        this.calculaAtributo(Tipo);
        this.calcularBonus(nivel);
        
    }
    
    
}

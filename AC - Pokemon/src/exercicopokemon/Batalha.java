
package exercicopokemon;
import javax.swing.JOptionPane;

public class Batalha {
    
    private int meuPokemonHP;
    private int outroPokemonHP;
    private int meuPokemonDEF;
    private int meuPokemonATQ;
    private int outroPokemonDEF;
    private int outroPokemonATQ;
    private int outroPokemonSSP;
    private int meuPokemonSSP;
         
    private String meuPokemonNome;
    private String outroPokemonNome;

    public void setMeuPokemonHP(int meuPokemonHP) {
        this.meuPokemonHP = meuPokemonHP;
    }

    public void setOutroPokemonHP(int outroPokemonHP) {
        this.outroPokemonHP = outroPokemonHP;
    }

    public void setMeuPokemonDEF(int meuPokemonDEF) {
        this.meuPokemonDEF = meuPokemonDEF;
    }

    public void setMeuPokemonATQ(int meuPokemonATQ) {
        this.meuPokemonATQ = meuPokemonATQ;
    }

    public void setOutroPokemonDEF(int outroPokemonDEF) {
        this.outroPokemonDEF = outroPokemonDEF;
    }

    public void setOutroPokemonATQ(int outroPokemonATQ) {
        this.outroPokemonATQ = outroPokemonATQ;
    }

    public void setOutroPokemonSSP(int outroPokemonSSP) {
        this.outroPokemonSSP = outroPokemonSSP;
    }

    public void setMeuPokemonSSP(int meuPokemonSSP) {
        this.meuPokemonSSP = meuPokemonSSP;
    }

    public void setMeuPokemonNome(String meuPokemonNome) {
        this.meuPokemonNome = meuPokemonNome;
    }

    public void setOutroPokemonNome(String outroPokemonNome) {
        this.outroPokemonNome = outroPokemonNome;
    }

    
    
    public int getMeuPokemonHP() {
        return meuPokemonHP;
    }

    public int getOutroPokemonHP() {
        return outroPokemonHP;
    }

    public int getMeuPokemonDEF() {
        return meuPokemonDEF;
    }

    public int getMeuPokemonATQ() {
        return meuPokemonATQ;
    }

    public int getOutroPokemonDEF() {
        return outroPokemonDEF;
    }

    public int getOutroPokemonATQ() {
        return outroPokemonATQ;
    }

    public int getOutroPokemonSSP() {
        return outroPokemonSSP;
    }

    public int getMeuPokemonSSP() {
        return meuPokemonSSP;
    }

    public String getMeuPokemonNome() {
        return meuPokemonNome;
    }

    public String getOutroPokemonNome() {
        return outroPokemonNome;
    }

    public void meuPokemon(String nome, int vida, int ataque, int defesa, int velocidade){
        this.meuPokemonHP = vida;
        this.meuPokemonNome = nome;
        this.meuPokemonATQ = ataque;
        this.meuPokemonDEF = defesa;
        this.meuPokemonSSP = velocidade;
    }
    
    public void outroPokemon(String nome, int vida, int ataque, int defesa, int velocidade){
        this.outroPokemonHP = vida;
        this.outroPokemonNome = nome;
        this.outroPokemonATQ  = ataque;
        this.outroPokemonDEF = defesa;
        this.outroPokemonSSP = velocidade;
    }
   
    public void Teste()
    {
        JOptionPane.showMessageDialog(null,"Banana");
    }
    
    public void startBattle(){
    JOptionPane.showMessageDialog(null,"A batalha vai começar!");

     do{
         if(this.getMeuPokemonSSP() > this.getOutroPokemonSSP()){
             this.setOutroPokemonHP( this.getOutroPokemonHP() - (this.getMeuPokemonATQ() - (this.getOutroPokemonDEF() / 5)));  
              JOptionPane.showMessageDialog(null,this.getMeuPokemonNome() + " atacou causando "  + (this.getMeuPokemonATQ() - (this.getOutroPokemonDEF() / 5)) + " de dano a vida do oponente é: " + this.getOutroPokemonHP());
             if(this.getOutroPokemonHP() > 0){
                this.setMeuPokemonHP(this.getMeuPokemonHP() - (this.getOutroPokemonATQ() -(this.getMeuPokemonDEF() /5)));  
                JOptionPane.showMessageDialog(null,this.getOutroPokemonNome() + " atacou causando "  + (this.getOutroPokemonATQ() - (this.getMeuPokemonDEF() / 5)) + " de dano a vida do meu pokemon é: " + this.getMeuPokemonHP());
             }
         }
         else{
            this.setMeuPokemonHP(this.getMeuPokemonHP() - (this.getOutroPokemonATQ() -(this.getMeuPokemonDEF() /5)));
             JOptionPane.showMessageDialog(null,this.getOutroPokemonNome() + " atacou causando "  + (this.getOutroPokemonATQ() - (this.getMeuPokemonDEF() / 5)) + " de dano a vida do meu pokemon é: " + this.getMeuPokemonHP());
             if(this.getMeuPokemonHP() > 0){
                this.setOutroPokemonHP( this.getOutroPokemonHP() - (this.getMeuPokemonATQ() - (this.getOutroPokemonDEF() / 5))); 
                   JOptionPane.showMessageDialog(null,this.getMeuPokemonNome() + " atacou causando "  + (this.getMeuPokemonATQ() - (this.getOutroPokemonDEF() / 5)) + " de dano a vida do oponente é: " + this.getOutroPokemonHP());
             }
         }
       
     
         if(this.meuPokemonHP <=0){
             JOptionPane.showMessageDialog(null,"O pokemon " + this.outroPokemonNome + " ganhou");
        break;
    }
         if(this.outroPokemonHP <= 0){
             JOptionPane.showMessageDialog(null,"O pokemon " + this.meuPokemonNome + " ganhou");
        break; 
         }
    
     
}while(this.getMeuPokemonHP() !=0 && this.getMeuPokemonHP() > 0 || this.getOutroPokemonHP() != 0 && this.getOutroPokemonHP() > 0);
    }
    
}

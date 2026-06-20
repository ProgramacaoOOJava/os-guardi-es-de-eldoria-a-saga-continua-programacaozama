package eldoria;

/**
 * Classe que representa um Guerreiro no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de combate.
 */
public class Guerreiro extends Personagem {

     // * Construtor para criar um Guerreiro.
	public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
		super(nome,classe,nivel,pontosDeVida,poderBase);
	}
    /**
     * Sobrescrita do método usarHabilidade() específica para Guerreiros.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {		
    	System.out.println("Habilidade: "+ this.getNome() + " desfere um golpe devastador!");
    }
}
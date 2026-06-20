package eldoria;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem {

    
    // * Construtor para criar um Mago.
	public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
		super(nome,classe,nivel,pontosDeVida,poderBase);

	}
    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
    	System.out.println("Habilidade: "+ this.getNome() + " conjura um feitiço de proteção!");
    }
}
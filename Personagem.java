package eldoria;

import java.util.Objects;

/**
 * Classe base para representar personagens do reino de Eldoria.
 * Aplica conceitos de encapsulamento, herança e polimorfismo.
 */
public abstract class  Personagem {
    // Atributos privados (encapsulamento)
	private String nome;
	private String classe;
	private int nivel;
	private int pontosDeVida;
	private double poderBase;

    // * Construtor que inicializa todos os atributos do personagem.
	public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel;
		this.pontosDeVida = pontosDeVida;
		this.poderBase = poderBase;
	}
    // Getters
	public String getNome() {
		return nome;
	}
	public String getClasse() {
		return classe;
	}
	public int getNivel() {
		return nivel;
	}
	public int getpontosDeVida() {
		return pontosDeVida;
	}
	public double getpoderBase() {
		return poderBase;
	}
    // Setters com validações
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
	public void setPoderBase(double poderBase) {
		this.poderBase = poderBase;
	}
    // * Criar métodos que define os pontos de vida do personagem.
	public void restaurarVida(int quantidade) {
		this.pontosDeVida += quantidade;
	}


    /**
     * Criar método que define a habilidade do personagem.
     * Deve ser sobrescrito pelas subclasses para implementar comportamentos específicos.
     */
	public abstract void usarHabilidade();


    /**
     * Sobrescrita do método toString() para exibir informações do personagem.
     */
	public void exibirStatus() {
		System.out.println(this.toString());
	}
	/*
     * @return String formatada com todos os atributos do personagem
     */
    @Override
    public String toString() {
    	return 
    			"Nome: " + nome + "\n" +
                "Classe: " + classe + "\n" +
                "Nivel: " + nivel + "\n" +
                "Pontos de vida: " + pontosDeVida + "\n"+
                "Poder Base: " + poderBase  ;
                
    }

    /**
     * Sobrescrita do método equals() para comparar personagens.
     * Dois personagens são considerados iguais se tiverem o mesmo nome e classe.
     * @param obj Objeto a ser comparado
     * @return true se os personagens forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Personagem outro = (Personagem) obj;
        return Objects.equals(nome, outro.nome) && 
               Objects.equals(classe, outro.classe);
    }

    /**
     * Sobrescrita do método hashCode() para ser consistente com equals().
     * @return Código hash baseado no nome e classe
     */
    @Override
    public int hashCode() {
    	return Objects.hash(nome,classe);
    }
}
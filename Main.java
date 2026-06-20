package eldoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal que demonstra os conceitos de POO aplicados no sistema de personagens de Eldoria.
 * Demonstra: herança, polimorfismo, encapsulamento, instanceof, equals() e hashCode().
 */
public class Main {
    
	public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");
        
        // Criando uma lista polimórfica de personagens
        List<Personagem> herois = new ArrayList<>();
        // Adicionando Magos à lista
        herois.add(new Mago("Eldoran","Mago", 7, 60, 18.0));
        herois.add(new Mago("Mystara","Mago", 5, 55, 15.5));
        // Adicionando Guerreiros à lista4
        herois.add(new Guerreiro("Arthemis","Guerreiro", 5, 80, 12.5));
        herois.add(new Guerreiro("Thorin","Guerreiro", 8, 95, 16.0));
       
        System.out.println("=== CADASTRO DOS HERÓIS ===");
        
        
        // Percorrendo a lista e demonstrando polimorfismo
        for (Personagem  p : herois) {
        	// chamando exibirStatus()
        	p.exibirStatus();
        	      	
        	// chamando usrHabilidade
        	p.usarHabilidade();
        	
        	System.out.println();// linha em branco 
        
       
     }
System.out.println("=== TESTE DE IGUALDADE (equals) ===");
        
        // Primeira comparação (Índice 0 vs Índice 1)
        boolean saoIguais = herois.get(0).equals(herois.get(1));
        System.out.println("O primeiro herói é igual ao segundo? " + saoIguais);
        
        // Correção: Reatribuição da variável existente (sem o 'boolean') e ajuste no texto
        saoIguais = herois.get(2).equals(herois.get(3));
        System.out.println("O terceiro herói é igual ao quarto? " + saoIguais);
	}
	
	
}
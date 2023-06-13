
package br.com.deivid.main;

import java.util.Scanner;

import br.com.deivid.ultilitarios.Ultilit;

public class pi {

	public static void main(String[] args) {
		
		//lore do jogo
		Scanner sc = new Scanner(System.in);
		
		System.err.println("!!!!!!!!!!!!!!!!!!!!AVISO!!!!!!!!!!!!!!!!!");
		System.out.println("DEIXE O SEU CONSOLE O MAIOR POSSIVEL. OK?");
		
		System.out.print("DIGITE: "); sc.next();
		
		System.out.println("Este é um jogo de palavras. Digite a palavra corretamente para ganhar pontos. A quantidade");
		System.out.println("de pontos que você ganha por palavra é equivalente ao número de letras que ela tem. Ao longo do jogo,");
		System.out.println("você pode obter bônus de rodada, onde ganhará uma quantidade adicional de pontos por rodada. Além disso,");
		System.out.println("você também pode comprar multiplicadores de pontos, que permitem multiplicar os pontos ganhos com as palavras.");
		
		System.out.print("DIGITE: "); sc.next();
		
		Ultilit.historia(sc);
		//fim da lore
		
		
		
		String[] listaDePalavras = { "abobora", "abraco", "acampar", "acessorio", "alface", "alguem", "alianca",
				"almoco", "amarelo", "amigo", "avalanche", "aventura", "aviao", "azar", "azul", "baba", "bacalhau",
				"bagagem", "baile", "bala", "banheiro", "barata", "barulho", "base", "batata", "cabelo", "cachorro",
				"cadeado", "cafe", "caixa", "cama", "canela", "caneta", "carro", "carteira", "vaca", "valente",
				"valioso", "vapor", "varanda", "vasilha", "velocidade", "ventilador", "verao", "vestido", "lago",
				"lama", "lanterna", "lapis", "largo", "laranja", "lata", "leite", "lenco", "leve", "faca", "falar",
				"familia", "fantasia", "farinha", "fase", "facil", "fechar", "feira", "feitiço", "galo", "gato",
				"gaveta", "geladeira", "gelo", "gemido", "generoso", "geral", "girafa", "giz", "rato", "raiva", "raio",
				"ramo", "raposa", "ratoeira", "regra", "risco", "rocha", "rosa", "dado", "dama", "danca", "dente",
				"desenho", "deserto", "desejo", "dia", "dica", "diferente", "taco", "tampa", "tarefa", "tesouro",
				"teto", "tigre", "tijolo", "tinta", "toalha", "touro", "janela", "jarra", "jato", "jaula", "jogar",
				"joia", "jornal", "jovem", "julho", "junho","zangado", "zarpar", "zebra", "zelador", "zeloso", "zero",
				"ziper", "zoar", "zombar", "zumbido",  "magro", "maior", "malaquias", "maldade", "malvado", "mamute", "manter",
				"maratona", "maravilha", "marcha", "margarida", "marinheiro", "martelo", "mascarado", "massa", "mastro", "mate",
				"mau", "saco", "sala", "salada", "salto", "sapato", "seda", "selva", "sinal", "sopa", "xampu", "xadrez", "xale",
				"xarope", "xícara", "xícara", "xisto", "xote", "xuxu", "xerife", "quadro", "quarto", "queijo", "queimado",
				"quente", "querido", "quintal", "quiosque", "quina", "quimica", "escada", "escova", "escola", "esperar",
				"estrela", "esteira", "estudar", "elegante", "elefante", "equilibrio", "olho", "ovo", "onda", "ouro",
				"organizar", "osso", "outono","urso", "universo", "uniforme", "uva", "uniao", "ultimo", "urina", "urbano",
				"ultrapassar", "ufania", "igreja", "ilha", "igual", "icone", "iniciar", "inverno", "inseto", "intenso",
				"inteligente", "inseticida" };
		
		Ultilit.jogo(listaDePalavras);
		
		
		
		
	}

}

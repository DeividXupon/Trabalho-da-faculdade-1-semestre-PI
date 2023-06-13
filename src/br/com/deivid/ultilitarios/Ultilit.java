package br.com.deivid.ultilitarios;

import java.util.Random;
import java.util.Scanner;

public class Ultilit {
	
	
	//Esse foi o unico jeito que achei de limpar a tela 
	//o comando cls e clear pararam de funcionar no console do java 
	public final static void espacoLimpo(int n){
		for(int i = 0; i < n; i++) {
			System.out.println("");
		}
	}
	
	//HISTORIA DO JOGO
	public final static void historia(Scanner sc){
		Ultilit.espacoLimpo(3);
		System.out.println("|  ☆            ☆              ☆                       ☆                        ☆                 ☆          ☆ \r\n"
				+ "|         ☆             ☆                          ☆            ☆            ☆           ☆         ☆        ☆  \r\n"
				+ "|    ☆          ☆                ☆   ☆                   ☆           ☆               ☆                   ☆     \r\n"
				+ "|           ☆          ☆   ☆                ☆                 ☆                           ☆   ☆              ☆ \r\n"
				+ "|    ☆                  ☆         _      _ __    __           ____   __  __     ☆       ☆            ☆       ☆ \r\n"
				+ "|        ☆            ☆           \\\\    // ||    || ||===\\\\  //  \\\\  ||  //                ☆               ☆  \r\n"
				+ "|                 ☆            ☆   \\\\  //  ||    || ||   || //    \\\\ || //      ☆                ☆       ☆     \r\n"
				+ "|  ☆                       ☆        \\\\//   ||    || ||   || ||    || ||//                                   \r\n"
				+ "|          ☆     ☆                  //\\\\   \\\\    // ||===// ||    || ||\\\\    ☆        ☆            ☆      ☆   \r\n"
				+ "|                    ☆         ☆   //  \\\\   \\\\__//  ||      \\\\____// || \\\\                                  \r\n"
				+ "|☆           ☆                    //    \\\\   \\__/   ||       \\____/  ||  \\\\         ☆           ☆       ☆     \r\n"
				+ "|   ☆             ☆             ☆                       ☆                        \r\n"
				+ "|         ☆              ☆                         ☆            ☆            ☆           ☆          ☆        ☆\r\n"
				+ "|    ☆          ☆                ☆   ☆                   ☆           ☆               ☆                    ☆\r\n"
				+ "|           ☆           ☆   ☆               ☆                 ☆                           ☆   ☆               ☆");

		
		Ultilit.espacoLimpo(5);
		
		System.out.print("|                                            Digite ok para começar:");
		sc.next();
		
		Ultilit.espacoLimpo(15);
		
		System.out.println("|    LORE DO JOGO: Você é uma morador de Recife Bahia que tomo uma pancada na cabeça\r\n"
				+ "|    e esta em coma fazen 7 anos agora no seu sonho de coma enterno você esta em um mundo\r\n"
				+ "|    cheio de Xupokemons bixinhos que você escravisa por dinheiro :D \r\n"
				+ "|\r\n"
				+ "|\r\n"
				+ "|	\r\n"
				+ "|                            ^             ^               ^!^\r\n"
				+ "|                              ^ _______________________________\r\n"
				+ "|                               [=U=U=U=U=U=U=U=U=U=U=U=U=U=U=U=]\r\n"
				+ "|                               |.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.|\r\n"
				+ "|                               |        +-+-+-+-+-+-+-+        |\r\n"
				+ "|                               |        | Hospital :D |        |\r\n"
				+ "|                               |        +-+-+-+-+-+-+-+        |\r\n"
				+ "|                               |.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.|\r\n"
				+ "|                               |  _________  __ __  _________  |\r\n"
				+ "|                             _ | |    | _  ||[]|[]||  _  |   | | _\r\n"
				+ "|                            (!)| |____|(!)_|| ,| ,||_(!)_|___| |(!)\r\n"
				+ "|                           .T~T|:.....:T~T.:|__|__|:.T~T.:....:|T~T.\r\n"
				+ "|                           ||_||||||||||_|||||||||||||_||||||||||_||\r\n"
				+ "|                           ~\\=/~~~~~~~~\\=/~~~~~~~~~~~\\=/~~~~~~~~\\=/~\r\n"
				+ "|                             | -------- | ----------- | -------- |\r\n"
				+ "|                           ~ |~^ ^~~^ ~~| ~^  ~~ ^~^~ |~ ^~^ ~~^ |^~\r\n"
				+ "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Ultilit.espacoLimpo(3);
		System.out.print("|                                                                         _DIGITE_ algo para pular:");
		Ultilit.espacoLimpo(1);
		sc.next();
		Ultilit.espacoLimpo(15);
		
		System.out.println("|    LORE DO JOGO: O seu sonho se inicia em uma casa junto com sua família. vocês estão em condições financeiras\r\n"
				+ "|    bastante limitadas. Contudo, em dado momento, você acha um papel no chão e descobre que pode ganhar dinheiro\r\n"
				+ "|    por meio de um jogo de palavras. Sendo assim, o seu objetivo é ganhar 100.000 moedas de ouro. \r\n"
				+ "|                          \r\n"
				+ "|                                                      (   )\r\n"
				+ "|                                                     (    )\r\n"
				+ "|                                                      (    )\r\n"
				+ "|                                                     (    )\r\n"
				+ "|                                                       )  )\r\n"
				+ "|                                                      (  (                  /\\\r\n"
				+ "|                                                       (_)                 /  \\  /\\\r\n"
				+ "|                                               ________[_]________      /\\/    \\/  \\\r\n"
				+ "|                                      /\\      /\\        ______    \\    /   /\\/\\  /\\/\\\r\n"
				+ "|                                     /  \\    //_\\       \\    /\\    \\  /\\/\\/    \\/    \\\r\n"
				+ "|                              /\\    / /\\/\\  //___\\       \\__/  \\    \\/\r\n"
				+ "|                             /  \\  /\\/    \\//_____\\       \\ |[]|     \\\r\n"
				+ "|                            /\\/\\/\\/       //_______\\       \\|__|      \\\r\n"
				+ "|                           /      \\      /XXXXXXXXXX\\                  \\\r\n"
				+ "|                                   \\    /_I_II  I__I_\\__________________\\\r\n"
				+ "|                                          I_I|  I__I_____[]_|_[]_____I\r\n"
				+ "|                                          I_II  I__I_____[]_|_[]_____I\r\n"
				+ "|                                          I II__I  I     XXXXXXX     I\r\n"
				+ "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\"   \"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Ultilit.espacoLimpo(3);
		System.out.print("|                                                                         _DIGITE_ algo para pular:");
		Ultilit.espacoLimpo(1);
		sc.next();
		Ultilit.espacoLimpo(15);
		
		
	}
	
	//JOGO EM SI
	public final static void jogo(String[] listaDePalavras){
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		Boolean item1 = true;
		Boolean item2 = true;
		Boolean item3 = true;
		Boolean item4 = true;
		Boolean item5 = true;
		

		int pontos = 5000000;
		int mutiplicador = 1;
		int bonus = 0;
		String resp;

		while (true) {
			int indiceAleatorio = random.nextInt(listaDePalavras.length);

			// Obter o elemento aleatório do vetor
			String elementoAleatorio = listaDePalavras[indiceAleatorio];

			// Exibir o elemento aleatório
			Ultilit.espacoLimpo(3);
			System.out.println(" ___.-._.-_.-._.-_.-._.-_.-._.- para ir para loja: $loja -._.-_.-.-._.-_.-.-._.-_.-.___");
			System.out.println("||´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´||");
			System.out.println("||´´´´´´´´´´´´´Escreva para ganhar moedas: " + elementoAleatorio + " ´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
			System.out.print("||´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´Resposta: "); resp = sc.next();
			System.out.println("||´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´||");
			System.out.println("-._.-_.-._.-_.-._.-_.-._.-_.-._.-_.-.-._.-.-_.-.-._.-.-_.-.-._.-._.-._.-._.-_.-._.-._.-");
			Ultilit.espacoLimpo(3);
			
			if(resp.equals("$loja")) {
				
				String mensagemItem1 = item1 ? "R$ 300" : "Comprado";
				String mensagemItem2 = item2 ? "R$ 600" : "Comprado";
				String mensagemItem3 = item3 ? "R$ 1.000" : "Comprado";
				String mensagemItem4 = item4 ? "R$ 5.000" : "Comprado";
				String mensagemItem5 = item5 ? "R$ 100.000" : "Comprado";
				
				  
			      System.out.println(" ____________________________________________________________________________________ ");
			      System.out.println("|         _.......,_   /¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\\     1 - Bonus de 10     | "+ mensagemItem1 +"     |");
			      System.out.println("|       .'        _-; | Bem-vindo a minha loja |    2 - Mutiplicador 2X | "+ mensagemItem2 +"     |");
			      System.out.println("|      /;-._     -_,' | o que vai querer?      |    3 - Bonus de 40     | "+ mensagemItem3 + "   |");
			      System.out.println("|     /  \\  ``\"\"\"` (   \\______________________/     4 - Mutiplicador 4X | "+ mensagemItem4 +"   |");
			      System.out.println("|     |   |  ^   ^ \\                                                                 |");
			      System.out.println("|     /`'`   o  _ o \\                               5 - Comprar a loja  | "+ mensagemItem5 +" |");
			      System.out.println("|     \\_,      ' '  |                                                                |");
			      System.out.println("|       ;.   /.__.' /                                                                |");
			      System.out.println("|     .`._`'._____.'-.                                                               |");
			      System.out.println("|    /`.| `-,.____.-;\\                    Você tem R$"+pontos+"                          ");
			      System.out.println("|   /   |  |      | \\ \\                                                              |");
			      System.out.println("|   |   |  '------' | |                                                             |");
			      System.out.println("|   \\   \\           | /                                                              |");
			      System.out.println("|____________________________________________________________________________________|");
			      System.out.print("| DIGITE: "); String escolha = sc.next();
			      
			      if(escolha.equals("1") && item1){
			    	  
			    	  if(pontos >= 300) {
			    		  pontos = pontos - 300;
			    		  bonus = bonus + 10;
			    		  item1 = false;
			    		  
			    		  System.out.println("VENDEDOR: Obrigado amigo volte sempre tenho muitas coisas pra te vender");
			    	  }else {
			    		  System.err.println("VENDEDOR: VOCE TEM R$"+pontos+" O ITEM VALE R$300. NÃO VAI ME PASSAR A PERNA!");
			    	  }
			    	  
			      }else if(escolha.equals("2") && item2){
			    	  
			    	  if(pontos >= 600) {
			    		  pontos = pontos - 600;
			    		  mutiplicador = mutiplicador * 2;
			    		  item2 = false;
			    		  
			    		  System.out.println("VENDEDOR: Obrigado amigo volte sempre tenho muitas coisas pra te vender");
			    	  }else {
			    		  System.err.println("VENDEDOR: VOCE TEM R$"+pontos+" O ITEM VALE R$600. NÃO VAI ME PASSAR A PERNA!");
			    	  }
			    	  
			      }else if(escolha.equals("3") && item3){
			    	  
			    	  if(pontos >= 1000) {
			    		  pontos = pontos - 1000;
			    		  bonus = bonus + 40;
			    		  item3 = false;
			    		  
			    		  System.out.println("VENDEDOR: Obrigado amigo ainda tenho coisas pra te vender");
			    	  }else {
			    		  System.err.println("VENDEDOR: VOCE TEM R$"+pontos+" O ITEM VALE R$1.000. NÃO VAI ME PASSAR A PERNA!");
			    	  }
			    	  
			      }else if(escolha.equals("4") && item4){
			    	  
			    	  if(pontos >= 5000) {
			    		  pontos = pontos - 5000;
			    		  mutiplicador = mutiplicador * 4;
			    		  item4 = false;
			    		  
			    		  System.out.println("VENDEDOR: Obrigado amigo estou ficando sem nada aqui hehe");
			    	  }else {
			    		  System.err.println("VENDEDOR: VOCE TEM R$"+pontos+" O ITEM VALE R$5.000. NÃO VAI ME PASSAR A PERNA!");
			    	  }
			    	  
			      }else if(escolha.equals("5") && item5){
			    	  
			    	  if(pontos >= 100000) {
			    		  
			    		  System.out.println("VENDEDOR: COMO VOCE TEM TANTA GRANA!! ESTOU RICOOOOO!");
				    	  System.out.println("OBRIGADO POR JOGAR CONSIDERE ISSO COMO O FIM DO JOGO");
				    	  System.out.println("MAS SE QUISER PODE CONTINUAR JOGANDO :D OBRIGADO DE VERDADE POR CHEGAR ATE AQUI");
			    		  
			    	  }else {
			    		  System.err.println("VENDEDOR: HEHEHEHEHEH É IMPOSIVEL VOCE CONSEGUIR ESSA GRANA HEHEHE");
			    	  }
			    	  
			    	  
			    	  
			      }else {
			    	  System.err.println("VENDEDOR: Voce ja comprou isso || eu não entendi o que você quer ");
			      }
			      
			      
				
			}else if (resp.equals(elementoAleatorio)) {
				
				pontos += (elementoAleatorio.length() * mutiplicador) + bonus;
				System.out.println("PONTOS: +("+elementoAleatorio.length()+" * "+mutiplicador+")  ´´´´ BONUS: +"+bonus);
				System.out.println(" _.-._.-_.-._.-_.-. Acertou ._.-._.-_.-._.-_.-");
				System.out.println(" |´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´|");
				System.out.println(" |´´´´´´´´´´´Pontos total:"+pontos+"´´´´´´´´´´´´´´|");
				System.out.println(" |´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´|");
				System.out.println(" -._.-_.-._.-_.-._ Acertou -._.-._.-_.-._.-_.-");

			} else {
				
				System.err.println(" _.-._.-_.-._.-_.-. Errado -._.-._.-_.-._.-_.-");
				System.err.println("|´´´´´´´´´´´´´´´´´Pontos:"+pontos+"´´´´´´´´´´´´´´´´´´");
				System.err.println(" _.-._.-_.-._.-_.-. Errado -._.-._.-_.-._.-_.-");
				
			}
		}
		
	}
	
	
	
}

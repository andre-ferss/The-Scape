package jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class A_Fuga extends JFrame {

	private JButton taltris, jacali, arma, faca, bomba, click, direita, esquerda, next, nextStepTwo, sair1, sair2, tapa,
			btmacarico, btarma2, btcanivete, btdireita, btesquerda, canivete, macarico, arma2, pousar1,pousar2;
	private JPanel pane;
	private JLabel background, relogio, bart, feh, andrew, planet1, planet2, bart1, feh1, andrew1, bart2, feh2, andrew2,
			bart3,skull,livro,runa;
	private Container container;
	private static JTextArea textArea,textArea1,textArea2;
	String planet;
	private JTextField timerField;
	private int count;
	private JProgressBar progressBar;
	private Timer timer;
	private JRadioButton ironia, estupidez, amigavel;
	private ButtonGroup group;
	private ImageIcon imgfundo = new ImageIcon(getClass().getResource("fundo.jpg"));
	private ImageIcon imgtaltris = new ImageIcon(getClass().getResource("Taltris.png"));
	private ImageIcon imgjacali = new ImageIcon(getClass().getResource("Jacali.png"));
	private ImageIcon imgbart = new ImageIcon(getClass().getResource("bart.png"));
	private ImageIcon imgfeh = new ImageIcon(getClass().getResource("feh.png"));
	private ImageIcon imgandrew = new ImageIcon(getClass().getResource("andrew.png"));
	private ImageIcon imgbart1 = new ImageIcon(getClass().getResource("bart1.png"));
	private ImageIcon imgfeh1 = new ImageIcon(getClass().getResource("feh1.png"));
	private ImageIcon imgandrew1 = new ImageIcon(getClass().getResource("andrew1.png"));
	private ImageIcon imgbart2 = new ImageIcon(getClass().getResource("bart2.png"));
	private ImageIcon imgfeh2 = new ImageIcon(getClass().getResource("feh2.png"));
	private ImageIcon imgandrew2 = new ImageIcon(getClass().getResource("andrew2.png"));
	private ImageIcon imgbart3 = new ImageIcon(getClass().getResource("bart3.png"));
	private ImageIcon imgrelogio = new ImageIcon(getClass().getResource("tempo.gif"));
	private ImageIcon imggun = new ImageIcon(getClass().getResource("arma.png"));
	private ImageIcon imgknife = new ImageIcon(getClass().getResource("knife.png"));
	private ImageIcon imggrenade = new ImageIcon(getClass().getResource("grenade.png"));
	private ImageIcon imgskull = new ImageIcon(getClass().getResource("skull.gif"));
	private ImageIcon imgcanivete = new ImageIcon(getClass().getResource("canivete.png"));
	private ImageIcon imgmacarico = new ImageIcon(getClass().getResource("Macarico.png"));
	private ImageIcon imgnave = new ImageIcon(getClass().getResource("nave.png"));
	private ImageIcon imgcapacete = new ImageIcon(getClass().getResource("capacete.png"));
	private ImageIcon imglivro = new ImageIcon(getClass().getResource("livro.png"));
	private ImageIcon imgrunas = new ImageIcon(getClass().getResource("runas.png"));
	private ImageIcon imgtapa = new ImageIcon(getClass().getResource("tapa.png"));


	public A_Fuga() {

		inicializarComponentes();
		definirEventos();

	}

	private void inicializarComponentes() {

		// TALTRIS

		pane = new JPanel(null);

		livro = new JLabel(imglivro);
		livro.setBounds(700, 300, 120, 120);
		livro.setVisible(false);
		pane.add(livro);
		
		runa = new JLabel(imgrunas);
		runa.setBounds(700, 300, 120, 120);
		runa.setVisible(false);
		pane.add(runa);
		
		textArea1 = new JTextArea();
		textArea1.setFont(new Font("04b", 0, 18));
		textArea1.setOpaque(false);
		textArea1.setEditable(false);
		textArea1.setBounds(10, 10, 800, 650);
		textArea1.setForeground(Color.BLACK);
		pane.add(textArea1);
		textArea1.setVisible(false);
		
		textArea2 = new JTextArea();
		textArea2.setFont(new Font("04b", 0, 18));
		textArea2.setOpaque(false);
		textArea2.setEditable(false);
		textArea2.setBounds(10, 900, 800, 650);
		textArea2.setForeground(Color.BLACK);
		pane.add(textArea2);
		textArea2.setVisible(false);

		btdireita = new JButton("Direita");
		btdireita.setBounds(600, 400, 90, 30);
		btdireita.setVisible(false);
		btdireita.setFocusable(false);
		pane.add(btdireita);

		btesquerda = new JButton("Esquerda");
		btesquerda.setBounds(200, 400, 90, 30);
		btesquerda.setVisible(false);
		btesquerda.setFocusable(false);
		pane.add(btesquerda);

		sair1 = new JButton(imgnave);
		sair1.setBounds(800, 200, 120, 120);
		sair1.setBackground(new Color(255, 228, 181));
		sair1.setFocusable(false);
		sair1.setVisible(false);
		pane.add(sair1);

		sair2 = new JButton(imgcapacete);
		sair2.setBounds(800, 500, 120, 120);
		sair2.setBackground(new Color(255, 228, 181));
		sair2.setFocusable(false);
		sair2.setVisible(false);
		pane.add(sair2);

		tapa = new JButton(imgtapa);
		tapa.setBounds(800, 400, 120, 120);
		tapa.setBackground(new Color(255, 228, 181));
		tapa.setFocusable(false);
		tapa.setVisible(false);
		pane.add(tapa);

		btcanivete = new JButton(imgcanivete);
		btcanivete.setBounds(850, 100, 120, 120);
		btcanivete.setBackground(new Color(255, 228, 181));
		btcanivete.setFocusable(false);
		btcanivete.setVisible(false);
		pane.add(btcanivete);

		btmacarico = new JButton(imgmacarico);
		btmacarico.setBounds(850, 300, 120, 120);
		btmacarico.setBackground(new Color(255, 228, 181));
		btmacarico.setFocusable(false);
		btmacarico.setVisible(false);
		pane.add(btmacarico);

		btarma2 = new JButton(imggun);
		btarma2.setBounds(850, 500, 120, 120);
		btarma2.setBackground(new Color(255, 228, 181));
		btarma2.setFocusable(false);
		btarma2.setVisible(false);
		pane.add(btarma2);

		pousar1 = new JButton("Pousar no meio da cidade");
		pousar1.setBounds(50, 680, 400, 30);
		pousar1.setFont(new Font("04b", 0, 18));
		pousar1.setBackground(new Color(255, 228, 181));
		pousar1.setForeground(Color.BLACK);
		pane.add(pousar1);
		pousar1.setVisible(false);

		pousar2 = new JButton("Pousar em um local escondido");
		pousar2.setBounds(500, 680, 500, 30);
		pousar2.setBackground(new Color(255, 228, 181));
		pousar2.setFont(new Font("04b", 0, 18));
		pousar2.setForeground(Color.BLACK);
		pane.add(pousar2);
		pousar2.setVisible(false);

		macarico = new JButton(imgmacarico);
		macarico.setBounds(850, 100, 120, 120);
		macarico.setBackground(new Color(255, 228, 181));
		pane.add(macarico);
		macarico.setVisible(false);

		canivete = new JButton(imgcanivete);
		canivete.setBounds(850, 300, 120, 120);
		canivete.setBackground(new Color(255, 228, 181));
		pane.add(canivete);
		canivete.setVisible(false);

		arma2 = new JButton(imggun);
		arma2.setBounds(850, 500, 120, 120);
		arma2.setBackground(new Color(255, 228, 181));
		pane.add(arma2);
		arma2.setVisible(false);

		pane.add(pousar1);
		pane.add(pousar2);
		pane.add(macarico);
		pane.add(canivete);
		pane.add(arma2);

		// JACALI
		container = getContentPane();
		

		bart = new JLabel(imgbart);
		bart.setBounds(20, 200, 576, 288);

		feh = new JLabel(imgfeh);
		feh.setBounds(170, 350, 576, 288);

		andrew = new JLabel(imgandrew);
		andrew.setBounds(320, 500, 576, 288);
		
		background = new JLabel(imgfundo);
		background.setBounds(0, 0, 1024, 768);
		
		pane.setOpaque(true);

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setEditable(false);
		textArea.setBounds(30, 50, 700, 200);
		textArea.setForeground(Color.BLACK);
		pane.add(textArea);

		planet1 = new JLabel("Taltris");
		planet1.setBounds(660, 200, 576, 288);
		planet1.setForeground(Color.BLACK);
		planet1.setFont(new Font("04b", 0, 18));
		pane.add(planet1);

		planet2 = new JLabel("Jacali");
		planet2.setBounds(670, 400, 576, 288);
		planet2.setForeground(Color.BLACK);
		planet2.setFont(new Font("04b", 0, 18));
		pane.add(planet2);

		taltris = new JButton(imgtaltris);
		taltris.setBounds(650, 200, 120, 120);
		taltris.setBackground(new Color(255, 228, 181));
		taltris.setFocusable(false);
		pane.add(taltris);

		jacali = new JButton(imgjacali);
		jacali.setBounds(650, 400, 120, 120);
		jacali.setBackground(new Color(255, 228, 181));
		jacali.setFocusable(false);
		pane.add(jacali);

		pane.add(bart);
		pane.add(feh);
		pane.add(andrew);

		pane.add(background);

		container.add(pane);

	}

	private void definirEventos() {
		pousar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {					
				gameOver("GAME OVER\n"
						+ "No meio da cidade,\n"
						+ "voce acaba ficando muito exposto\n"
						+ "e acaba sofrendo um ataque de alienigenas\n"
						+ "carniceiros mortos de fome!\n"
						+ "Todos foram comidos!");
			}
	});	

	pousar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			textArea1.setText(
					"Perto da cidade tem\n\n"
					+"um lugar escondido,\n\n"
					+"vamos pousar ali perto -diz Bart\n\n"
					+"Bart e seus amigos\n\n"
					+"decidem investigar\n\n"		
					+"Entao eles pousam\n\n"
					+"no local indicado.");
			}
		});
	
	arma2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {			
		gameOver("GAME OVER\nBart nao acerta o Alien.\n"
				+ "Todos morrem! Bart puxa sua arma de fogo\n"
				+ " e da um tiro no Alien,\n"
				+ "mas sua pontaria e horrivel e ele\n"
				+ "nao acerta a sua cabeca,\n"
				+ "assim o Alien mata um por um.");
	}
});
		
	macarico.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		gameOver("GAME OVER\n Bart nao queima o Alien,\n"
				+ "pois ele e imune ao fogo!\n"
				+ "Bart tenta queimar o Alien com seu macarico,\n"
				+ "mas o Alien e imune ao fogo.\n"
				+ "Bart tem sua cabeça arrancada pelas maos do Alien.\n"
				+ "Andrew grita de desespero vendo Bart morto,\n"
				+ "o Alien parte para cima dele, Feh o protege,\n"
				+ "mas morre tambem dizendo suas palavras finais:\n"
				+ "-Corra Andrew! Andrew correu chorando para fora do lugar,\n"
				+ "mas e encontrado pelos outros e morto com seus membros\n"
				+ "sendo arrancados um por um.\n"
				+ "Todos morreram e foram servidos na janta");
	}});

		// TALTRIS
		taltris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				planetaTaltris();
			}
		});
		// AÇÕES AO POUSAR A NAVE
		pousar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				pousar();
			}
		});

		pousar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				pousar();
			}
		});

		// AÇÕES AO SAIR DA NAVE
		sair1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				sairDaNave1();

			}
		});

		sair2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				sairDaNave2();
				decisao();
			}
		});

		// AÇÕES PARA A PRIMEIRA ESCOLHA DE OPÇÕES DAS FERRAMENTAS

		btmacarico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btmacaricoCRT();
			}
		});

		btarma2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				btarmaERD();
			}

		});

		btcanivete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				btcaniveteERD();
			}
		});

		// TAPA NA CARA
		tapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				tapa();
			}
		});

		// AÇÕES PARA A SEGUNDA ESCOLHA DE OPÇÕES DAS FERRAMENTAS

		canivete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				caniveteCRT();
			}
		});

		macarico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				opcErrada2();
			}
		});

		arma2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				opcErrada2();
			}
		});

		// JACALI

		jacali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				newGame("Feh consegue ver naves alienigenas a frente.\n\n"
						+ "-Cuidado, estamos sendo atacados. Nao deixe nos atingirem.\n\n" + "Diz Feh para Bart.",
						"Jacali");

			}
		});

	}

	// TALTRIS
	public void planetaTaltris() {

		textArea1.setText(
				"-Feh, Andrew, olhem, o planeta Taltris.\n\n"
				+ "Parece que tem uma cidade la.\n\n"
				+ "Andrew diz.\n\n"
				+ "-Entao devem ter pessoas la.\n\n"
				+ "Feh diz.\n\n"
				+ "-Estamos em um planeta que nunca fomos\n\n"
				+ "e voce diz que devem ter pessoas la dentro?\n\n"
				+ "E mais facil dizer que devem ter alienigenas la.\n\n"
				+ "-Nao importa, parem voces 2 de discutir\n\n"
				+ "e vamos pousar."
				+ "Bart e seus amigos\n\n"
				+ "possuem duvidas onde pousar a nave\n\n"
				+ "Voce deve escolher uma opcao.\n\n"
				+ "Lembre-se, todas as escolhas tem consequencias\n\n"
				+ "Os tres viajantes pousaram a nave,\n\n"
				+ "o que fazer agora? Escolha uma opcao!");

		textArea1.setVisible(true);
		
		taltris.setVisible(false);
		jacali.setVisible(false);
		pousar1.setVisible(true);
		pousar2.setVisible(true);
		textArea.setVisible(false);
		bart.setVisible(false);
		andrew.setVisible(false);
		feh.setVisible(false);
		planet1.setVisible(false);
		planet2.setVisible(false);

	}

	public void pousar() {
		

		pousar1.setVisible(false);
		pousar2.setVisible(false);
		sair1.setVisible(true);
		sair2.setVisible(true);
	}

	public void sairDaNave1() {

				
		gameOver("GAME OVER\n\n"
				+ "Os tres acabam morrendo,\n\n"
				+ "pois a quantidade de oxigenio\n\n"
				+ "nao e o suficiente!");
	}

	public void sairDaNave2() {

		textArea1.setText("Saindo da nave, percebem\n\n"
						+ "que o oxigenio e escasso,\n\n"
						+ "portanto, devem usar o capacete\n\n"
				        + "Bart ja pensa em ir a\n\n"
				        + "cidade, mas antes ele pega\n\n"
				        + "3 equipamentos da nave\n\n"
				        + "para caso algo ocorra.\n\n"
				        + "Uma arma de fogo, um canivete e um macarico\n\n"
				        + "No caminho ate ela, eles avistam uma\n\n"
				        + "caverna com indicios de que alguem morava la.");
	}

	public void decisao() {

		sair1.setVisible(false);
		sair2.setVisible(false);

		textArea2.setText("Bart e seus amigos devem tomar uma decisao:\n\n"
				+ "Entrar ou nao na caverna.");

		String ent = JOptionPane.showInputDialog(null, "Deseja entrar? sim ou nao?");

		if (ent.equalsIgnoreCase("Sim")) {

			livro.setVisible(true);
			
			textArea1.setText("Bart e seus amigos decidiram entrar na caverna\n\n"
							+"Bart e seus amigos vasculham o lugar e encontram\n\n"
							+"varios objetos que ja conheciam no seu planeta.\n\n"
							+"Copo, panela, jogos.\n\n"
							+"La dentro eles encontram um livro com senha,\n\n"
							+"uma especie de diario ou algo assim.\n\n"
							+"Parece que para abrir precisa de uma\n\n"
							+"senha de 8 numeros.\n\n"
							+"Dica: Aniversario do CEAP de 2022.");

			String senha;

			do {
				senha = JOptionPane.showInputDialog(null, "Digite a possivel senha (use SOMENTE os numeros da data):");

			} while (!(senha.equalsIgnoreCase("15052022")));
			
			livro.setVisible(false);
			runa.setVisible(true);

			textArea1.setText("O livro abriu! Voce olha o livro\n\n"
					+ "Ola, meu nome e JUCARO,\n\n"
					+ "e vivo nesse planeta ha muito tempo.\n\n"
					+ "Se voce achou o livro e conseguiu a senha,\n\n"
					+ "parabens, voce esta prestes a ouvir o nome de animais\n\n"
					+ "que eu consegui descobrir\n\n"
					+ "que nao existem na Terra.\n\n"
					+ "Aqui vao os nomes: Efelante, Riconeronte, Cujura,\n"
					+ "Vacalo, Vacalo Chirudo, Trigue, Carrocho, Golira,\n"
					+ "Camaco, Gifara, Lartaguixa,\n"
					+ "Paraguaio, Morsego, Bulafo, Ligro, Cirigueijo,\n"
					+ "Arenha, Chimzampe, Calaguino,\n"
					+ "Bamga, Lula Mosusco, Camilo, Malha, Caramao,\n"
					+ "Caraje, Hipototomo.\n\n"
					+ "PARABENS VC DESCOBRIU O EASTER EGG!!");
		}

		if (ent.equalsIgnoreCase("Nao")) {

			textArea1.setText("Quando chegam no portao,\n"
					+"alienigenas com uma cabeca grande,\n"
					+"dedos largos em maos com bracos finos\n"
					+"e pernas longas e finas e uma cor\n"
					+"de pele vermelha\n\n"
					+"impede eles.\n"
					+"Os Aliens discutem baixinho algo, parece ser\n\n"
					+"sobre o que fazer com eles.\n\n"
					+"Feh diz baixinho para o Andrew:\n\n"
					+"-Eu disse que eram alienigenas\n\n"
					+"Com medo, os viajantes devem responder a criatura,\n\n"
					+"mas como?\n\n"
					+"Um deles amarra os 3 e os leva para\n\n"
					+"ver o chefe deles.\n\n"
					+"Chegando la eles avistam o chefe,\n\n"
					+"uma criatura grande e forte, diferente dos outros.\n\n"
					+"Ele recebe um relatorio sobre eles,\n\n"
					+"entao a criatura diz: \n\n"
					+"Bart deve escolher uma opcao para\n\n"
					+"libertar seus amigos,\n\n"
					+"cuidado! Apenas uma e a certa\n\n"
					+"-O que voces vieram fazer no meu planeta?");
			
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"O que devem dizer? Digite a opcao desejada!\n"
							+ "1: -Viemos em Paz, queremos ser amigos e descobrir se o planeta e habitavel para nossa populacao poder vir para ca.\n"
							+ "2: -Viemos exterminar a sua raca!\n" + "3: -Por que voce e tao gordao?"));

			if (opcao == 1) {

				textArea1.setText(
						 "A criatura pensa e responde:-Horas,\n"
						+ "podia me dizer isso antes.\n"
						+ "Rapazes, sirvam comida e bebidas para\n"
						+ "nossos convidados!\n"
						+ "mas para nao fazerem desfeita e por acharem\n"
						+ "que foi dado a comida de bom grado, eles comeram.\n"
						+ "Acharam delicioso mesmo com a aparencia diferente.\n"
						+ "mas depois de um tempo,\n"
						+ "os 3 comecaram a se sentir sonolentos por algum motivo.\n"
						+ "Momentos depois, Bart acorda\n" 
						+ "Entao percebe que ele e seus amigos foram amarrados\n"
						+ "de cabeca para baixo em algum lugar escuro, que estava\n"
						+ "sendo iluminado por tochas.\n"
						+ "-Onde eu estou? Andrew, Feh, acordem.\n"
						+ "Eles nao respondem.\n"
						+ "Bart consegue ver corpos com a barriga aberta,\n"
						+ "mas vazios,sem sangue vazando ou suas entranhas.\n"
						+ "Um Alien chega, Bart fecha os olhos fingindo\n"
						+ "que estava inconsciente ainda.\n"
						+ "O Alien diz: \n"
						+ "-Humanos pateticos, quando vao perceber que esse\n"
						+ "planeta nao e para eles? Bom, quanto mais melhor.\n"
						+ "A carne deles e seu sangue e muito gostosa de\n"
						+ "se comer,nao paro de pensar nela por um momento.\n"
						+ "Logo, logo eles vao acordar, melhor abrir suas\n"
						+ "barrigas e coletar seu sangue e seus orgaos para\n"
						+ "a janta de hoje.Vou pegar os equipamentos\n"
						+ "-Vermelho,laranja,amarelo,verde,azul,anil,violeta.\n"
						+ "Que lindo!\n"
						+ "O alien sai da sala. Bart desesperado percebe\n"
						+ "a enrascada que se meteu.Ele tenta acordar os outros,\n"
						+ "mas eles nao respondem.\n"
						+ "Bart precisa arrumar um jeito de sair dali."
						);

				btmacarico.setVisible(true);
				btcanivete.setVisible(true);
				btarma2.setVisible(true);
			}

			if (opcao == 2) {

				
				gameOver("GAME OVER -Voce esta ficando louco,\n"
						+ "Bart? -Diz Feh\n"
						+ "Bart e seus amigos ameacaram\n"
						+ "o chefao e foram mortos");
			}

			if (opcao == 3) {
				
				gameOver("GAME OVER -Voce esta ficando louco,\n"
						+ "Bart?- Diz Feh\n"
						+ "Bart e seus amigos ofenderam\n"
						+ "o chefao e foram mortos");

			}

		}
	}

	// OPÇÃO CERTA 1
	public void btmacaricoCRT() {
		textArea1.setText(
				 "Bart pega o macarico que estava guardado em um\n\n"
				 +"de seus bolsos e resolve queimar a corda que\n\n"
				 +"estava presa as suas pernas. Ele queima e cai no chao.\n\n"
				 +"Bart ve seus amigos e precisa acorda-los.\n\n"
				 +"Decide dar um tapa neles\n\n"
				 +"(Se ele for muito forte, pode gerar danos!\n\n"
				 +"A forca pode variar de 0 a 10)"
				);

		btmacarico.setVisible(false);
		btcanivete.setVisible(false);
		btarma2.setVisible(false);
		tapa.setVisible(true);

	}

	// TAPA
	public void tapa() {
		int num = (int) (Math.random() * 10);

		if (num >= 7) {

			gameOver("GAME OVER\n\"Bart usa muita forca\n"
					+"e acaba matando seus amigos\n"
					+"A forca foi de "+ num +".\n"
					+"Um tapa muito forte!\n"
					+"acabou matando seus amigos!");
		}

		if (num >= 1 && num < 7) {

			textArea1.setText("Novamente, Bart deve utilizar uma de suas\n"
					+ "ferramentas,\n"
					+ "escolha um opcao:\n"
					+ "A forca foi de " + num + ". Nao tao forte!\n"
					+ "Acordou seus amigos!\n"
					+ "Os dois acordam e dizem: \n"
					+ "-Ai minha cabeca!\n" + "Bart diz:\n"
					+ "-Feh, Andrew, acordem, precisamos dar o fora daqui.\n" 
					+ "Andrew e Feh perguntam:\n"
					+ "-Onde estamos? Por que estou amarrado?\n" 
					+ "Bart responde:\n"
					+ "-Explico tudo depois, precisamos sair daqui\n"
					+ "ou vamos ser mortos.\n"
					+ "Bart passa o macarico para Feh e Andrew,\n"
					+ "fazendo os dois se soltarem.\n"
					+ "O Alien volta e olha os 3 soltos, imediatamente\n"
					+ "ele manda um tipo de sinal\n"
					+ "para os outros, avisando que eles se soltaram,\n"
					+ "depois parte para cima deles.");

			tapa.setVisible(false);
			macarico.setVisible(true);
			canivete.setVisible(true);
			arma2.setVisible(true);

		}
	}

	// OPCAO CERTA 2

	public void caniveteCRT() {

		macarico.setVisible(false);
		canivete.setVisible(false);
		arma2.setVisible(false);
		
		textArea1.setText("Andrew mata o Alien! Hora de fugir\n"
						+"Andrew pega seu canivete cego, perfurando\n"
						+"a cabeca do Alien,assim o matando.\n"
						+"Bart agradece e decidem dar o fora dali.\n"
						+"Os amigos sao impedidos de fugir!\n"
						+"Ha uma porta no caminho\n"
						+"Porta com senha! O painel da porta\n"
						+"parece ter 7 botoes\n"
						+"com cores diferentes.\n"
						+"Bart diz:\n"
						+"-Precisamos acertar a ordem ou\n"
						+"nunca sairemos daqui.");

		String senha2;
		do {

			senha2 = JOptionPane.showInputDialog(null,
					"Digite a possível ordem da senha, separando as cores por vírgula! (DICA: 7 cores do arco-íris)");

			if (!(senha2.equalsIgnoreCase("vermelho, laranja, amarelo, verde, azul, anil, violeta"))) {
				JOptionPane.showMessageDialog(null, "ERRADO!");
			}

		} while (!(senha2.equalsIgnoreCase("vermelho, laranja, amarelo, verde, azul, anil, violeta")));

		textArea1.setText("A porta abriu! Os viajantes conseguiram sair.\n"
						+ "Quando sairam do lugar, eles avistaram a nave\n"
						+ "que nao estava tao longe.Correm ate ela e Feh diz: \n"
						+ "-Eles estao vindo, rapido!\n"
						+ "Quando estavam correndo, eles foram encurralados,\n"
						+ "logo em seguida Feh diz: \n"
						+ "-Eu vou abrir caminho, voces corram ate a nave e nao\n"
						+ "olhem para tras, entendido?!\n"
						+ "Andrew diz:\n"
						+ "-Nao, nao faz isso.\n"
						+ "Bart pensa e responde:\n"
						+ "-Esta bem.\n"
						+ "Feh usa seu corpo para abrir o caminho\n"
						+ "empurrando e batendo neles.\n"
						+ "Os dois correm, mas Andrew olha para tras\n"
						+ "e nao aguenta ver aquilo,\n"
						+ "entao ele corre para ajudar.\n"
						+ "Bart grita para nao ir, mas Andrew e pego\n"
						+ "pelo chefe deles e morto\n"
						+ "imediatamente com um golpe na cabeça que a arrancou\n"
						+ "Bart chora e corre ate a nave.\n"
						+ "Quando chega na nave, ele liga os motores\n"
						+ "e foge. Logo em seguida diz:\n"
						+ "-Eu vou vingar voces matando um por um\n"
						+ "daqueles desgracados,eu juro!\n"
						+ "FIM");

	}

	// OPÇÕES ERRADAS 1
	public void btcaniveteERD() {
		gameOver("GAME OVER\n O alien percebe a acao de Bart e o mata!\n"
				+ "Bart tenta cortar a corda usando o canivete,\n"
				+ "porem ele e tao cego que demora muito\n"
				+ "e o alienigena chega antes dele se soltar.\n"
				+ "Suas entranhas foram rasgadas!");
	}

	public void btarmaERD() {
		gameOver("GAME OVER\n O alien ouve Bart e o mata!\n"
				+ "Bart usa a arma de fogo para escapar,\n"
				+ "porem ela faz muito barulho e o alienigena\n"
				+ "o percebe e com ele faz uma sopa de entranhas.");
	}

	// OPÇÕES ERRADAS 2
	public void opcErrada2() {

	}

	// JACALI
	public void newGame(String text, String planet) {

		this.planet = planet;

		feh1 = new JLabel(imgfeh1);
		feh1.setBounds(650, 200, 576, 288);

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(text);
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(40, 80, 700, 300);

		esquerda = new JButton("<===");
		esquerda.setFocusable(false);
		esquerda.setBounds(120, 300, 100, 40);
		esquerda.setBackground(new Color(255, 228, 181));
		esquerda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				deathPorcentage("Andrew diz.\n\n" + "   -Conseguimos! Achei facil haha.\n\n" + "Bart responde.\n\n"
						+ "   -Concordo haha.\n\n" + "Feh diz gritando.\n\n"
						+ "   -Presta atencao Bart! Vamos bater!\n\n");

			}
		});

		direita = new JButton("===>");
		direita.setFocusable(false);
		direita.setBounds(320, 300, 100, 40);
		direita.setBackground(new Color(255, 228, 181));
		direita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				deathPorcentage("Andrew diz.\n\n" + "   -Conseguimos! Achei facil haha.\n\n" + "Bart responde.\n\n"
						+ "   -Concordo haha.\n\n" + "Feh diz gritando.\n\n"
						+ "   -Presta atencao Bart! Vamos bater!\n\n");

			}
		});

		relogio = new JLabel(imgrelogio);
		relogio.setBounds(400, 400, 230, 205);

		timerField = new JTextField("5");
		timerField.setEditable(false);
		timerField.setBorder(null);
		timerField.setOpaque(false);
		timerField.setFont(new Font("04b", 0, 35));
		timerField.setForeground(Color.BLACK);
		timerField.setBounds(500, 300, 80, 80);

		startCountDown();

		pane = new JPanel(null);
		pane.setOpaque(true);

		pane.add(timerField);
		pane.add(relogio);
		pane.add(esquerda);
		pane.add(direita);
		pane.add(textArea);
		pane.add(feh1);
		container.removeAll();
		pane.add(background);
		container.add(pane);
		container.validate();

	}

	public void deathPorcentage(String text) {

		if ((int) (Math.random() * 0) == 1) {

			gameOver("GAME OVER");

		} else {

			count++;

			timer.cancel();
			timerField.setText("3");

			startCountDown();

			if (count == 5) {

				timer.cancel();

				chellangeComplete(text);
				textArea.setOpaque(false);

			}

		}

	}

	public void planetaJacali() {

		bart1 = new JLabel(imgbart1);
		bart1.setBounds(650, 100, 576, 288);

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(
				"Rumo ao planeta Jacali em sua nave, eles acabam batendo em algo e milagrosamente a nave nao explodiu. Bart preocupado pergunta:"
						+ "\n\n- Todos bem?\n\nOs dois respondem:");
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(40, 80, 500, 300);

		ironia = new JRadioButton("Nao, nao, a nave bateu e eu to morrendo aqui. HAHAHA (TOM IRONICO)");
		ironia.setFocusable(false);
		ironia.setOpaque(false);
		ironia.setFont(new Font("04b", 0, 16));
		ironia.setForeground(Color.BLACK);
		ironia.setBounds(50, 300, 1000, 30);
		ironia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				newDialog(
						"Minutos depois eles descobrem que a coisa que eles bateram era uma nave alienigena que estava com seu modo de camuflagem ativo. Eles escutam outro barulho, "
								+ "mas dessa vez e um tipo de *grito*, entao eles resolvem dar uma olhada. Quando chegam no local do grito, avistam uma criatura de pernas longas, com uma cauda "
								+ "larga e aparentemente muito dura, dentes afiados capazes de romper uma liga de metal e olhos com uma fenda no meio. A criatura estava comendo uma pessoa, "
								+ "imediatamente Feh e Andrew perguntam baixinho:\n\n"
								+ "O que e aquilo e quem e a pessoa que ela esta comendo!? \n\n" + "Bart responde.\n\n"
								+ "   -Parece ser uma das pessoas do grupo passado da nossa missao, mas eu nao faco ideia do que aquilo seja.\n\n"
								+ "Andrew estava hiperventilando muito alto, Feh e Bart tentam acalma-lo, mas a criatura escuta e corre atras deles. Imediatamente Bart grita:\n\n");

			}
		});

		estupidez = new JRadioButton("Mas e claro que nao, seu idiota! (TOM ESTUPIDO)");
		estupidez.setFocusable(false);
		estupidez.setOpaque(false);
		estupidez.setFont(new Font("04b", 0, 16));
		estupidez.setForeground(Color.BLACK);
		estupidez.setBounds(50, 350, 800, 30);
		estupidez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				newDialog(
						"Minutos depois eles descobrem que a coisa que eles bateram era uma nave alienigena que estava com seu modo de camuflagem ativo. Eles escutam outro barulho, "
								+ "mas dessa vez e um tipo de *grito*, entao eles resolvem dar uma olhada. Quando chegam no local do grito, avistam uma criatura de pernas longas, com uma cauda "
								+ "larga e aparentemente muito dura, dentes afiados capazes de romper uma liga de metal e olhos com uma fenda no meio. A criatura estava comendo uma pessoa, "
								+ "imediatamente Feh e Andrew perguntam baixinho:\n\n"
								+ "O que e aquilo e quem e a pessoa que ela esta comendo!? \n\n" + "Bart responde.\n\n"
								+ "   -Parece ser uma das pessoas do grupo passado da nossa missao, mas eu nao faco ideia do que aquilo seja.\n\n"
								+ "Andrew estava hiperventilando muito alto, Feh e Bart tentam acalma-lo, mas a criatura escuta e corre atras deles. Imediatamente Bart grita:\n\n");

			}
		});

		amigavel = new JRadioButton("Sim, estamos! (TOM AMIGAVEL)");
		amigavel.setFocusable(false);
		amigavel.setOpaque(false);
		amigavel.setFont(new Font("04b", 0, 16));
		amigavel.setForeground(Color.BLACK);
		amigavel.setBounds(50, 400, 800, 30);
		amigavel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				newDialog(
						"Minutos depois eles descobrem que a coisa que eles bateram era uma nave alienigena que estava com seu modo de camuflagem ativo. Eles escutam outro barulho, "
								+ "mas dessa vez e um tipo de *grito*, entao eles resolvem dar uma olhada. Quando chegam no local do grito, avistam uma criatura de pernas longas, com uma cauda "
								+ "larga e aparentemente muito dura, dentes afiados capazes de romper uma liga de metal e olhos com uma fenda no meio. A criatura estava comendo uma pessoa, "
								+ "imediatamente Feh e Andrew perguntam baixinho:\n\n"
								+ "O que e aquilo e quem e a pessoa que ela esta comendo!? \n\n" + "Bart responde.\n\n"
								+ "   -Parece ser uma das pessoas do grupo passado da nossa missao, mas eu nao faco ideia do que aquilo seja.\n\n"
								+ "Andrew estava hiperventilando muito alto, Feh e Bart tentam acalma-lo, mas a criatura escuta e corre atras deles. Imediatamente Bart grita:\n\n");

			}
		});

		pane = new JPanel(null);
		pane.setOpaque(true);

		group = new ButtonGroup();
		group.add(ironia);
		group.add(estupidez);
		group.add(amigavel);

		pane.add(ironia);
		pane.add(estupidez);
		pane.add(amigavel);
		pane.add(textArea);
		pane.add(bart1);
		container.removeAll();
		pane.add(background);
		container.add(pane);
		container.validate();

	}

	public void newDialog(String text) {

		andrew2 = new JLabel(imgandrew2);
		andrew2.setBounds(700, 300, 576, 288);

		feh2 = new JLabel(imgfeh2);
		feh2.setBounds(650, 500, 576, 288);

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(text);
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(25, 60, 500, 1000);

		next = new JButton("Prosseguir");
		next.setFocusable(false);
		next.setBounds(700, 100, 100, 40);
		next.setBackground(new Color(255, 228, 181));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textArea.setText("   -Corram!\n\n"
						+ "Entao eles correm desesperados, mas a criatura e muito rapida e acaba puxando Andrew pelas pernas. Andrew grita por socorro, mas Bart e Feh ja estao muito longe e nao conseguem escutar. Bart e Feh encontram equipamentos num lugar da nave. Uma Arma de fogo, uma Arma Branca e uma especie de Bomba.\n\n"
						+ "   -Feh, cade o Andrew? \n\n" + "Feh responde:\n\n"
						+ "   -Ele nao estava atras da gente? Ai meu deus, a gente vai morrer.\n\n"
						+ "-Se acalma Feh, vamos levar tudo isso e correr ate a nave. A gente vai sair daqui!\n\n"
						+ "Eles avistaram a criatura e correram de novo e dessa vez a criatura pega o Feh.\n\n"
						+ "   -Feh, nao!\n\n");

				next.setVisible(false);
				nextStepTwo.setVisible(true);

				nextStepTwo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

						fight("Bart tem que pensar rapido e lembra que pegou 3 itens na sala que acharam. Agora, qual escolher?");

					}
				});

			}
		});

		nextStepTwo = new JButton("Prosseguir");
		nextStepTwo.setFocusable(false);
		nextStepTwo.setVisible(false);
		nextStepTwo.setBounds(700, 100, 100, 40);
		nextStepTwo.setBackground(new Color(255, 228, 181));

		pane = new JPanel(null);
		pane.setOpaque(true);

		pane.add(next);
		pane.add(nextStepTwo);
		pane.add(textArea);
		pane.add(andrew2);
		pane.add(feh2);
		container.removeAll();
		pane.add(background);
		container.add(pane);
		container.validate();

	}

	public void fight(String text) {

		bart3 = new JLabel(imgbart3);
		bart3.setBounds(150, 300, 576, 288);

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(text);
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(30, 80, 500, 500);

		arma = new JButton(imggun);
		arma.setBounds(700, 150, 120, 120);
		arma.setBackground(new Color(255, 228, 181));
		arma.setFocusable(false);
		arma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				weapon("Bart pega a arma de fogo e avista uma porta. Ele tenta atirar, mas a arma emperra.\n\nCom suas maos ligeiras ele tenta arrumar a arma.",
						"Arrumar");
			}
		});

		faca = new JButton(imgknife);
		faca.setBounds(700, 350, 120, 120);
		faca.setBackground(new Color(255, 228, 181));
		faca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				weapon("Bart decide usar a faca, mas ela esta sem fio.\n\nCom suas maos ligeiras ele tenta amolar a faca.",
						"Amolar");
			}
		});

		bomba = new JButton(imggrenade);
		bomba.setBounds(700, 550, 120, 120);
		bomba.setBackground(new Color(255, 228, 181));
		bomba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int deathChance = (int) (Math.random() * 2);

				if (deathChance == 0) {

					gameOver(
							"\n\n\t                  Game Over\n\nBart resolve usar a bomba. Ele tira o pino porem ela explode\nimediatamente em sua mao.");

				} else {

					gameOver(
							"\n\n\t                  Game Over\n\nBart resolve usar a bomba. Ele joga na criatura e a criatura come, \ndepois joga Feh pra longe, fazendo ele bater a cabeca com forca, \nque comeca a inchar.\n\n"
									+ "   -Feh, vamos, levanta!\n\n"
									+ "Feh estava inconsciente. A criatura os explode junto dela. \n\n");

				}

			}
		});

		pane = new JPanel(null);
		pane.setOpaque(true);

		pane.add(arma);
		pane.add(faca);
		pane.add(bomba);
		pane.add(textArea);
		pane.add(bart3);
		container.removeAll();
		pane.add(background);
		container.add(pane);
		container.validate();

	}

	public void weapon(String text, String action) {

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(text);
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(40, 80, 500, 200);

		timerField = new JTextField("5");
		timerField.setOpaque(false);
		timerField.setEditable(false);
		timerField.setBorder(null);
		timerField.setFont(new Font("04b", 0, 18));
		timerField.setForeground(Color.BLACK);
		timerField.setBounds(500, 300, 20, 20);

		relogio = new JLabel(imgrelogio);
		relogio.setBounds(600, 400, 230, 205);

		click = new JButton(action);
		click.setBounds(300, 300, 100, 30);
		click.setBackground(new Color(255, 228, 181));
		click.setFocusable(false);
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (progressBar.getValue() == 100) {

					timer.cancel();

					if (action.equals("Arrumar")) {

						weaponFixed(
								"Ele atira na porta, a porta abre, mas eles estao no espaco, ou seja, eles sao puxados para fora. Bart consegue ver a criatura explodindo do lado de fora da nave.\n\n"
										+ "   -Parece que voce nao consegue sobreviver 1 segundo fora da sua nave. \n\n"
										+ "Imediatamente Bart perde a consciencia. Horas depois Bart acorda em uma sala com varias pessoas.\n\n"
										+ "   -Onde estou? Quem sao voces?\n\n"
										+ "   -Somos a equipe de resgate, vimos daqui da terra que sua nave ficou inoperante, entao imediatamente fomos ate o local e avistamos voce flutuando no espaco.\n\n"
										+ "Bart se lembra de seus amigos mortos e comeca a chorar. Fim!");

					} else if (action.equals("Amolar")) {

						gameOver(
								"\n\n\n\n\t                       Game Over\n\nBart resolve usar a faca amolada e avanca para cima da criatura,\nvisando a cabeca. A criatura defende com a calda, "
										+ "mas a mesma e cortada ao meio. \nBart convencido de que ira mata-la, e pego desprevenido, sendo empurrado para longe, \ndepois sua faca e quebrada.\n\n"
										+ "A criatura arranca a cabeca de Feh com seus dentes e parte para cima de Bart.\n\n"
										+ "   -Eu vou matar voce sua criatura feia!");

					}

				}
				progressBar.setValue(progressBar.getValue() + 5);

			}
		});

		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(255, 215, 0));
		progressBar.setBounds(200, 500, 300, 30);

		startCountDown();

		pane = new JPanel(null);
		pane.setOpaque(true);

		pane.add(timerField);
		pane.add(textArea);
		pane.add(click);
		pane.add(progressBar);
		pane.add(relogio);
		container.removeAll();
		pane.add(background);
		container.add(pane);
		container.validate();

	}

	public void weaponFixed(String text) {

		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(text);
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(40, 80, 500, 500);

		pane = new JPanel(null);
		pane.setOpaque(true);

		pane.add(textArea);
		container.removeAll();
		pane.add(background);
		container.add(pane);
		container.validate();

	}

	public void gameOver(String message) {

		pane = new JPanel(null);
		pane.setOpaque(true);
		pane.setBackground(Color.BLACK);
		
		skull = new JLabel(imgskull);
		skull.setBounds(300, 500, 350, 200);
		
		textArea = new JTextArea(message);
		textArea.setBounds(10, 10, 1000, 400);
		textArea.setEditable(false);
		textArea.setFont(new Font("04b", 0, 26));
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);


		pane.add(textArea);
		pane.add(skull);
		container.removeAll();
		container.add(pane);
		container.validate();

	}

	public void chellangeComplete(String text) {

		andrew1 = new JLabel(imgandrew1);
		andrew1.setBounds(700, 100, 576, 288);

		bart2 = new JLabel(imgbart2);
		bart2.setBounds(650, 300, 576, 288);

		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(text);
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(40, 80, 500, 300);

		pane = new JPanel(null);
		pane.setOpaque(true);

		next = new JButton("Prosseguir");
		next.setFocusable(false);
		next.setBounds(200, 500, 100, 40);
		next.setBackground(new Color(255, 228, 181));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (planet.equals("Jacali")) {

					planetaJacali();

				} else {

					planetaTaltris();

				}

			}
		});

		pane.add(next);
		pane.add(textArea);
		pane.add(andrew1);
		pane.add(bart2);
		container.removeAll();
		pane.add(background);
		container.add(pane);
		container.validate();

	}

	public void startCountDown() {

		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {

				timerField.setText("" + setInterval());

				try {

					Thread.sleep(500);

					if (Integer.parseInt(timerField.getText()) == 0) {

						gameOver("GAME OVER");

					}

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

			}

		}, 1000, 1000);

	}

	private final int setInterval() {

		if (Integer.parseInt(timerField.getText()) == 1) {
			timer.cancel();
		}

		return Integer.parseInt(timerField.getText()) - 1;
	}

	public static void animacao(JTextArea area, String texto) {

		String textofinal = "";

		for (int i = 0; i < texto.length(); i++) {

			textofinal = textofinal + texto.charAt(i);
			area.setText(textofinal);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String args[]) {

		A_Fuga frame = new A_Fuga();
		frame.setTitle("The-Scape");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);

		animacao(textArea,
				"Bart e um homem de 25 anos que partiu para uma missao em um novo planeta com seus 2 amigos, Feh e Andrew, para descobrir se o mesmo e habitavel.\n\n"
						+ "Escolha o planeta que deseja explorar:");

	}

}

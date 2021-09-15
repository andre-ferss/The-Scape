package jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class A_Fuga extends JFrame{
	
	private JButton taltris,jacali,arma, faca, bomba, click, direita, esquerda, next, nextStepTwo;
	private JPanel pane;
	private JLabel background,relogio,bart,feh,andrew,planet1,planet2,bart1,feh1,andrew1,bart2,feh2,andrew2,bart3;
	private Container container;
	private static JTextArea textArea;
	private String planet;
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
	private ImageIcon imgfeh1= new ImageIcon(getClass().getResource("feh1.png"));
	private ImageIcon imgandrew1 = new ImageIcon(getClass().getResource("andrew1.png"));
	private ImageIcon imgbart2 = new ImageIcon(getClass().getResource("bart2.png"));
	private ImageIcon imgfeh2 = new ImageIcon(getClass().getResource("feh2.png"));
	private ImageIcon imgandrew2 = new ImageIcon(getClass().getResource("andrew2.png"));
	private ImageIcon imgbart3 = new ImageIcon(getClass().getResource("bart3.png"));
	private ImageIcon imgrelogio = new ImageIcon(getClass().getResource("tempo.gif"));
	private ImageIcon imggun = new ImageIcon(getClass().getResource("arma.png"));
	private ImageIcon imgknife = new ImageIcon(getClass().getResource("knife.png"));
	private ImageIcon imggrenade = new ImageIcon(getClass().getResource("grenade.png"));

	public A_Fuga() {
		
		inicializarComponentes();
		definirEventos();
		
	}

	private void inicializarComponentes() {
		
		container = getContentPane();
		
		background = new JLabel(imgfundo);
		background.setBounds(0,0,1024,768);
		
		bart = new JLabel(imgbart);
		bart.setBounds(20,200,576,288);
		
		feh = new JLabel(imgfeh);
		feh.setBounds(170,350,576,288);
		
		andrew = new JLabel(imgandrew);
		andrew.setBounds(320,500,576,288);
		
		pane = new JPanel(null);
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
		planet1.setBounds(660,200,576,288);
		planet1.setForeground(Color.BLACK);
		planet1.setFont(new Font("04b", 0, 18));
		pane.add(planet1);
		
		planet2 = new JLabel("Jacali");
		planet2.setBounds(670,400,576,288);
		planet2.setForeground(Color.BLACK);
		planet2.setFont(new Font("04b", 0, 18));
		pane.add(planet2);
		
		taltris = new JButton(imgtaltris);
		taltris.setBounds(650, 200, 120, 120);
		taltris.setBackground(new Color (255,228,181));
		taltris.setFocusable(false);
		pane.add(taltris);
		
		jacali = new JButton(imgjacali);
		jacali.setBounds(650, 400, 120, 120);
		jacali.setBackground(new Color (255,228,181));
		jacali.setFocusable(false);
		pane.add(jacali);
		
		pane.add(bart);
		pane.add(feh);
		pane.add(andrew);
		
		pane.add(background);
		
		container.add(pane);
		
	}

	private void definirEventos() {
		
		taltris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				newGame("", "Taltris");
				
			}
		});
		
		jacali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				newGame("Feh consegue ver naves alienigenas a frente.\n\n"
						+ "   -Cuidado, estamos sendo atacados. Nao deixe nos atingirem.\n\n"
						+ "Diz Feh para Bart.", "Jacali");
				
			}
		});
		
	}
	
	public void newGame(String text, String planet) {
		
		this.planet = planet;
		
		feh1 = new JLabel(imgfeh1);
		feh1.setBounds(650,200,576,288);
		
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
		esquerda.setBackground(new Color (255,228,181));
		esquerda.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				deathPorcentage("Andrew diz.\n\n"
						+ "   -Conseguimos! Achei facil haha.\n\n"
						+ "Bart responde.\n\n"
						+ "   -Concordo haha.\n\n"
						+ "Feh diz gritando.\n\n"
						+ "   -Presta atencao Bart! Vamos bater!\n\n");
				
			}
		});
		
		direita = new JButton("===>");
		direita.setFocusable(false);
		direita.setBounds(320, 300, 100, 40);
		direita.setBackground(new Color (255,228,181));
		direita.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				deathPorcentage("Andrew diz.\n\n"
						+ "   -Conseguimos! Achei facil haha.\n\n"
						+ "Bart responde.\n\n"
						+ "   -Concordo haha.\n\n"
						+ "Feh diz gritando.\n\n"
						+ "   -Presta atencao Bart! Vamos bater!\n\n");
				
				
			}
		});
		
		relogio = new JLabel(imgrelogio);
		relogio.setBounds(400,400,230,205);
		
		timerField = new JTextField("5");
		timerField.setEditable(false);
		timerField.setBorder(null);
		timerField.setOpaque(false);
		timerField.setFont(new Font("04b", 0, 18));
		timerField.setForeground(Color.BLACK);
		timerField.setBounds(500, 300, 20, 20);
		
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
		
		if((int) (Math.random() * 0) == 1) {
			
			gameOver("GAME OVER");
			
		}else {
			
			count++;
		
			timer.cancel();
			timerField.setText("3");
			
			startCountDown();
			
			if(count == 3) {
				
				timer.cancel();
				
				chellangeComplete(text);
				textArea.setOpaque(false);
				
			}
		
		}
		
	}
	
	public void planetaTaltris() {
		
	}
	
	public void planetaJacali() {
		
		bart1 = new JLabel(imgbart1);
		bart1.setBounds(650,100,576,288);
		
		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText("Rumo ao planeta Jacali em sua nave, eles acabam batendo em algo e milagrosamente a nave nao explodiu. Bart preocupado pergunta:"
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
				
				newDialog("Minutos depois eles descobrem que a coisa que eles bateram era uma nave alienigena que estava com seu modo de camuflagem ativo. Eles escutam outro barulho, "
						+ "mas dessa vez e um tipo de *grito*, entao eles resolvem dar uma olhada. Quando chegam no local do grito, avistam uma criatura de pernas longas, com uma cauda "
						+ "larga e aparentemente muito dura, dentes afiados capazes de romper uma liga de metal e olhos com uma fenda no meio. A criatura estava comendo uma pessoa, "
						+ "imediatamente Feh e Andrew perguntam baixinho:\n\n"
						+ "O que e aquilo e quem e a pessoa que ela esta comendo!? \n\n"
						+ "Bart responde.\n\n"
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
				
				newDialog("Minutos depois eles descobrem que a coisa que eles bateram era uma nave alienigena que estava com seu modo de camuflagem ativo. Eles escutam outro barulho, "
						+ "mas dessa vez e um tipo de *grito*, entao eles resolvem dar uma olhada. Quando chegam no local do grito, avistam uma criatura de pernas longas, com uma cauda "
						+ "larga e aparentemente muito dura, dentes afiados capazes de romper uma liga de metal e olhos com uma fenda no meio. A criatura estava comendo uma pessoa, "
						+ "imediatamente Feh e Andrew perguntam baixinho:\n\n"
						+ "O que e aquilo e quem e a pessoa que ela esta comendo!? \n\n"
						+ "Bart responde.\n\n"
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
				
				newDialog("Minutos depois eles descobrem que a coisa que eles bateram era uma nave alienigena que estava com seu modo de camuflagem ativo. Eles escutam outro barulho, "
						+ "mas dessa vez e um tipo de *grito*, entao eles resolvem dar uma olhada. Quando chegam no local do grito, avistam uma criatura de pernas longas, com uma cauda "
						+ "larga e aparentemente muito dura, dentes afiados capazes de romper uma liga de metal e olhos com uma fenda no meio. A criatura estava comendo uma pessoa, "
						+ "imediatamente Feh e Andrew perguntam baixinho:\n\n"
						+ "O que e aquilo e quem e a pessoa que ela esta comendo!? \n\n"
						+ "Bart responde.\n\n"
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
		andrew2.setBounds(700,300,576,288);
		
		feh2 = new JLabel(imgfeh2);
		feh2.setBounds(650,500,576,288);
		
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
		next.setBackground(new Color (255,228,181));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText("   -Corram!\n\n"
						+ "Entao eles correm desesperados, mas a criatura e muito rapida e acaba puxando Andrew pelas pernas. Andrew grita por socorro, mas Bart e Feh ja estao muito longe e nao conseguem escutar. Bart e Feh encontram equipamentos num lugar da nave. Uma Arma de fogo, uma Arma Branca e uma especie de Bomba.\n\n"
						+ "   -Feh, cade o Andrew? \n\n"
						+ "Feh responde:\n\n"
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
		nextStepTwo.setBackground(new Color (255,228,181));
		
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
		bart3.setBounds(150,300,576,288);
		
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
		arma.setBackground(new Color (255,228,181));
		arma.setFocusable(false);
		arma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				weapon("Bart pega a arma de fogo e avista uma porta. Ele tenta atirar, mas a arma emperra.\n\nCom suas maos ligeiras ele tenta arrumar a arma.", "Arrumar");
			}
		});
		
		faca = new JButton(imgknife);
		faca.setBounds(700, 350, 120, 120);
		faca.setBackground(new Color (255,228,181));
		faca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				weapon("Bart decide usar a faca, mas ela esta sem fio.\n\nCom suas maos ligeiras ele tenta amolar a faca.", "Amolar");
			}
		});
		
		bomba = new JButton(imggrenade);
		bomba.setBounds(700, 550, 120, 120);
		bomba.setBackground(new Color (255,228,181));
		bomba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int deathChance = (int) (Math.random() * 2);
				
				if(deathChance == 0) {
					
					gameOver("\n\n\t                  Game Over\n\nBart resolve usar a bomba. Ele tira o pino porem ela explode\nimediatamente em sua mao.");
					
				}else {
					
					gameOver("\n\n\t                  Game Over\n\nBart resolve usar a bomba. Ele joga na criatura e a criatura come, \ndepois joga Feh pra longe, fazendo ele bater a cabeca com forca, \nque comeca a inchar.\n\n"
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
		relogio.setBounds(600,400,230,205);
		
		click = new JButton(action);
		click.setBounds(300, 300, 100, 30);
		click.setBackground(new Color (255,228,181));
		click.setFocusable(false);
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(progressBar.getValue() == 100) {
					
					timer.cancel();
					
					if(action.equals("Arrumar")) {
						
						weaponFixed("Ele atira na porta, a porta abre, mas eles estao no espaco, ou seja, eles sao puxados para fora. Bart consegue ver a criatura explodindo do lado de fora da nave.\n\n"
							+ "   -Parece que voce nao consegue sobreviver 1 segundo fora da sua nave. \n\n"
							+ "Imediatamente Bart perde a consciencia. Horas depois Bart acorda em uma sala com varias pessoas.\n\n"
							+ "   -Onde estou? Quem sao voces?\n\n"
							+ "   -Somos a equipe de resgate, vimos daqui da terra que sua nave ficou inoperante, entao imediatamente fomos ate o local e avistamos voce flutuando no espaco.\n\n"
							+ "Bart se lembra de seus amigos mortos e comeca a chorar. Fim!");
						
					}else if(action.equals("Amolar")) {
						
						gameOver("\n\n\n\n\t                       Game Over\n\nBart resolve usar a faca amolada e avanca para cima da criatura,\nvisando a cabeca. A criatura defende com a calda, "
								+ "mas a mesma e cortada ao meio. \nBart convencido de que ira mata-la, e pego desprevenido, sendo empurrado para longe, \ndepois sua faca e quebrada.\n\n"
								+ "A criatura arranca a cabeca de Feh com seus dentes e parte para cima de Bart.\n\n"
								+ "   -Eu vou matar voce sua criatura feia!");
						
					}
						
		
				}
				progressBar.setValue(progressBar.getValue() + 5);
				
			}
		});
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color (255,215,0));
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
		
		textArea = new JTextArea(message);
		textArea.setBounds(50, 80, 500, 500);
		textArea.setEditable(false);
		textArea.setFont(new Font("04b", 0, 15));
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		
		pane =  new JPanel();
		pane.setOpaque(true);
		pane.setBackground(Color.BLACK);
		
		pane.add(textArea);
		container.removeAll();
		container.add(pane);
		container.validate();
		
	}
	
	public void chellangeComplete(String text) {
		
		andrew1 = new JLabel(imgandrew1);
		andrew1.setBounds(700,100,576,288);
		
		bart2 = new JLabel(imgbart2);
		bart2.setBounds(650,300,576,288);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(text);
		textArea.setFont(new Font("04b", 0, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setBounds(40, 80, 500, 300);
		
		pane =  new JPanel(null);
		pane.setOpaque(true);
		
		next = new JButton("Prosseguir");
		next.setFocusable(false);
		next.setBounds(200, 500, 100, 40);
		next.setBackground(new Color (255,228,181));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(planet.equals("Jacali")) {
					
					planetaJacali();
					
				}else {
					
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
				
				timerField.setText(""+setInterval());
				
				try {
					
					Thread.sleep(500);
					
					if(Integer.parseInt(timerField.getText()) == 0){
						
						gameOver("GAME OVER");
						
					}
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		}, 1000, 1000);
		
		
	}
	
	private final int setInterval() {
		
		if(Integer.parseInt(timerField.getText()) == 1) {
			timer.cancel();
		}
		
		return  Integer.parseInt(timerField.getText()) - 1;
	}
	
	public static void animacao(JTextArea area,String texto) {
		
		String textofinal = "";
		
		for(int i=0; i<texto.length(); i++) {
			
			textofinal = textofinal+texto.charAt(i);
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
		
		animacao(textArea,"Bart e um homem de 25 anos que partiu para uma missao em um novo planeta com seus 2 amigos, Feh e Andrew, para descobrir se o mesmo e habitavel.\n\n"
				+"Escolha o planeta que deseja explorar:");
		
	}
	
}

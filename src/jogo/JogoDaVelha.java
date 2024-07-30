package jogo;
import java.util.Scanner;

public class JogoDaVelha {

	public static void main (String[] Args) {
	
	Campo[][] velha = new Campo [3][3];
	Boolean game = true;
	char simboloAtual='X';
	String vitoria = " ";
	Scanner scan = new Scanner (System.in);
		
	iniciarJogo(velha);
	
	while(game=true) {
		desenhaJogo(velha);
		vitoria = verificarVitoria(velha);
		if (!vitoria.equals("")){
			System.out.printf("Jogador Fulano venceu", vitoria);
			break;
		}
	
	try {
		if(verificarJogada(velha, jogar(scan, simboloAtual), simboloAtual)) {
			if(simboloAtual == 'x') {
				simboloAtual = 'o';
			} else {
				simboloAtual = 'x';
			}
		}
		
		
	}catch(Exception e) {
		System.out.printf("Erro");
	}
}
		System.out.println("Fim");
}	
	
	
	public static void desenhaJogo(Campo[][] velha) {
	
	System.out.print("		0	1	2/n");	
	System.out.printf("0   %c | %c | %c /n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
	System.out.println("	==========");
	System.out.printf("1   %c | %c | %c /n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
	System.out.println("	==========");
	System.out.printf("2   %c | %c | %c /n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
	}
	
	public static void limparTela() {
		for(int cont=0; cont<200; cont++) {
			System.out.println("");
		}
	}
	
	public static boolean verificarJogada (Campo [][] velha, int p[], char simboloAtual) {
		if (velha [p[0]] [p[1]].getSimbolo()==' ') {
			velha [p[0]] [p[1]].setSimbolo(simboloAtual);
			return true;
		} else {
			return false;
		}
	}
	
	public static void iniciarJogo(Campo[][] velha) {
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				velha [l][c] = new Campo();
			}
		}
	}
	
	public static String verificarVitoria (Campo[][] velha) {
		return " ";
	}
	
	public static int[] jogar (Scanner scan, char simboloAtual) {
		int p [] = new int [2];
		System.out.printf("&s %c/n", "Quem joga:", simboloAtual);
		System.out.print("Informe a linha: ");
		p[0] = scan.nextInt();
		System.out.print("Informe a linha:");
		p[1] = scan.nextInt();
		return p;
	}
	
	}
//5) Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
//O número de caracteres da string.
//A string com todas suas letras em maiúsculo.
//O número de vogais da string.
//Se a string digitada começa com “IF” (ignorando maiúsculas/minúsculas).
//Se a string digitada termina com “PR” (ignorando maiúsculas/minúsculas).
//O número de dígitos (0 a 9) da string.
//Se a string é um palíndromo ou não

import java.util.Arrays;
import java.util.Scanner;

public class ManipularString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String palavra = scan.next();
		palavra = palavra.toLowerCase();
		
		//tamanho da palavra
		System.out.println("O tamanho da String é "+palavra.length());
		//todas letras Maiusculas
		System.out.println(palavra.toUpperCase());
		//vogais----------------------------------------------------
		
		int contador = 0;
		char letras[] = palavra.toCharArray();
		
		for(int x=0; x<palavra.length(); x++) {
			if(letras[x] =='a' ||letras[x] =='e' ||letras[x] =='i' ||letras[x] =='o' ||letras[x] =='u') {
				contador++;
			}
		}
		System.out.println("Tem "+contador+" vogais");
		//Começa com IF
		
		if(letras[0] == 'i' && letras[1] == 'f') {
			System.out.println("Sim, começa com IF");
		}
		
		//Termina com PR - arrumar utilizer length e length-1
		if(letras[(letras.length)-2] == 'p' && letras[(letras.length)-1] == 'r') {
			System.out.println("Sim, termina com PR");
		}
		
		//O número de dígitos (0 a 9) da string.
		int cont = 0;
		for(int x=0; x<palavra.length();x++) {
			 if(letras[x]=='0' || letras[x]=='1' || letras[x]=='2' || letras[x]=='3' ||
				letras[x]=='4' || letras[x]=='5' || letras[x]=='6' || 
				letras[x]=='7' || letras[x]=='8' || letras[x]=='9') {
				cont++; 
			 }
		 }
		System.out.println("Existem "+cont+" numeros na String");
		
		//Se a string é um palíndromo ou não.
		char invertido[] = palavra.toCharArray(); 
		if palavara = invertido  

		
	}
}

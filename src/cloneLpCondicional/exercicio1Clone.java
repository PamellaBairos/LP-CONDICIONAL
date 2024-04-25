package cloneLpCondicional;

import java.util.Scanner;

public class exercicio1Clone {
	public static void main(String args[]) {
		/*programa que leia uma senha e repita a mensagem de entrada
		 *  de senha até que seja posta a senha correta*/
		Scanner senha = new Scanner(System.in);
		int senhaCorreta= 2022;
		int senha1;
		do 
		{
			System.out.println("Digite sua senha numerica para que possa acessar:");
			senha1 = senha.nextInt();
			if(senha1!=senhaCorreta) 
			{
				System.out.println("A senha está errada, tente novamente!");
			}
			
		}while(senha1!=senhaCorreta);
		System.out.println("Parebens, senha correta!!!!");
		
		
	}

}

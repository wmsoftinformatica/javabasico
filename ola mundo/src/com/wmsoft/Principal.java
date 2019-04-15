package com.wmsoft;

public class Principal {

	static String olaMundo = "ola mundo!!!";
	static String olaMarte = "ola marte!!!";
	static String olaLua = "ola lua!!!";
	
		
	public static void main(String[] args) {
	
		Auxiliar auxiliar = new Auxiliar();

		auxiliar.exibirMenssagem(olaMundo);
		auxiliar.exibirMenssagem(olaMarte);
		auxiliar.exibirMenssagem(olaLua);

	}

}

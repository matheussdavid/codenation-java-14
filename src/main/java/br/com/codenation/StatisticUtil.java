package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		int soma = 0;
		int media = 0;

		for(int i = 0; i < elements.length ; i++) {

			soma += elements[i];
		}

		media = soma / elements.length;

		return media;
	}

	public static int mode(int[] elements) {
		int contadorInterno = 0;
		int contadorExterno = 0;
		int moda = 0;

		for( int i = 0; i < elements.length ; i++){
			
			contadorInterno = 0;
			
			for (int j = 0; j < elements.length; j++) {

				if (elements[i] == elements[j]){

					contadorInterno += 1;
				}
			}

			if(contadorInterno > contadorExterno){

				contadorExterno = contadorInterno;

				moda  = elements[i];
			}
		}

		return moda;
	}

	public static int median(int[] elements) {
		int mediana = 0;
		int posicao = 0;

		Arrays.sort(elements);

		if ((elements.length % 2) == 0){
			posicao = Math.round(elements.length / 2);
			mediana = ( elements[posicao - 1] + elements[posicao] ) / 2;
		} else {
			posicao = Math.round(elements.length / 2);
			mediana = elements[posicao];
		}

		return mediana;
	}
}
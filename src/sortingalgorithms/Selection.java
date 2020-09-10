package sortingalgorithms;

public class Selection{
	
	public int[] selectionSort(int array[])	
        // pre: array está cheia, todos os elementos são inteiros validos (não nulos)
        // post: array é sorteada em ordem ascendente (do menor ao maior)
	{
		for(int i = array.length - 1; i >= 0; i--) // Começa no fim do Array
		{
			int maiorIndice = i; // (1) Valor padrão do maior elemento do índice.                                                                 
			for(int j = i; j >= 0; j--) // (2) Loop do fim da zona não sorteada para o começo da array
									
			{
				if(array[j] > array[maiorIndice]) // Compara o elemento atual ao maior
					maiorIndice = j; // Se for o maior ele vira o novo maior
			}
			// troca os dois valores
			int temp = array[i];
			array[i] = array[maiorIndice];
			array[maiorIndice] = temp;
		}
		
		return array;
	}

}

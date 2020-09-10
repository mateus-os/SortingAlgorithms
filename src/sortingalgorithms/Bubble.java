package sortingalgorithms;

public class Bubble
{
    public int[] bubbleSort(int[] vetor, int tamanho) 
    {
        int auxVet;
        int i;
        for(i = 0; i<tamanho; i++)
        {
            for(int j = 0; j<tamanho-1; j++)
            {
                if(vetor[j] > vetor[j + 1])
                {
                    auxVet = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = auxVet;
                }
            }
        }
	return vetor;
    }
}

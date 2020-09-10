package sortingalgorithms;

public class Quick
{
    public int[] quickSort(int[] array, int menor, int maior) 
    {
	//Escolhe o pivô
	int meio = menor + (maior - menor) / 2;
	int pivo = array[meio];
 
        //Faz esquerda < do pivô e a direita > do pivô
	int i = menor, j = maior;
	while (i <= j) 
        {
            while (array[i] < pivo) 
            {
                i++;
            }
 
            while (array[j] > pivo) 
            {
                j--;
            }
 
            if (i <= j) 
            {
                int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		i++;
		j--;
            }
	}
        
        //Recursivamente sorteia duas sub partes
	if (menor < j)
        {
            quickSort(array, menor, j);
        }
 
	if (maior > i)
        {
            quickSort(array, i, maior);
	}		
	return array;	
    }
}
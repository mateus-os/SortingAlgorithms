package sortingalgorithms;

import java.util.Random;

public class Vetor 
{	
    private int numeros[];	
    
    public int[] geraVetor(int tamanho)
    {		
        Random r = new Random(); //Instancia a classe Random
        numeros = new int[tamanho]; //Define o tamanho do vetor ao numero fornecido na Tela Principal		
        for (int i = 0; i < tamanho; i++)
        {
            numeros[i] = r.nextInt(1000000); //Preenche o vetor com números aleatórios entre 0 e 1000000
        }
        return numeros; //Retorna o vetor gerado randomicamente
    }
    public void setNumeros(int[] numeros) 
    {
        this.numeros = numeros;
    }        
}

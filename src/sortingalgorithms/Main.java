package sortingalgorithms;

import view.MainView;

public class Main 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MainView tela = new MainView(); //Instancia a classe MainView
        tela.setVisible(true); //Torna o formulário visivel
        tela.setLocationRelativeTo(null); //Faz com que o formulário inicie-se no centro da tela
        tela.setTitle("APS - Sorting Algorithms"); //Muda o título do formulário
    }
}

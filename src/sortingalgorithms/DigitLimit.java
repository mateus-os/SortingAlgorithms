package sortingalgorithms;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class DigitLimit extends PlainDocument{
    
    private int quantidadeMax;
    
    public DigitLimit(int max) {
        super();
        if(max <=0)
            throw new IllegalArgumentException("Especifique a quantidade!");
        quantidadeMax = max;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException{
        if(str==null||getLength()==quantidadeMax)
            return;
        int total=(getLength()+str.length());
        if(total<=quantidadeMax) {
            super.insertString(offset, str.replaceAll("[^0-9]",""), attr);
            return;
        }
        String nova = str.substring(0, getLength()-quantidadeMax);
        super.insertString(offset, nova, attr);
    }
    
}

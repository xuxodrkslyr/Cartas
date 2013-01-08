/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartas;

/**
 *
 * @author xuxo
 */
public class Baraja {
    
    private Carta cartas[];
    private final String Palos[] = {"Picas", "Diamantes", "Treboles", "Corazones"};
    private final String Valores[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k"};
    
    public Baraja()
    {
        cartas = new Carta[52];
        int cont1 = 0;
        int cont2 = 0;
        for(int i = 0; i < cartas.length; i++)
        {
            cartas[i] = new Carta();
            cartas[i].setPalo(Palos[cont1]);
            cartas[i].setNumero(Valores[cont2]);
            cartas[i].setValor();
            cont2++;
            if((i + 1) % 13 == 0)
            {
                cont2 = 0;
                cont1++;
            }
        }
        
    }
    
    public void printBaraja()
    {
        for(Carta carta : this.cartas)
            System.out.println(carta.getPalo() + " de " + carta.getNumero() + " Valor: " + carta.getValor());
    }
}

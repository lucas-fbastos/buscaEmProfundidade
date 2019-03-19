/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import buscas.BuscaEmProfundidade;
import nos.No;

/**
 *
 * @author Lucas
 */
public class Buscas {
    public static void main(String[] args) {
        No no0 = new No(0);
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);
        
        /*montar arvore
              0
            1  2
          3 4  5 6

        */
        no0.setNoEsquerda(no1);
        no0.setNoDireita(no2);
        
        no1.setNoDireita(no3);
        no1.setNoEsquerda(no4);
        
        no2.setNoDireita(no5);
        no2.setNoEsquerda(no6);
        
        //define o item a ser buscado
        BuscaEmProfundidade bep = new BuscaEmProfundidade(4);
        //define a partir de qual no vamos buscar
        bep.buscarResultado(no0);
    }
}

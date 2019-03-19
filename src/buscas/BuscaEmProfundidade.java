/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscas;

import java.util.Stack;
import nos.No;

/**
 *
 * @author Lucas
 */
public class BuscaEmProfundidade {
    private Stack<No> pilhaNos;
    private String textoResposta;
    private int valorBusca;
    
    public BuscaEmProfundidade(int valorBusca){
       this.pilhaNos = new Stack<>();
       this.valorBusca = valorBusca;
    }
    
    private boolean isResultadoBusca(No no){
        return no.getValor()== valorBusca;
    }

    public boolean buscarResultado(No no) {
	if (isResultadoBusca(no)) {
            // Exibir o caminho
                exibirResultadoPaternal(no);
                return true;
        } else {
            // Expandir os próximos nós (esquerda -> direita)
            if (no.getNoDireita() != null) {
		this.pilhaNos.push(no.getNoDireita());
            }
            if (no.getNoEsquerda() != null) { 
		this.pilhaNos.push(no.getNoEsquerda());
            }
	}
	No noPonta = this.pilhaNos.pop();
	if (noPonta != null && buscarResultado(noPonta)) {
            return true;
	}
	return false;
    }
    
    public void exibirResultadoPaternal(No no){
        String retorno = "";
        No noValor = no;
        retorno+= no.getValor();
        
        while(noValor.getNoPai() != null){
            noValor = noValor.getNoPai();
            retorno = noValor.getValor() + " " + retorno; 
        }
        this.textoResposta = retorno;
        System.out.println("O caminho foi: "+ textoResposta + "");
    }
}

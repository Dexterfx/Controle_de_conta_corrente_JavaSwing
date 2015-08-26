/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acg
 */
public class ContaCorrente {
    public Double saldo = 0.0;
    public List<Movimento> movimentos = new ArrayList();
    
    public void depositar(Double valor) {
        Movimento m = new Movimento();
        m.descricao = "Depósito";
        m.valor = valor;
        movimentos.add(m);
        
        saldo+=valor;
        
    }
    
    public void retirar(Double valor) throws Exception {
        if (valor>saldo) {
            throw new Exception("Valor da retirada acima do saldo");
        }
        
        Movimento m = new Movimento();
        m.descricao = "Retirada";
        m.valor = valor*-1;
        movimentos.add(m);
        
        saldo-=valor;
        
    }
    
}

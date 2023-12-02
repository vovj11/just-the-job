package org.acme.servico;

import org.acme.cliente.Cliente;
import org.acme.funcionario.Faxineiro;

import java.util.Date;
import java.util.List;

public class Servico {
    private String local;
    private  double valor;
    private Date data;
    private boolean estadoServico;
    List<Faxineiro> listaFaxineiro;
    Cliente cliente;

    public boolean confirmacaoDeServico(boolean estadoServico){
        return this.estadoServico = estadoServico;
    }

    public double calcularValorServico(){
        return this.valor;
    }
}

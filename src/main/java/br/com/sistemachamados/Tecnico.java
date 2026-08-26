package br.com.sistemachamados;

public class Tecnico extends Usuario {
    public Tecnico(String nome, String email, String departamento) {
        super(nome, email, departamento);
    }

    public void iniciarAtendimento(Chamado chamado) {
        chamado.iniciarAtendimento(this);
    }

    public void resolver(Chamado chamado) {
        chamado.resolver(this);
    }

    public void fechar(Chamado chamado) {
        chamado.fechar(this);
    }

    public void devolverParaFila(Chamado chamado) {
        chamado.devolverParaFila(this);
    }
}
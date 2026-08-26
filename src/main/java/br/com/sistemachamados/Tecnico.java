package br.com.sistemachamados;

public class Tecnico extends Usuario {
    public Tecnico(String nome, String email, String departamento) {
        super(nome, email, departamento);
    }

    public void iniciarAtendimento(Chamado chamado){
        chamado.iniciarAtendimento(this);
    }
}

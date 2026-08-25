package br.com.sistemachamados;

public class Chamado {
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private Status status;

    public Chamado(String titulo, String descricao, Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = Status.ABERTO;
        this.prioridade = prioridade;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void iniciarAtendimento() {
        if (status != Status.ABERTO) {
            throw new IllegalStateException(
                    "O chamado só pode ser iniciado quando está ABERTO"
            );
        }
        status = Status.EM_ANDAMENTO;
    }

    public void resolver() {
        if (status != Status.EM_ANDAMENTO) {
            throw new IllegalStateException(
                    "O chamado só pode ser resolvido quando está EM_ANDAMENTO"
            );
        }
        status = Status.RESOLVIDO;
    }
}

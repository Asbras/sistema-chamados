package br.com.sistemachamados;

public class Chamado {
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private Status status;

    public Chamado(String titulo, String descricao, Prioridade prioridade) {
        if (titulo == null || titulo.isBlank() ) {
            throw new IllegalArgumentException(
                    "O título do chamado não pode estar vazio"
            );
        }
        if (descricao == null || descricao.isBlank() ) {
            throw new IllegalArgumentException(
                    "A descrição do chamado não pode estar vazia"
            );
        }
        if (prioridade == null) {
            throw new IllegalArgumentException(
                    "A prioridade deve ser informada"
            );
        }
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

    public void fechar() {
        if (status != Status.RESOLVIDO) {
            throw new IllegalStateException (
                    "O chamado só pode ser fechado quando estiver em RESOLVIDO"
            );
        }
        status = Status.FECHADO;
    }
}

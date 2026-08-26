package br.com.sistemachamados;

public class Chamado {
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private Status status;
    private Usuario solicitante;
    private Tecnico tecnicoResponsavel;

    public Chamado(Usuario solicitante, String titulo, String descricao, Prioridade prioridade) {
        if (solicitante == null) {
            throw new IllegalArgumentException(
                    "Deve existir um solicitante válido"
            );
        }
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException(
                    "O título do chamado não pode estar vazio"
            );
        }
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException(
                    "A descrição do chamado não pode estar vazia"
            );
        }
        if (prioridade == null) {
            throw new IllegalArgumentException(
                    "A prioridade deve ser informada"
            );
        }
        this.solicitante = solicitante;
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

    public Usuario getSolicitante() {
        return solicitante;
    }

    public Tecnico getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void iniciarAtendimento(Tecnico tecnico) {
        if (tecnico == null) {
            throw new IllegalArgumentException(
                    "O chamado só pode ser iniciado quando há um Tecnico responsável"
            );
        }
        if (status != Status.ABERTO) {
            throw new IllegalStateException(
                    "O chamado só pode ser iniciado quando está ABERTO"
            );
        }
        this.tecnicoResponsavel = tecnico;
        status = Status.EM_ANDAMENTO;
    }

    public void devolverParaFila(Tecnico tecnico){
        if (status != Status.EM_ANDAMENTO) {
            throw new IllegalStateException(
                    "Chamados só podem retornar a fila se estiverem EM_ANDAMENTO"
            );
        }
        if (tecnico != tecnicoResponsavel) {
            throw new IllegalArgumentException(
                    "Somente o técnico responsável pode executar essa função"
            );
        }
        status = Status.ABERTO;
        tecnicoResponsavel = null;
    }

    public void resolver(Tecnico tecnico) {
        if (status != Status.EM_ANDAMENTO) {
            throw new IllegalStateException(
                    "O chamado só pode ser resolvido quando está EM_ANDAMENTO"
            );
        }
        if (tecnico != tecnicoResponsavel) {
            throw new IllegalArgumentException(
                    "Somente o técnico responsável pode executar essa função"
            );
        }
        status = Status.RESOLVIDO;
    }

    public void fechar(Tecnico tecnico) {
        if (status != Status.RESOLVIDO) {
            throw new IllegalStateException(
                    "O chamado só pode ser fechado quando estiver em RESOLVIDO"
            );
        }
        if (tecnico != tecnicoResponsavel) {
            throw new IllegalArgumentException(
                    "Somente o técnico responsável pode executar essa função"
            );
        }
        status = Status.FECHADO;
    }
}
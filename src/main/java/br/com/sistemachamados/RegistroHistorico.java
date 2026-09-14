package br.com.sistemachamados;

import java.time.LocalDateTime;

public class RegistroHistorico {
    private final AcaoChamado acao;
    private final Usuario autor;
    private final LocalDateTime dataHora;

    public RegistroHistorico(AcaoChamado acao, Usuario autor) {
        if (acao == null) {
            throw new IllegalArgumentException("A ação do histórico deve ser informada");
        }
        if (autor == null) {
            throw new IllegalArgumentException("O autor do histórico deve ser informado");
        }
        this.acao = acao;
        this.autor = autor;
        this.dataHora = LocalDateTime.now();
    }

    public AcaoChamado getAcao() {
        return acao;
    }

    public Usuario getAutor() {
        return autor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}

package br.com.sistemachamados;

public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String departamento;

    public Usuario( String nome, String email, String departamento) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException(
                    "O campo de nome nao pode ficar vazio"
            );
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException(
                    "O campo de email nao pode ficar vazio"
            );
        }
        if (departamento == null || departamento.isBlank()) {
            throw new IllegalArgumentException(
                    "O campo de departamento nao pode ficar vazio"
            );
        }
        this.nome = nome;
        this.email = email;
        this.departamento = departamento;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException(
                    "O campo de email nao pode ficar vazio"
            );
        }
        this.email = email;
    }

    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.isBlank()) {
            throw new IllegalArgumentException(
                    "O campo de departamento nao pode ficar vazio"
            );
        }
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void corrigirNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException(
                    "O campo de nome não pode ficar vazio"
            );
        }
        this.nome = nome;
    }
}
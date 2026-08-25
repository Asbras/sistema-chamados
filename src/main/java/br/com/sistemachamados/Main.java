package br.com.sistemachamados;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        System.out.println("Sistema de Chamados de TI");
        System.out.println("--------------------------");
        Usuario usuario = new Usuario("Jonas", "email@gmail.com", "Financeiro");
        Chamado chamado = new Chamado(usuario, "Computador não liga", "Computador do setor financeiro não inicia", Prioridade.ALTA);
        System.out.println("Título: " + chamado.getTitulo());
        System.out.println("Prioridade: " + chamado.getPrioridade());
        System.out.println("Status: " + chamado.getStatus());
        chamado.iniciarAtendimento();
        System.out.println("Status: " + chamado.getStatus());
        try {
            chamado.iniciarAtendimento();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        chamado.resolver();
        System.out.println("Status: " + chamado.getStatus());
        try {
            chamado.resolver();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        chamado.fechar();
        System.out.println("Status: " + chamado.getStatus());
        try {
            chamado.fechar();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Solicitante: " + chamado.getSolicitante().getNome());
    }
}
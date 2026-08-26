package br.com.sistemachamados;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        System.out.println("Sistema de Chamados de TI");
        System.out.println("--------------------------");

        Usuario usuario = new Usuario("Joao", "joao@email.com", "Financeiro");
        Tecnico tecnicoA = new Tecnico("Jesus", "jesus@email.com", "TI");
        Chamado chamado = new Chamado(usuario, "titulo", "descrição", Prioridade.ALTA);
    }
}
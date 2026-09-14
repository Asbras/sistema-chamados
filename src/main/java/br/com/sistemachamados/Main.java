package br.com.sistemachamados;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        System.out.println("Sistema de Chamados de TI");
        System.out.println("--------------------------");

        Usuario usuario = new Usuario("Joao", "joao@email.com", "Financeiro");
        Tecnico tecnicoA = new Tecnico("Jesus", "jesus@email.com", "TI");
        Chamado chamado = new Chamado(usuario, "titulo", "descrição", Prioridade.ALTA);

        chamado.corrigirTitulo("Título corrigido");
        chamado.corrigirDescricao("Descrição corrigida");
        tecnicoA.iniciarAtendimento(chamado);
        tecnicoA.resolver(chamado);
        tecnicoA.fechar(chamado);

        for (RegistroHistorico registro : chamado.getHistorico()) {
            System.out.println(registro.getDataHora() + " - "
                    + registro.getAcao() + " - " + registro.getAutor());
        }
    }
}

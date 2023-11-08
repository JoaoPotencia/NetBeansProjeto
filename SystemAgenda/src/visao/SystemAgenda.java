package visao;

import controle.ContatoControle;
import java.util.Scanner;
import modelo.Contato;

public class SystemAgenda {

    public static void main(String[] args) {
        int op;

        ContatoControle agenda = new ContatoControle();
        Contato jogador = new Contato();
        
        

        while (true) {

            op = imprimirMenu();

            if (op == 0) {
                System.out.println("Saindo do programa! até mais...");
                break;
            }
            
            switch (op) {
                case 1:
                    agenda.cadastrarContato();
                    break;
                 
                case 4:
                    agenda.listarAgendaContato();
                    break;

                case 5:
                    agenda.visualizarAgendaContato();
                    break;
                    
                case 7:
                  String jogadorProcurado = lerPesquisaJogador();
                  
                  if(jogador.getNomeJogador().equals(jogadorProcurado)) {
                      agenda.visualizarAgendaContato();
                  } else {
                      System.out.println("Jogador não encontrado no systemNBA");
                  }
                  
                    break;
            }
        }
    }

    public static int imprimirMenu() {
        int op = -1;

        Scanner ler = new Scanner(System.in);

        System.out.println("...:::  Menu - Agenda :::...");
        System.out.println(""
                + "\t1) Cadastrar\n"    // Digitar todos os atributos da classe modelo criada para cada um
                + "\t2) Editar\n"       // Pesquisar e editar um contato, se ele não existe avisar o usuário com mensagem
                + "\t3) Remover\n"      // Pesquisar e remover um contato, fazer a confirmação da exclusão via msg para o usuário
                + "\t4) Listar\n"       // Listar é mostrar os dois atributos mais relavante da classe de todos os objetos da lista
                + "\t5) Visualizar\n"   // Visualizar é exibir todos os atributos de um contato pesquisado
                + "\t6) Ordenar\n"      // Ordenar // vamos implementar na próxima aula
                + "\t7) Pesquisar\n"    // Pesquisar por um certo contato, ler um nome e pesquisar em toda a lista e depois chamar o visualizar para apresentar os contatos
                + "\t0) Sair");
        System.out.print("Opção-> ");

        op = ler.nextInt();

        return op;
    }
    
    public static String lerPesquisaJogador() {
        Scanner ler = new Scanner(System.in);
        
        String jogadorProcurado = null;
        
        System.out.println("Digite o nome do jogador para a pesquisa: ");
        jogadorProcurado = ler.next();
        
        return jogadorProcurado;
    }
}

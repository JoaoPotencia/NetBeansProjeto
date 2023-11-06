package controle;

import java.util.ArrayList;
import modelo.Contato;

/**
 *
 * @author odams
 */
public class ContatoControle {

    private ArrayList<Contato> agendaContatos = new ArrayList<>();

    public ArrayList<Contato> getAgendaDeContatos() {
        return agendaContatos;
    }

    public void setAgendaDeContatos(ArrayList<Contato> agendaDeContatos) {
        this.agendaContatos = agendaDeContatos;
    }

    public void cadastrarContato() {
        System.out.println("...:::  Cadastrar Contato :::...");
        System.out.println("--------------------------------");

        Contato contato = new Contato();
        contato.lerInformacoesDoJogador();
        agendaContatos.add(contato);

        System.out.println("----------------------------");
    }

    public void listarAgendaContato() {
        System.out.println("...:::  Listar Agenda :::...");
        System.out.println("----------------------------");

        for (int i = 0; i < agendaContatos.size(); i++) {
            Contato contato = agendaContatos.get(i);
            contato.listarContato();
        }

        System.out.println("----------------------------");
    }

    public void visualizarAgendaContato() {
        System.out.println("...:::  Visualizar Agenda :::...");
        System.out.println("----------------------------");

        for (int i = 0; i < agendaContatos.size(); i++) {
            Contato contato = agendaContatos.get(i);
            contato.visualizarContato();
        }

        System.out.println("----------------------------");
    }
}

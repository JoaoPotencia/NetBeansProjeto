package modelo;

import java.util.Scanner;

/**
 *
 * @author joaozin
 */
public class Contato {

    private String timeDoJogador;
    
    private String nomeJogador;
    
    private String titulosDoJogador;
    
    private int idadeJogador;
    
    private char sexo;

  

    public Contato() {
    }

    
    
    public String getTimeDoJogador() {
        return timeDoJogador;
    }

    public void setTimeDoJogador(String timeDoJogador) {
        this.timeDoJogador = timeDoJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getTitulosDoJogador() {
        return titulosDoJogador;
    }

    public void setTitulosDoJogador(String titulosDoJogador) {
        this.titulosDoJogador = titulosDoJogador;
    }

    public int getIdadeJogador() {
        return idadeJogador;
    }

    public void setIdadeJogador(int idadeJogador) {
        this.idadeJogador = idadeJogador;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
    
    
    @Override
    public String toString() {
        return "Contato{" + "timeDoJogador=" + timeDoJogador + ", nomeJogador=" + nomeJogador + ", titulosDoJogador=" + titulosDoJogador + ", idadeJogador=" + idadeJogador + ", sexo=" + sexo + '}';
    }
    
    public void lerInformacoesDoJogador() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Time:");
        this.setTimeDoJogador(ler.next());

        System.out.print("Nome:");
        this.setNomeJogador(ler.next());

        System.out.print("Títulos:");
        this.setTitulosDoJogador(ler.next());

        System.out.print("Idade:");
        this.setIdadeJogador(ler.nextInt());

        System.out.print("Sexo:");
        this.setSexo(ler.next().charAt(0));

    }

    public void visualizarContato() {
        System.out.println("Time do Jogador: " + this.getTimeDoJogador());
        System.out.println("Nome do Jogador: " + this.getNomeJogador());
        System.out.println("Títulos do Jogador: " + this.getTitulosDoJogador());
        System.out.println("Idade do Jogador: " + this.getIdadeJogador());
        System.out.println("Sexo:" + this.getSexo());

        System.out.println();
    }

    public void listarContato() {

        System.out.println("Time: " + this.getTimeDoJogador());
        System.out.println("Nome do Jogador: " + this.getNomeJogador());

        System.out.println();
    }
}

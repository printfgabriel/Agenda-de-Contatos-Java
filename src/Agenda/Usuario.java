package Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    String nome;
    String email;
    ArrayList<Contato> contatos = new ArrayList<>();

    Scanner leitor = new Scanner(System.in);

    public Usuario(String nm, String em){
        setEmail(em);
        setNome(nm);
    }

    public void adicionarContato(){
        System.out.print("Nome: ");
        String saveName = leitor.nextLine();
        System.out.print("Email: ");
        Contato add = new Contato(saveName, leitor.nextLine());

        for (Contato contato : contatos) {
            if (add.getEmail().equals(contato.getEmail())) {
                System.out.println("Email ja existente!");
                return;
            }
        }
        contatos.add(add);
        System.out.println("Contato adicionado!");
    }
    public void buscarContato(){
        System.out.print("Nome: ");
        String saveName = leitor.nextLine();

        for (Contato contato : contatos){
            if (saveName.equals(contato.getNome())){
                System.out.println(contato.toString());
                return;
            }
        }
        System.out.println("Contato nao encontrado");
    }
    public void excluirContato(){
        System.out.print("Email: ");
        String saveEmail = leitor.nextLine();
        for (Contato contato : contatos) {
            if (saveEmail.equals(contato.getEmail())){
                contatos.remove(contato);
                System.out.println("Contato removido!");
                return;
            }
        }
        System.out.println("Contato nao encontrado");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

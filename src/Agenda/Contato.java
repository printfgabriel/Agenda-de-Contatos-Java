package Agenda;

public class Contato {
    String nome;
    String email;
    public Contato(String nm, String em){
        setEmail(em);
        setNome(nm);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", email= " + email;
    }
}

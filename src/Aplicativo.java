
import java.util.ArrayList;
import java.util.Scanner;

import Agenda.Usuario;

public class Aplicativo {

    static  Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add( new Usuario("Gabriel", "gabriel@email.com"));
        Usuario ativo = usuarios.get(0);

        int opcao = 0;

        while (opcao != 4) {
            opcao = menu();
            switch (opcao) {
                case 1: ativo.adicionarContato(); break;
                case 2: ativo.buscarContato(); break;
                case 3: ativo.excluirContato(); break;
                default: break;
            }
        }
    }
    public static int menu(){
        System.out.print("----Agenda----\n");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Buscar Contato(s)");
        System.out.println("3. Remover Contato");
        System.out.println("4. Sair");
        return leitor.nextInt();
    }
}

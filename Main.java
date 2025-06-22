import interfaces.IUsuario;
import proxy.UsuarioProxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IUsuario usuario = new UsuarioProxy();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuário: ");
        String username = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        usuario.login(username, senha);

        scanner.close();
    }
}
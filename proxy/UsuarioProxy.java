package proxy;

import interfaces.IUsuario;
import models.UsuarioReal;

public class UsuarioProxy implements IUsuario {

    private UsuarioReal usuarioReal;
    private final String usuarioCorreto = "admin";
    private final String senhaCorreta = "1234";

    @Override
    public void login(String username, String senha) {
        if (username.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            if (usuarioReal == null) {
                usuarioReal = new UsuarioReal();
            }
            usuarioReal.login(username, senha);
        } else {
            System.out.println("Acesso negado: usuário ou senha incorretos.");
        }
    }
}
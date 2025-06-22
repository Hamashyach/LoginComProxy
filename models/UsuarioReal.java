package models;

import interfaces.IUsuario;

public class UsuarioReal implements IUsuario {

    @Override
    public void login(String username, String senha) {
        System.out.println("[✔] Bem-vindo, " + username + "!");
    }
}
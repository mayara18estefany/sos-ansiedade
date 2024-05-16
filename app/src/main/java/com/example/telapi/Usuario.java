package com.example.telapi;

public class Usuario {
    private String editNome,editEmail,editSenha,editUsuario,editData;

        public Usuario(){
        }

    public String getNome() {
        return editNome;
    }

    public void setNome(String nome) {
        this.editNome = nome;
    }

    public String getEmail() {
        return editEmail;
    }

    public void setEmail(String email) {
        this.editEmail = email;
    }

    public String getSenha() {
        return editSenha;
    }

    public void setSenha(String senha) {
        this.editSenha = senha;
    }

    public String getUsuario() {
        return editUsuario;
    }

    public void setUsuario(String usuario) {
        this.editUsuario = usuario;
    }

    public String getDatadenascimento() {
        return editData;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.editData = datadenascimento;
    }
}

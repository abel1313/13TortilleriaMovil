package com.trece.tortilleriamovil.Modelo;

public class Usuario
{
    private int id_Usuario;
    private String userName;
    private String contraUser;

    public Usuario(int id_Usuario, String userName, String contraUser)
    {
        this.id_Usuario = id_Usuario;
        this.userName = userName;
        this.contraUser = contraUser;
    }
    public Usuario()
    {
        this.id_Usuario = id_Usuario;
        this.userName = userName;
        this.contraUser = contraUser;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContraUser() {
        return contraUser;
    }

    public void setContraUser(String contraUser) {
        this.contraUser = contraUser;
    }
}

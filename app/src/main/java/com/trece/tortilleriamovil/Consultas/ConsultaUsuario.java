package com.trece.tortilleriamovil.Consultas;

import com.trece.tortilleriamovil.Modelo.ConexionDB;
import com.trece.tortilleriamovil.Modelo.Usuario;
import com.trece.tortilleriamovil.ModeloDAO.UsuarioDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaUsuario implements UsuarioDAO
{
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;
    ConexionDB conexion= null;

    @Override
    public Usuario acceder(String usuario, String contra) {
        com.trece.tortilleriamovil.Modelo.Usuario usr = new com.trece.tortilleriamovil.Modelo.Usuario();
        String sqlAcceder = "CALL accede(?, ?)";

        con = conexion.conectarDB();
        try {
            ps = con.prepareStatement(sqlAcceder);
            ps.setString(1,usuario);
            ps.setString(2,contra);
            rs = ps.executeQuery();
            if(rs.next() && rs != null)
            {

                usr.setId_Usuario(rs.getInt(1));
                usr.setUserName(rs.getString(2));
                usr.setContraUser(rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usr;

    }

    @Override
    public boolean agregar() {
        return false;
    }
}

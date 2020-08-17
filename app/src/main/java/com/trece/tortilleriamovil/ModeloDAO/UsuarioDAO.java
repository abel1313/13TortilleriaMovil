package com.trece.tortilleriamovil.ModeloDAO;

import com.trece.tortilleriamovil.CRUD.CRUD;
import com.trece.tortilleriamovil.Modelo.Usuario;

public interface UsuarioDAO extends CRUD <Usuario>
{
    public Usuario acceder(String usuario,String contra);

}
